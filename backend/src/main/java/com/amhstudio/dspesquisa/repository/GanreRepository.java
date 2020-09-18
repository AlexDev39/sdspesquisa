package com.amhstudio.dspesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amhstudio.dspesquisa.entities.Genre;

@Repository
public interface GanreRepository extends JpaRepository<Genre, Long>{

}
