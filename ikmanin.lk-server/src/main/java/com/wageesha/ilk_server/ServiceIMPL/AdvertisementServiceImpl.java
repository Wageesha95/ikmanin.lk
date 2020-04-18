package com.wageesha.ilk_server.ServiceIMPL;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.Repositories.AdvertisementRepository;
import com.wageesha.ilk_server.Repositories.UserRepository;
import com.wageesha.ilk_server.Services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementRepository advertisementRepository;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<List<Advertisement>> getAllAdvertisements(String category) {
        try {
            List<Advertisement> advertisements = new ArrayList<Advertisement>();

            if (category == null)
                advertisementRepository.findAll().forEach(advertisements::add);
            else
                advertisementRepository.findByCategoryContaining(category).forEach(advertisements::add);

            if (advertisements.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(advertisements, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Advertisement> getAdvertisementById(String id) {

        Optional<Advertisement> advertisementData = advertisementRepository.findById(id);

        if (advertisementData.isPresent()) {
            return new ResponseEntity<>(advertisementData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Advertisement>> getAdvertisementsByUserId(String userId) {

        try {
            List<Advertisement> advertisements = new ArrayList<Advertisement>();

            advertisementRepository.findByUserId(userId).forEach(advertisements::add);

            if (advertisements.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(advertisements, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    public ResponseEntity<HttpStatus> deleteAdvertisementsByUserId(String userId) {
        try{
            List<Advertisement> advertisements = new ArrayList<Advertisement>();

            advertisementRepository.findByUserId(userId).forEach(advertisements::add);
            advertisementRepository.deleteAll(advertisements);

            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }

    public ResponseEntity<Advertisement> updateAdvertisementById(String id, Advertisement advertisement) {

        Optional<Advertisement> advertisementData = advertisementRepository.findById(id);

        if (advertisementData.isPresent()) {
            Advertisement _advertisement = advertisementData.get();


            _advertisement.setCategory(advertisement.getCategory());
            _advertisement.setBio(advertisement.getBio());
            _advertisement.setPrice(advertisement.getPrice());
            _advertisement.setItemLocation(advertisement.getItemLocation());
            _advertisement.setPhotos(advertisement.getPhotos());
            _advertisement.setTags(advertisement.getTags());
            _advertisement.setCondition(advertisement.getCondition());
            _advertisement.setBrand(advertisement.getBrand());
            _advertisement.setModel(advertisement.getModel());
            _advertisement.setModelYear(advertisement.getModelYear());
            _advertisement.setEngineCapacity(advertisement.getEngineCapacity());
            _advertisement.setMileage(advertisement.getMileage());
            _advertisement.setNegotiability(advertisement.getNegotiability());
            _advertisement.setDescription(advertisement.getDescription());
            _advertisement.setContactName(advertisement.getContactName());
            _advertisement.setPhoneNumber(advertisement.getPhoneNumber());
            _advertisement.setStatus(advertisement.getStatus());
            _advertisement.setLastUpdatedTimestamp(LocalDateTime.now());


            return new ResponseEntity<>(advertisementRepository.save(_advertisement), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Advertisement> createAdvertisement(String userId, Advertisement advertisement) {
        try {

            Advertisement _advertisement = new Advertisement(userId, advertisement.getCategory(),advertisement.getBio(), advertisement.getPrice(),
                    advertisement.getItemLocation(),advertisement.getPhotos(),advertisement.getTags(),advertisement.getCondition(),advertisement.getBrand(),
                    advertisement.getModel(),advertisement.getModelYear(),advertisement.getEngineCapacity(),advertisement.getMileage(),
                    advertisement.getNegotiability(),advertisement.getDescription(), advertisement.getContactName(), advertisement.getPhoneNumber(),advertisement.getStatus(),LocalDateTime.now());

            advertisementRepository.save(_advertisement);
            return new ResponseEntity<>(_advertisement, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<HttpStatus> deleteAdvertisement( String id) {
        try {
            advertisementRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @Override
    public ResponseEntity<HttpStatus> deleteAllAdvertisements() {
        try{
            advertisementRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }

}
