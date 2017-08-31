package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgPrivilegeMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgPrivilegeMstr;


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

public class PgPrivilegeMstrApi {

   @Autowired
   private PgPrivilegeMstrApiService service;
  

  @RequestMapping(value = "/pg_privilege_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgPrivilegeMstr>> findAllPgPrivilegeMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgPrivilegeMstr>>(service.findAllPgPrivilegeMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_privilege_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgPrivilegeMstr> updatePgPrivilegeMstr(@RequestBody PgPrivilegeMstr pgPrivilegeMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgPrivilegeMstr>(service.updatePgPrivilegeMstr(pgPrivilegeMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_privilege_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgPrivilegeMstr> addPgPrivilegeMstr(@RequestBody PgPrivilegeMstr pgPrivilegeMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgPrivilegeMstr>(service.addPgPrivilegeMstr(pgPrivilegeMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_privilege_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgPrivilegeMstr> findByIdPgPrivilegeMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgPrivilegeMstr>(service.findByIdPgPrivilegeMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_privilege_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgPrivilegeMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgPrivilegeMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

