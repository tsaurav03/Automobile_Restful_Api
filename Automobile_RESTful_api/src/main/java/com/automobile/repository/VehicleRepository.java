package com.automobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobile.entities.User;
import com.automobile.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
	List<Vehicle> findByUser(User user);
	void deleteByUser(User user);

}
