package ilk_server.Services;

import ilk_server.DataModels.Advertisement;
import ilk_server.Repositories.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
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

}
