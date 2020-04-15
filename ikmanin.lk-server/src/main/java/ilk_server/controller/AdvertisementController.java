package ilk_server.controller;

import ilk_server.DataModels.Advertisement;
import ilk_server.Services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping("/advertisements")
    public ResponseEntity<List<Advertisement>> getAllAdvertisements(@RequestParam(required = false) String category) {
        return advertisementService.getAllAdvertisements(category);
    }

    @GetMapping("/advertisement/{id}")
    public ResponseEntity<Advertisement> getAdvertisementById(@PathVariable("id") String id) {
        return advertisementService.getAdvertisementById(id);
    }

    @PutMapping("/advertisement/{id}")
    public ResponseEntity<Advertisement> updateAdvertisementById(@PathVariable("id") String id, @RequestBody Advertisement advertisement) {
        return advertisementService.updateAdvertisementById(advertisement);
    }
}