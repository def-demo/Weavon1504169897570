package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgRuleIdDef;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgRuleIdDefApiService {
  
      List<PgRuleIdDef> findAllPgRuleIdDef()
      throws NotFoundException;
  
      PgRuleIdDef updatePgRuleIdDef(PgRuleIdDef pgRuleIdDef)
      throws NotFoundException;
  
      PgRuleIdDef addPgRuleIdDef(PgRuleIdDef pgRuleIdDef)
      throws NotFoundException;
  
      PgRuleIdDef findByIdPgRuleIdDef(Long id)
      throws NotFoundException;
  
      void deletePgRuleIdDef(Long id)
      throws NotFoundException;
  
}

