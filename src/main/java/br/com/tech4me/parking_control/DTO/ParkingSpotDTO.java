package br.com.tech4me.parking_control.DTO;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class ParkingSpotDTO {
    
    // VAGA DE ESTACIONAMETO
    @NotBlank
    private String parkingSpot;

    // PLACA DO CARRO
    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;

    // MARCA DO CARRO
    @NotBlank
    private String brandCar;

    // MODELO DO CARRO
    @NotBlank
    private String modelCar;

    // COR DO  CARRO
    @NotBlank
    private String colorCar;

    // NOME DO RESONSAVEL DO CARRO
    @NotBlank
    private String responsebleName;

    // APARTAMENTO DO DONO(A) DO CARRO
    @NotBlank
    private String apartment;

    // BLOCO DO APARTAMENTO
    @NotBlank
    private String block;

    // GETs and SETs
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
