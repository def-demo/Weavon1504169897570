package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgPrivilegeMstr;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgPrivilegeMstrApiServiceImpl implements PgPrivilegeMstrApiService {
		  	  
	  @Autowired
	
  	  private PgPrivilegeMstrRepository  pgPrivilegeMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgPrivilegeMstr> findAllPgPrivilegeMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgPrivilegeMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr updatePgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException {
      
         
        	return pgPrivilegeMstrRepository.save(pgPrivilegeMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr addPgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr)
      throws NotFoundException {
      
         
        	return pgPrivilegeMstrRepository.save(pgPrivilegeMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgPrivilegeMstr findByIdPgPrivilegeMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgPrivilegeMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgPrivilegeMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

