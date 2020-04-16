package com.wageesha.ilk_server.Services;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.Repositories.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class AdvertisementService {

    @Autowired
    private AdvertisementRepository advertisementRepository;

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

    public ResponseEntity<Advertisement> getAdvertisementById(@PathVariable("id") String id) {

        Optional<Advertisement> advertisementData = advertisementRepository.findById(id);

        if (advertisementData.isPresent()) {
            return new ResponseEntity<>(advertisementData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Advertisement> updateAdvertisementById(@PathVariable("id") String id, @RequestBody Advertisement advertisement) {

        Optional<Advertisement> advertisementData = advertisementRepository.findById(id);

        if (advertisementData.isPresent()) {
            Advertisement _advertisement = advertisementData.get();

            _advertisement.setUserId(advertisement.getUserId());
            _advertisement.setCategory(advertisement.getCategory());
            _advertisement.setDescription(advertisement.getDescription());
            _advertisement.setPhotos(advertisement.getPhotos());
            _advertisement.setPrice(advertisement.getPrice());
            _advertisement.setStatus(advertisement.getStatus());
            _advertisement.setTags(advertisement.getTags());
            Date date = new Date();
            _advertisement.setTimestamp(date.toInstant().toString());
            _advertisement.setItemLocation(advertisement.getItemLocation());

            return new ResponseEntity<>(advertisementRepository.save(_advertisement), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Advertisement> createAdvertisement(@RequestBody Advertisement advertisement) {
        try {
            Date date = new Date();
            Advertisement _advertisement =advertisementRepository.save(new Advertisement(advertisement.getUserId(),advertisement.getCategory(),
                    advertisement.getDescription()));
            return new ResponseEntity<>(_advertisement, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
