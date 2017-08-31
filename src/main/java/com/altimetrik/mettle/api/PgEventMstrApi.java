package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgEventMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgEventMstr;


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

public class PgEventMstrApi {

   @Autowired
   private PgEventMstrApiService service;
  

  @RequestMapping(value = "/pg_event_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgEventMstr>> findAllPgEventMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgEventMstr>>(service.findAllPgEventMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgEventMstr> updatePgEventMstr(@RequestBody PgEventMstr pgEventMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventMstr>(service.updatePgEventMstr(pgEventMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgEventMstr> addPgEventMstr(@RequestBody PgEventMstr pgEventMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventMstr>(service.addPgEventMstr(pgEventMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgEventMstr> findByIdPgEventMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventMstr>(service.findByIdPgEventMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgEventMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgEventMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

