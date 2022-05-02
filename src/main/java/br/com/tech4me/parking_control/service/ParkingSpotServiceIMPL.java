package br.com.tech4me.parking_control.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tech4me.parking_control.model.ParkingSpotModel;
import br.com.tech4me.parking_control.repository.ParkingSpotRepository;

@Service
public class ParkingSpotServiceIMPL implements ParkingSpotService {
    
    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    // POST
    @Override
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    //GET
    @Override
    public Object findAll() {
        return parkingSpotRepository.findAll();
    }

    //GET BY ID
    @Override
    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    // DELETE BY ID
    @Transactional
    @Override
    public void deleteById(UUID id) {
        parkingSpotRepository.deleteById(id);
    }
}
