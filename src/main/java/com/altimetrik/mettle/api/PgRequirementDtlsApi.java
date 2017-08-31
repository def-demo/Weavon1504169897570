package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgRequirementDtlsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgRequirementDtls;


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

public class PgRequirementDtlsApi {

   @Autowired
   private PgRequirementDtlsApiService service;
  

  @RequestMapping(value = "/pg_requirement_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRequirementDtls>> findAllPgRequirementDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRequirementDtls>>(service.findAllPgRequirementDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRequirementDtls> updatePgRequirementDtls(@RequestBody PgRequirementDtls pgRequirementDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirementDtls>(service.updatePgRequirementDtls(pgRequirementDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRequirementDtls> addPgRequirementDtls(@RequestBody PgRequirementDtls pgRequirementDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirementDtls>(service.addPgRequirementDtls(pgRequirementDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRequirementDtls> findByIdPgRequirementDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRequirementDtls>(service.findByIdPgRequirementDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_requirement_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRequirementDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRequirementDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

