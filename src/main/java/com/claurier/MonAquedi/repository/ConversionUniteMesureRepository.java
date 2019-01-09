package com.claurier.MonAquedi.repository;

import com.claurier.MonAquedi.model.ConversionUniteMesure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionUniteMesureRepository extends JpaRepository<ConversionUniteMesure, Long> {

}