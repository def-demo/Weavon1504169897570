package com.altimetrik.mettle.models.repository;

import com.altimetrik.mettle.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgRoleMstrRepository extends JpaRepository<PgRoleMstr, Long>{

}



