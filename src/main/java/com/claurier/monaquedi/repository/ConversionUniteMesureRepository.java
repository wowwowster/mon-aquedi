package com.claurier.monaquedi.repository;

import com.claurier.monaquedi.model.ConversionUniteMesure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionUniteMesureRepository extends JpaRepository<ConversionUniteMesure, Long> {

}