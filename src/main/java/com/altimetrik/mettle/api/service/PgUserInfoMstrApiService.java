package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgUserInfoMstr;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgUserInfoMstrApiService {
  
      List<PgUserInfoMstr> findAllPgUserInfoMstr()
      throws NotFoundException;
  
      PgUserInfoMstr updatePgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException;
  
      PgUserInfoMstr addPgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr)
      throws NotFoundException;
  
      PgUserInfoMstr findByIdPgUserInfoMstr(Long id)
      throws NotFoundException;
  
      void deletePgUserInfoMstr(Long id)
      throws NotFoundException;
  
}

