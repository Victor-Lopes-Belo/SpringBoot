package br.com.tech4me.parking_control.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    // VAGA DE ESTACIONAMETO
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpot;

    // PLACA DO CARRO
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    // MARCA DO CARRO
    @Column(nullable = false, length = 70)
    private String brandCar;

    // MODELO DO CARRO
    @Column(nullable = false, length = 70)
    private String modelCar;

    // COR DO  CARRO
    @Column(nullable = false, length = 70)
    private String colorCar;

    // DATA DE REGISTRAMENTO DO CARRO NO CONDOMINIO*
    @Column(nullable = false, unique = true)
    private LocalDateTime registrationDate;

    // NOME DO RESONSAVEL DO CARRO
    @Column(nullable = false, length = 130)
    private String responsebleName;

    // APARTAMENTO DO DONO(A) DO CARRO
    @Column(nullable = false, length = 30)
    private String apartment;

    // BLOCO DO APARTAMENTO
    @Column(nullable = false, length = 30)
    private String block;

    // GETs and SETs
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsebleName() {
        return responsebleName;
    }

    public void setResponsebleName(String responsebleName) {
        this.responsebleName = responsebleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
