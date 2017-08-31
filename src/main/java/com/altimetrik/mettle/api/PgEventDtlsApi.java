package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgEventDtlsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgEventDtls;


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

public class PgEventDtlsApi {

   @Autowired
   private PgEventDtlsApiService service;
  

  @RequestMapping(value = "/pg_event_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgEventDtls>> findAllPgEventDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgEventDtls>>(service.findAllPgEventDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgEventDtls> updatePgEventDtls(@RequestBody PgEventDtls pgEventDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventDtls>(service.updatePgEventDtls(pgEventDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgEventDtls> addPgEventDtls(@RequestBody PgEventDtls pgEventDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventDtls>(service.addPgEventDtls(pgEventDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgEventDtls> findByIdPgEventDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgEventDtls>(service.findByIdPgEventDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_event_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgEventDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgEventDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

