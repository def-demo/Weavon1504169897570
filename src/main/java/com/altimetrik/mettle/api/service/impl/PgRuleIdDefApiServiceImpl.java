package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgRuleIdDef;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgRuleIdDefApiServiceImpl implements PgRuleIdDefApiService {
		  	  
	  @Autowired
	
  	  private PgRuleIdDefRepository  pgRuleIdDefRepository ;
	   
  
  
				
			
      @Override
      public List<PgRuleIdDef> findAllPgRuleIdDef()
      throws NotFoundException {
      
        
  		
  		
  			return pgRuleIdDefRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleIdDef updatePgRuleIdDef(PgRuleIdDef pgRuleIdDef)
      throws NotFoundException {
      
         
        	return pgRuleIdDefRepository.save(pgRuleIdDef);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleIdDef addPgRuleIdDef(PgRuleIdDef pgRuleIdDef)
      throws NotFoundException {
      
         
        	return pgRuleIdDefRepository.save(pgRuleIdDef);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleIdDef findByIdPgRuleIdDef(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRuleIdDefRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRuleIdDef(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

