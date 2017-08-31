package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgRequirement;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgRequirementApiService {
  
      List<PgRequirement> findAllPgRequirement()
      throws NotFoundException;
  
      PgRequirement updatePgRequirement(PgRequirement pgRequirement)
      throws NotFoundException;
  
      PgRequirement addPgRequirement(PgRequirement pgRequirement)
      throws NotFoundException;
  
      PgRequirement findByIdPgRequirement(Long id)
      throws NotFoundException;
  
      void deletePgRequirement(Long id)
      throws NotFoundException;
  
}

