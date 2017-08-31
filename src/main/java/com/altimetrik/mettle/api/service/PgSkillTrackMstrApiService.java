package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.PgSkillTrackMstr;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface PgSkillTrackMstrApiService {
  
      List<PgSkillTrackMstr> findAllPgSkillTrackMstr()
      throws NotFoundException;
  
      PgSkillTrackMstr updatePgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException;
  
      PgSkillTrackMstr addPgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr)
      throws NotFoundException;
  
      PgSkillTrackMstr findByIdPgSkillTrackMstr(Long id)
      throws NotFoundException;
  
      void deletePgSkillTrackMstr(Long id)
      throws NotFoundException;
  
}

