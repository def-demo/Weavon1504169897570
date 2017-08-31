package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgRuleMstr;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgRuleMstrApiServiceImpl implements PgRuleMstrApiService {
		  	  
	  @Autowired
	
  	  private PgRuleMstrRepository  pgRuleMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgRuleMstr> findAllPgRuleMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgRuleMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleMstr updatePgRuleMstr(PgRuleMstr pgRuleMstr)
      throws NotFoundException {
      
         
        	return pgRuleMstrRepository.save(pgRuleMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleMstr addPgRuleMstr(PgRuleMstr pgRuleMstr)
      throws NotFoundException {
      
         
        	return pgRuleMstrRepository.save(pgRuleMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRuleMstr findByIdPgRuleMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRuleMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRuleMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

