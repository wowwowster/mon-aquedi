package com.claurier.monaquedi.repository;

import com.claurier.monaquedi.model.UniteMesure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UniteMesureRepository extends JpaRepository<UniteMesure, Integer> {

    // TODO @author claurier - A implémenter avec Optional
   UniteMesure findByCdUniteMesureAndCdUniteMesureSchemeAgencyId(String codeSandre, String codeAgence) ;



}