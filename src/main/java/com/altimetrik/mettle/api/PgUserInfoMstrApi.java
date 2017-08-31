package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgUserInfoMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgUserInfoMstr;


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

public class PgUserInfoMstrApi {

   @Autowired
   private PgUserInfoMstrApiService service;
  

  @RequestMapping(value = "/pg_user_info_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgUserInfoMstr>> findAllPgUserInfoMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgUserInfoMstr>>(service.findAllPgUserInfoMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgUserInfoMstr> updatePgUserInfoMstr(@RequestBody PgUserInfoMstr pgUserInfoMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoMstr>(service.updatePgUserInfoMstr(pgUserInfoMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgUserInfoMstr> addPgUserInfoMstr(@RequestBody PgUserInfoMstr pgUserInfoMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoMstr>(service.addPgUserInfoMstr(pgUserInfoMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgUserInfoMstr> findByIdPgUserInfoMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoMstr>(service.findByIdPgUserInfoMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgUserInfoMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgUserInfoMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

