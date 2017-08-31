package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgAssessmentLevelApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgAssessmentLevel;


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

public class PgAssessmentLevelApi {

   @Autowired
   private PgAssessmentLevelApiService service;
  

  @RequestMapping(value = "/pg_assessment_level", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgAssessmentLevel>> findAllPgAssessmentLevel()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgAssessmentLevel>>(service.findAllPgAssessmentLevel(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_assessment_level", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgAssessmentLevel> updatePgAssessmentLevel(@RequestBody PgAssessmentLevel pgAssessmentLevel
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAssessmentLevel>(service.updatePgAssessmentLevel(pgAssessmentLevel), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_assessment_level", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgAssessmentLevel> addPgAssessmentLevel(@RequestBody PgAssessmentLevel pgAssessmentLevel
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAssessmentLevel>(service.addPgAssessmentLevel(pgAssessmentLevel), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_assessment_level/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgAssessmentLevel> findByIdPgAssessmentLevel(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgAssessmentLevel>(service.findByIdPgAssessmentLevel(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_assessment_level/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgAssessmentLevel(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgAssessmentLevel(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

