package com.altimetrik.mettle.models.repository;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.models.PgSkillTrackDtls;
import com.altimetrik.mettle.models.PgRequirement;
import com.altimetrik.mettle.models.PgAssessmentLevel;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PgRequirementDtlsRepository extends JpaRepository<PgRequirementDtls, Long>{

}



