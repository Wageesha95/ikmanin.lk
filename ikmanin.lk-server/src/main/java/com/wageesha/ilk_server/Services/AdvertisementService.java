package com.wageesha.ilk_server.Services;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Repositories.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;



public interface AdvertisementService {

    ResponseEntity<List<Advertisement>> getAllAdvertisements(String category);

    ResponseEntity<List<Advertisement>> getAdvertisementsByUserId(String userId);

    ResponseEntity<HttpStatus> deleteAdvertisementsByUserId(String userId);

    ResponseEntity<Advertisement> getAdvertisementById(String id);

    ResponseEntity<Advertisement> updateAdvertisementById(String id, Advertisement advertisement);

    ResponseEntity<Advertisement> createAdvertisement(String userId,Advertisement advertisement);

    ResponseEntity<HttpStatus> deleteAdvertisement(String id);

    ResponseEntity<HttpStatus> deleteAllAdvertisements();
}
