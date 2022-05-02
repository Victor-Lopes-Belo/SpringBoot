package br.com.tech4me.parking_control.service;

import java.util.Optional;
import java.util.UUID;

import br.com.tech4me.parking_control.model.ParkingSpotModel;

public interface ParkingSpotService {

    // POST/ PUT
    ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

    // GET
    Object findAll();

    // GET BY ID
    Optional<ParkingSpotModel> findById(UUID id);

    // DELETE BY ID
    void deleteById(UUID id);
    

}
