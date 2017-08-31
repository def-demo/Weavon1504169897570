package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgUserInfoMstr;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgUserInfoMstrApiServiceImpl implements PgUserInfoMstrApiService {
		  	  
	  @Autowired
	
  	  private PgUserInfoMstrRepository  pgUserInfoMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgUserInfoMstr> findAllPgUserInfoMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgUserInfoMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr updatePgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException {
      
         
        	return pgUserInfoMstrRepository.save(pgUserInfoMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr addPgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException {
      
         
        	return pgUserInfoMstrRepository.save(pgUserInfoMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgUserInfoMstr findByIdPgUserInfoMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgUserInfoMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgUserInfoMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

