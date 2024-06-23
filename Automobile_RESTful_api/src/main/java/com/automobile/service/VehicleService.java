package com.automobile.service;

import java.util.List;

import com.automobile.dtos.ApiResponse;
import com.automobile.entities.Vehicle;

public interface VehicleService {
	ApiResponse addVehicles(Vehicle vehicle);
	
	List<Vehicle>getVehiclesByUserName(String userName);
	
	ApiResponse deleteVehicleByUserName(String userName);

}
