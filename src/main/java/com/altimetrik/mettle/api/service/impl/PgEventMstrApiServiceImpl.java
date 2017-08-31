package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.PgEventMstr;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class PgEventMstrApiServiceImpl implements PgEventMstrApiService {
		  	  
	  @Autowired
	
  	  private PgEventMstrRepository  pgEventMstrRepository ;
	   
  
  
				
			
      @Override
      public List<PgEventMstr> findAllPgEventMstr()
      throws NotFoundException {
      
        
  		
  		
  			return pgEventMstrRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventMstr updatePgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException {
      
         
        	return pgEventMstrRepository.save(pgEventMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventMstr addPgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException {
      
         
        	return pgEventMstrRepository.save(pgEventMstr);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public PgEventMstr findByIdPgEventMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pgEventMstrRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePgEventMstr(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

