package com.savetravels.savetravels.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savetravels.savetravels.models.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long>  {
 
}