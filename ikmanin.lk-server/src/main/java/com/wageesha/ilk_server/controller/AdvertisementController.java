package com.wageesha.ilk_server.controller;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.Services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
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

    @PostMapping("/advertisement/{user-id}")
    //@PreAuthorize("hasRole('USER')")
    public ResponseEntity<Advertisement> createAdvertisement(@PathVariable("user-id") String userId,@RequestBody Advertisement advertisement) {
        return advertisementService.createAdvertisement(userId,advertisement);
    }

    @DeleteMapping("/{user-id}/advertisements")
    //@PreAuthorize("hasRole('USER')")
    public ResponseEntity<HttpStatus> deleteAdvertisementsByUserId(@PathVariable("user-id") String userId) {
        return advertisementService.deleteAdvertisementsByUserId(userId);
    }

    @GetMapping("/{user-id}/advertisements")
    //@PreAuthorize("hasRole('USER')")
    public ResponseEntity<List<Advertisement>> getAdvertisementsByUserId(@PathVariable("user-id") String userId) {
        return advertisementService.getAdvertisementsByUserId(userId);
    }

    @PutMapping("/advertisement/{id}")
   // @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Advertisement> updateAdvertisementById(@PathVariable("id") String id, @RequestBody Advertisement advertisement) {
        return advertisementService.updateAdvertisementById(id,advertisement);
    }

    @DeleteMapping("/advertisement/{id}")
    public ResponseEntity<HttpStatus> deleteAdvertisementById(@PathVariable("id") String id) {
        return advertisementService.deleteAdvertisement(id);
    }

    @DeleteMapping("/advertisements")
    public ResponseEntity<HttpStatus> deleteAllAdvertisements() {
        return advertisementService.deleteAllAdvertisements();
    }
}