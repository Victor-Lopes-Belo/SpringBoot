package br.com.tech4me.parking_control.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // POST
    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {

        var parkingSpotModel = new ParkingSpotModel();

        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now());
        parkingSpotModel = parkingSpotService.save(parkingSpotModel);

        return new ResponseEntity<>(parkingSpotModel, HttpStatus.CREATED);
    }

    // GET
    @GetMapping
    public ResponseEntity<List<ParkingSpotModel>> getAllParkingSpot() {
        return new ResponseEntity(parkingSpotService.findAll(), HttpStatus.OK);
    }

    // GET /ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Object>> getIdParkingSpot(@PathVariable UUID id) {

        Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);
        if (parkingSpotOptional.isPresent()) {
            return new ResponseEntity(parkingSpotOptional,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteByIdParkingSpot(@PathVariable UUID id) {

        Optional<ParkingSpotModel> parkingSpotOptional = parkingSpotService.findById(id);

        if (parkingSpotOptional.isPresent()) {
            parkingSpotService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
