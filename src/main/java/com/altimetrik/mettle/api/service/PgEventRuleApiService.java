package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgEventRule;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgEventRuleApiService {
  
      List<PgEventRule> findAllPgEventRule()
      throws NotFoundException;
  
      PgEventRule updatePgEventRule(PgEventRule pgEventRule)
      throws NotFoundException;
  
      PgEventRule addPgEventRule(PgEventRule pgEventRule)
      throws NotFoundException;
  
      PgEventRule findByIdPgEventRule(Long id)
      throws NotFoundException;
  
      void deletePgEventRule(Long id)
      throws NotFoundException;
  
}

