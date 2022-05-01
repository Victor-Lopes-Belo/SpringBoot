package br.com.tech4me.parking_control.service;

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
}
