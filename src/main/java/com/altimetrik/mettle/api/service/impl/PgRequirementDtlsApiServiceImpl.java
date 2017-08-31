package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgRequirementDtls;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgRequirementDtlsApiServiceImpl implements PgRequirementDtlsApiService {
		  	  
	  @Autowired
	
  	  private PgRequirementDtlsRepository  pgRequirementDtlsRepository ;
	   
  
  
				
			
      @Override
      public List<PgRequirementDtls> findAllPgRequirementDtls()
      throws NotFoundException {
      
        
  		
  		
  			return pgRequirementDtlsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls updatePgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException {
      
         
        	return pgRequirementDtlsRepository.save(pgRequirementDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls addPgRequirementDtls(PgRequirementDtls pgRequirementDtls)
      throws NotFoundException {
      
         
        	return pgRequirementDtlsRepository.save(pgRequirementDtls);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRequirementDtls findByIdPgRequirementDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRequirementDtlsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRequirementDtls(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

