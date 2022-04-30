package br.com.tech4me.parking_control.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.parking_control.repository.ParkingSpotRepository;

@Service
public class ParkingSpotServiceIMPL implements ParkingSpotService {
    
    @Autowired
    private ParkingSpotRepository ParkingSpotRepository;
}
