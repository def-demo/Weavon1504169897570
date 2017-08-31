package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgSkillTrackMstrApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgSkillTrackMstr;


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

public class PgSkillTrackMstrApi {

   @Autowired
   private PgSkillTrackMstrApiService service;
  

  @RequestMapping(value = "/pg_skill_track_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgSkillTrackMstr>> findAllPgSkillTrackMstr()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgSkillTrackMstr>>(service.findAllPgSkillTrackMstr(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgSkillTrackMstr> updatePgSkillTrackMstr(@RequestBody PgSkillTrackMstr pgSkillTrackMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackMstr>(service.updatePgSkillTrackMstr(pgSkillTrackMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_mstr", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgSkillTrackMstr> addPgSkillTrackMstr(@RequestBody PgSkillTrackMstr pgSkillTrackMstr
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackMstr>(service.addPgSkillTrackMstr(pgSkillTrackMstr), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgSkillTrackMstr> findByIdPgSkillTrackMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgSkillTrackMstr>(service.findByIdPgSkillTrackMstr(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_skill_track_mstr/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgSkillTrackMstr(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgSkillTrackMstr(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

