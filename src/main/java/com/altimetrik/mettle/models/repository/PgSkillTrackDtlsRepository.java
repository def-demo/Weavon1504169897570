package com.altimetrik.mettle.models.repository;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.models.PgSkillTrackMstr;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgSkillTrackDtlsRepository extends JpaRepository<PgSkillTrackDtls, Long>{

}



