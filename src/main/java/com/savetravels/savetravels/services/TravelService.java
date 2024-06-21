package com.savetravels.savetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savetravels.savetravels.models.Travel;
import com.savetravels.savetravels.repositorys.TravelRepository;

@Service
public class TravelService {
	@Autowired
	private TravelRepository travelRepository;
	
	public Travel save(Travel travel) {
        return travelRepository.save(travel);
    }
	
	  public List<Travel> findAllTravel() {
	        return travelRepository.findAll();
	    }

    public Travel findById(Long id) {
        return travelRepository.findById(id).orElse(null);
    }

    public void updateTravel(Long id, Travel updatedTravel) {
        Travel existingTravel = travelRepository.findById(id).orElseThrow();
        travelRepository.save(existingTravel);
    }

    public void deleteTravel(Long id) {
        travelRepository.deleteById(id);
    }

}
