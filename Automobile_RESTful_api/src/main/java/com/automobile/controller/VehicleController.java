package com.automobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.automobile.entities.Vehicle;
import com.automobile.service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping
	public ResponseEntity<?>addNewVehicle(@RequestBody Vehicle vehicle){
		return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.addVehicles(vehicle));
	}
	
	@GetMapping("/user_vehicles")
	public ResponseEntity<?>getVehicleByUserName(@RequestParam String userName){
		return ResponseEntity.status(HttpStatus.OK).body(vehicleService.getVehiclesByUserName(userName));
	}
	
	@DeleteMapping
	public ResponseEntity<?>deleteVehicleByUserName(@RequestParam String userName){
		return ResponseEntity.status(HttpStatus.OK).body(vehicleService.deleteVehicleByUserName(userName));
	}
	

}
