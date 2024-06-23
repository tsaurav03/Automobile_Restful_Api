package com.automobile.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.automobile.custom_exception.ResourceNotFoundEcxeption;
import com.automobile.dtos.ApiResponse;
import com.automobile.entities.User;
import com.automobile.entities.Vehicle;
import com.automobile.repository.UserRepository;
import com.automobile.repository.VehicleRepository;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{
    @Autowired
	private VehicleRepository vehicleRepo;
    
    @Autowired
   private UserRepository userRepo;
    
    @Autowired
    private ModelMapper mapper;
	
	
	@Override
	public ApiResponse addVehicles(Vehicle vehicle) {
		String mesg="Vehicle Registration Failed";
		User user =userRepo.findByUserName(vehicle.getUser().getUserName());
		if(user!=null) {
			vehicle.setUser(user);
			vehicleRepo.save(vehicle);
			mesg="Vehicle Registration Successful";
			
		}
		//else {
		/*	throw new ResourceNotFoundEcxeption(mesg);
			
		}*/
		return new ApiResponse(mesg);
	}

	@Override
	public List<Vehicle> getVehiclesByUserName(String userName) {
       User user=userRepo.findByUserName(userName);
       if(user!=null) {
    	   return vehicleRepo.findByUser(user);
       }
       throw new ResourceNotFoundEcxeption("User name do not exists");
	
	}

	@Override
	public ApiResponse deleteVehicleByUserName(String userName) {
	     String mesg="Vehicle Deletion failed";
	     User user = userRepo.findByUserName(userName);
	     if(user !=null) {
	    	 vehicleRepo.deleteByUser(user);
	    	 mesg="Vehicle Deleted";
	    	 
	     }
	     return new ApiResponse(mesg);
	}

}
