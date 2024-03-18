package com.hema.edgeservice1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hema.edgeservice1.model.RigSensor;
import com.hema.edgeservice1.repo.RigSensorRepo;


@Service
public class RigSensorService {

	@Autowired
	private RigSensorRepo rigSensorRepo;
	
	public RigSensor addRigSensor(RigSensor rigSensor) {
		
		return rigSensorRepo.save(rigSensor);
	}


	public List<RigSensor> getAllRigSensor() {
		
		List<RigSensor> result=rigSensorRepo.findAll();
		return result;
	}
	
	public RigSensor getRigSensorById(int id)
	{
		return rigSensorRepo.findById(id).orElse(null);
		
	}
	
	public void deleteRigSensor(int id) {
		if (rigSensorRepo.existsById(id)) {
			rigSensorRepo.deleteById(id);
		}
	}
	

}
