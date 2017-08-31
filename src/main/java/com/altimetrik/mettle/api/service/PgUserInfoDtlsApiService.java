package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgUserInfoDtls;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgUserInfoDtlsApiService {
  
      List<PgUserInfoDtls> findAllPgUserInfoDtls()
      throws NotFoundException;
  
      PgUserInfoDtls updatePgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls)
      throws NotFoundException;
  
      PgUserInfoDtls addPgUserInfoDtls(PgUserInfoDtls pgUserInfoDtls)
      throws NotFoundException;
  
      PgUserInfoDtls findByIdPgUserInfoDtls(Long id)
      throws NotFoundException;
  
      void deletePgUserInfoDtls(Long id)
      throws NotFoundException;
  
}

