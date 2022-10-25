package com.api.parking.control.repositories;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parking.control.models.ParkingSpotModel;

@Repository
//para transações com banco de dados
public interface ParkingSpotRepositorie extends JpaRepository<ParkingSpotModel, UUID> {
	boolean existsByLicensePlateCar(String licensePlateCar);
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	boolean existsByApartmentAndBlock(String apartment, String block);

}
