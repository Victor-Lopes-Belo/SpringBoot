package br.com.tech4me.parking_control.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.parking_control.DTO.ParkingSpotDTO;
import br.com.tech4me.parking_control.model.ParkingSpotModel;
import br.com.tech4me.parking_control.service.ParkingSpotService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/parking-spot")
public class ParkingSpotController {
    
    @Autowired
    private ParkingSpotService parkingSpotService;

    //POST
    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {

        var parkingSpotModel = new ParkingSpotModel();
        
        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        parkingSpotModel = parkingSpotService.save(parkingSpotModel);

        return new ResponseEntity<>(parkingSpotModel,HttpStatus.CREATED);
    }
}
