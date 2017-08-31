package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgAssessmentLevel;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgAssessmentLevelApiServiceImpl implements PgAssessmentLevelApiService {
		  	  
	  @Autowired
	
  	  private PgAssessmentLevelRepository  pgAssessmentLevelRepository ;
	   
  
  
				
			
      @Override
      public List<PgAssessmentLevel> findAllPgAssessmentLevel()
      throws NotFoundException {
      
        
  		
  		
  			return pgAssessmentLevelRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAssessmentLevel updatePgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException {
      
         
        	return pgAssessmentLevelRepository.save(pgAssessmentLevel);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAssessmentLevel addPgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException {
      
         
        	return pgAssessmentLevelRepository.save(pgAssessmentLevel);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgAssessmentLevel findByIdPgAssessmentLevel(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgAssessmentLevelRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgAssessmentLevel(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

