package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgSkillTrackDtlsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgSkillTrackDtls;


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

public class PgSkillTrackDtlsApi {

   @Autowired
   private PgSkillTrackDtlsApiService service;
  

  @RequestMapping(value = "/pg_skill_track_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgSkillTrackDtls>> findAllPgSkillTrackDtls()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgSkillTrackDtls>>(service.findAllPgSkillTrackDtls(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgSkillTrackDtls> updatePgSkillTrackDtls(@RequestBody PgSkillTrackDtls pgSkillTrackDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackDtls>(service.updatePgSkillTrackDtls(pgSkillTrackDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_dtls", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgSkillTrackDtls> addPgSkillTrackDtls(@RequestBody PgSkillTrackDtls pgSkillTrackDtls
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackDtls>(service.addPgSkillTrackDtls(pgSkillTrackDtls), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgSkillTrackDtls> findByIdPgSkillTrackDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackDtls>(service.findByIdPgSkillTrackDtls(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_dtls/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgSkillTrackDtls(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgSkillTrackDtls(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

