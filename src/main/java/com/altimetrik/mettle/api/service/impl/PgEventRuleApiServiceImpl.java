package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgEventRule;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgEventRuleApiServiceImpl implements PgEventRuleApiService {
		  	  
	  @Autowired
	
  	  private PgEventRuleRepository  pgEventRuleRepository ;
	   
  
  
				
			
      @Override
      public List<PgEventRule> findAllPgEventRule()
      throws NotFoundException {
      
        
  		
  		
  			return pgEventRuleRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule updatePgEventRule(PgEventRule pgEventRule)
      throws NotFoundException {
      
         
        	return pgEventRuleRepository.save(pgEventRule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule addPgEventRule(PgEventRule pgEventRule)
      throws NotFoundException {
      
         
        	return pgEventRuleRepository.save(pgEventRule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventRule findByIdPgEventRule(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgEventRuleRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgEventRule(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

