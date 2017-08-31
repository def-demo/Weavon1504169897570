package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgRuleMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgRuleMstr;


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

public class PgRuleMstrApi {

   @Autowired
   private PgRuleMstrApiService service;
  

  @RequestMapping(value = "/pg_rule_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRuleMstr>> findAllPgRuleMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRuleMstr>>(service.findAllPgRuleMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRuleMstr> updatePgRuleMstr(@RequestBody PgRuleMstr pgRuleMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleMstr>(service.updatePgRuleMstr(pgRuleMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRuleMstr> addPgRuleMstr(@RequestBody PgRuleMstr pgRuleMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleMstr>(service.addPgRuleMstr(pgRuleMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRuleMstr> findByIdPgRuleMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRuleMstr>(service.findByIdPgRuleMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_rule_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRuleMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRuleMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

