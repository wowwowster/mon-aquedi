package com.claurier.monaquedi.service;

import com.claurier.monaquedi.Constante.CodeAgence;
import com.claurier.monaquedi.bean.UniteMesureBean;
import com.claurier.monaquedi.enums.StatutUniteMesure;
import com.claurier.monaquedi.exception.ApplicationException;
import com.claurier.monaquedi.model.ConversionUniteMesure;
import com.claurier.monaquedi.model.UniteMesure;
import com.claurier.monaquedi.repository.UniteMesureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ConversionUniteMesureService {

    @Autowired
    private UniteMesureRepository uniteMesureRepository;

    public UniteMesureBean create(UniteMesureBean bean) throws ApplicationException {
        UniteMesureBean umBean=null;

        bean.setStatut(StatutUniteMesure.VALIDE.getLibelle());
        bean.setCodeAgence(CodeAgence.SIAAP.getLibelle());
        //contrôle du symbole


        return umBean;

    }

}
