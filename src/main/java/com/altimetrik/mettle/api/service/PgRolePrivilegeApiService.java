package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgRolePrivilege;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgRolePrivilegeApiService {
  
      List<PgRolePrivilege> findAllPgRolePrivilege()
      throws NotFoundException;
  
      PgRolePrivilege updatePgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException;
  
      PgRolePrivilege addPgRolePrivilege(PgRolePrivilege pgRolePrivilege)
      throws NotFoundException;
  
      PgRolePrivilege findByIdPgRolePrivilege(Long id)
      throws NotFoundException;
  
      void deletePgRolePrivilege(Long id)
      throws NotFoundException;
  
}

