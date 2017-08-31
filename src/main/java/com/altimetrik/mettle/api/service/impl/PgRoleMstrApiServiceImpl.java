package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgRoleMstr;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgRoleMstrApiServiceImpl implements PgRoleMstrApiService {
		  	  
	  @Autowired
	
  	  private PgRoleMstrRepository  pgRoleMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgRoleMstr> findAllPgRoleMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgRoleMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRoleMstr updatePgRoleMstr(PgRoleMstr pgRoleMstr)
      throws NotFoundException {
      
         
        	return pgRoleMstrRepository.save(pgRoleMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRoleMstr addPgRoleMstr(PgRoleMstr pgRoleMstr)
      throws NotFoundException {
      
         
        	return pgRoleMstrRepository.save(pgRoleMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgRoleMstr findByIdPgRoleMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgRoleMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgRoleMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

