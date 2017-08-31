package com.altimetrik.mettle.models.repository;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.models.PgPrivilegeMstr;
import com.altimetrik.mettle.models.PgRoleMstr;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgRolePrivilegeRepository extends JpaRepository<PgRolePrivilege, Long>{

}



