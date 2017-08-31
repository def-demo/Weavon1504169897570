package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgUserInfoDtlsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgUserInfoDtls;


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

public class PgUserInfoDtlsApi {

   @Autowired
   private PgUserInfoDtlsApiService service;
  

  @RequestMapping(value = "/pg_user_info_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgUserInfoDtls>> findAllPgUserInfoDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgUserInfoDtls>>(service.findAllPgUserInfoDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgUserInfoDtls> updatePgUserInfoDtls(@RequestBody PgUserInfoDtls pgUserInfoDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoDtls>(service.updatePgUserInfoDtls(pgUserInfoDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgUserInfoDtls> addPgUserInfoDtls(@RequestBody PgUserInfoDtls pgUserInfoDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoDtls>(service.addPgUserInfoDtls(pgUserInfoDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgUserInfoDtls> findByIdPgUserInfoDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgUserInfoDtls>(service.findByIdPgUserInfoDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_user_info_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgUserInfoDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgUserInfoDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

