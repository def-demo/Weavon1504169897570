package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgAssessmentLevel;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgAssessmentLevelApiService {
  
      List<PgAssessmentLevel> findAllPgAssessmentLevel()
      throws NotFoundException;
  
      PgAssessmentLevel updatePgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException;
  
      PgAssessmentLevel addPgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel)
      throws NotFoundException;
  
      PgAssessmentLevel findByIdPgAssessmentLevel(Long id)
      throws NotFoundException;
  
      void deletePgAssessmentLevel(Long id)
      throws NotFoundException;
  
}

