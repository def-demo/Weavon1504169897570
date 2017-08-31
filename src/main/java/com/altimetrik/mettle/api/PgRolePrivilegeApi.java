package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.PgRolePrivilegeApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.PgRolePrivilege;


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

public class PgRolePrivilegeApi {

   @Autowired
   private PgRolePrivilegeApiService service;
  

  @RequestMapping(value = "/pg_role_privilege", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<PgRolePrivilege>> findAllPgRolePrivilege()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<PgRolePrivilege>>(service.findAllPgRolePrivilege(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_privilege", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< PgRolePrivilege> updatePgRolePrivilege(@RequestBody PgRolePrivilege pgRolePrivilege
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRolePrivilege>(service.updatePgRolePrivilege(pgRolePrivilege), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_privilege", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< PgRolePrivilege> addPgRolePrivilege(@RequestBody PgRolePrivilege pgRolePrivilege
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRolePrivilege>(service.addPgRolePrivilege(pgRolePrivilege), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_privilege/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< PgRolePrivilege> findByIdPgRolePrivilege(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<PgRolePrivilege>(service.findByIdPgRolePrivilege(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/pg_role_privilege/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deletePgRolePrivilege(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deletePgRolePrivilege(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

