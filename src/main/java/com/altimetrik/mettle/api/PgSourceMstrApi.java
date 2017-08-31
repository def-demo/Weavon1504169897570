package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgSourceMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgSourceMstr;


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

public class PgSourceMstrApi {

   @Autowired
   private PgSourceMstrApiService service;
  

  @RequestMapping(value = "/pg_source_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgSourceMstr>> findAllPgSourceMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgSourceMstr>>(service.findAllPgSourceMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_source_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgSourceMstr> updatePgSourceMstr(@RequestBody PgSourceMstr pgSourceMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSourceMstr>(service.updatePgSourceMstr(pgSourceMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_source_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgSourceMstr> addPgSourceMstr(@RequestBody PgSourceMstr pgSourceMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSourceMstr>(service.addPgSourceMstr(pgSourceMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_source_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgSourceMstr> findByIdPgSourceMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSourceMstr>(service.findByIdPgSourceMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_source_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgSourceMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgSourceMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

