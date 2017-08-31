package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgRoleMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgRoleMstr;


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

public class PgRoleMstrApi {

   @Autowired
   private PgRoleMstrApiService service;
  

  @RequestMapping(value = "/pg_role_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRoleMstr>> findAllPgRoleMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRoleMstr>>(service.findAllPgRoleMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRoleMstr> updatePgRoleMstr(@RequestBody PgRoleMstr pgRoleMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRoleMstr>(service.updatePgRoleMstr(pgRoleMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRoleMstr> addPgRoleMstr(@RequestBody PgRoleMstr pgRoleMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRoleMstr>(service.addPgRoleMstr(pgRoleMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRoleMstr> findByIdPgRoleMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRoleMstr>(service.findByIdPgRoleMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRoleMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRoleMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

