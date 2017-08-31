package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgLifecycleManagementApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgLifecycleManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class PgLifecycleManagementApi {

   @Autowired
   private PgLifecycleManagementApiService service;
  

  @RequestMapping(value = "/pg_lifecycle_management", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgLifecycleManagement>> findAllPgLifecycleManagement()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgLifecycleManagement>>(service.findAllPgLifecycleManagement(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_lifecycle_management", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgLifecycleManagement> updatePgLifecycleManagement(@RequestBody PgLifecycleManagement pgLifecycleManagement
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgLifecycleManagement>(service.updatePgLifecycleManagement(pgLifecycleManagement), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_lifecycle_management", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgLifecycleManagement> addPgLifecycleManagement(@RequestBody PgLifecycleManagement pgLifecycleManagement
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgLifecycleManagement>(service.addPgLifecycleManagement(pgLifecycleManagement), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_lifecycle_management/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgLifecycleManagement> findByIdPgLifecycleManagement(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgLifecycleManagement>(service.findByIdPgLifecycleManagement(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_lifecycle_management/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgLifecycleManagement(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgLifecycleManagement(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

