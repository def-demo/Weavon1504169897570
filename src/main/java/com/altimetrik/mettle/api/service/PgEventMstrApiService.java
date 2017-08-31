package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgEventMstr;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgEventMstrApiService {
  
      List<PgEventMstr> findAllPgEventMstr()
      throws NotFoundException;
  
      PgEventMstr updatePgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException;
  
      PgEventMstr addPgEventMstr(PgEventMstr pgEventMstr)
      throws NotFoundException;
  
      PgEventMstr findByIdPgEventMstr(Long id)
      throws NotFoundException;
  
      void deletePgEventMstr(Long id)
      throws NotFoundException;
  
}

