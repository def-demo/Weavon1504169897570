package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgEventRuleApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgEventRule;


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

public class PgEventRuleApi {

   @Autowired
   private PgEventRuleApiService service;
  

  @RequestMapping(value = "/pg_event_rule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgEventRule>> findAllPgEventRule()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgEventRule>>(service.findAllPgEventRule(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_rule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgEventRule> updatePgEventRule(@RequestBody PgEventRule pgEventRule
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventRule>(service.updatePgEventRule(pgEventRule), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_rule", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgEventRule> addPgEventRule(@RequestBody PgEventRule pgEventRule
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventRule>(service.addPgEventRule(pgEventRule), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_rule/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgEventRule> findByIdPgEventRule(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventRule>(service.findByIdPgEventRule(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_rule/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgEventRule(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgEventRule(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

