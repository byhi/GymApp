package hu.byhi.example.gym.core.controller;

import hu.byhi.example.gym.api.GymInfoOperations;
import hu.byhi.example.gym.core.service.GymInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GymInfoController extends GymInfoOperations {

    @Autowired
    private GymInfoService gymInfoService;

    @Override
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<String>(
                gymInfoService.getInfo(),
                HttpStatus.OK);
    }
}
