package com.api.parking.control.services;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.parking.control.models.ParkingSpotModel;
import com.api.parking.control.repositories.ParkingSpotRepositorie;
@Service
public class ParkinSpotService {
	
	final ParkingSpotRepositorie parkingSpotRepositorie;

	public ParkinSpotService(ParkingSpotRepositorie parkingSpotRepositorie) {
		super();
		this.parkingSpotRepositorie = parkingSpotRepositorie;
	}
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepositorie.save(parkingSpotModel);
	}
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepositorie.existsByLicensePlateCar(licensePlateCar);
	}
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		// TODO Auto-generated method stub
		return parkingSpotRepositorie.existsByParkingSpotNumber(parkingSpotNumber);
	}
	public boolean existsByApartmentAndBlock(String apartment, String block) {
		// TODO Auto-generated method stub
		return parkingSpotRepositorie.existsByApartmentAndBlock(apartment, block);
	}
	public List<ParkingSpotModel> findAll() {
		// TODO Auto-generated method stub
		return parkingSpotRepositorie.findAll();
	}
	public Optional<ParkingSpotModel> findById(UUID id) {
		// TODO Auto-generated method stub
		return parkingSpotRepositorie.findById(id);
	}
	public void delete(ParkingSpotModel parkingSpotModel) {
		parkingSpotRepositorie.delete(parkingSpotModel);
	}
	
	
}
