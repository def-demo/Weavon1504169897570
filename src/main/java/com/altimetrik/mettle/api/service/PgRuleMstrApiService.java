package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgRuleMstr;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgRuleMstrApiService {
  
      List<PgRuleMstr> findAllPgRuleMstr()
      throws NotFoundException;
  
      PgRuleMstr updatePgRuleMstr(PgRuleMstr pgRuleMstr)
      throws NotFoundException;
  
      PgRuleMstr addPgRuleMstr(PgRuleMstr pgRuleMstr)
      throws NotFoundException;
  
      PgRuleMstr findByIdPgRuleMstr(Long id)
      throws NotFoundException;
  
      void deletePgRuleMstr(Long id)
      throws NotFoundException;
  
}

