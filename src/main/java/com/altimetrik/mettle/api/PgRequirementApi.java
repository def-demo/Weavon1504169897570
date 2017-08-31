package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgRequirementApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgRequirement;


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

public class PgRequirementApi {

   @Autowired
   private PgRequirementApiService service;
  

  @RequestMapping(value = "/pg_requirement", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRequirement>> findAllPgRequirement()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRequirement>>(service.findAllPgRequirement(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRequirement> updatePgRequirement(@RequestBody PgRequirement pgRequirement
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirement>(service.updatePgRequirement(pgRequirement), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRequirement> addPgRequirement(@RequestBody PgRequirement pgRequirement
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirement>(service.addPgRequirement(pgRequirement), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRequirement> findByIdPgRequirement(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirement>(service.findByIdPgRequirement(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRequirement(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRequirement(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

