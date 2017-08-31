package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgEventDtls;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgEventDtlsApiService {
  
      List<PgEventDtls> findAllPgEventDtls()
      throws NotFoundException;
  
      PgEventDtls updatePgEventDtls(PgEventDtls pgEventDtls)
      throws NotFoundException;
  
      PgEventDtls addPgEventDtls(PgEventDtls pgEventDtls)
      throws NotFoundException;
  
      PgEventDtls findByIdPgEventDtls(Long id)
      throws NotFoundException;
  
      void deletePgEventDtls(Long id)
      throws NotFoundException;
  
}

