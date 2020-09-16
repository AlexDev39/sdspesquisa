package com.amhstudio.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amhstudio.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
