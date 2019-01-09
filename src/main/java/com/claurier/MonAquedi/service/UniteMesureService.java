package com.claurier.MonAquedi.service;

import com.claurier.MonAquedi.model.UniteMesure;

public class UniteMesureService {

    /**
     * @param id
     * @return
     * @author claurier
     * Méthode appelée par certains controllers qui contiennent beaucoup de code métier, qui devrait être probablement être présent dans un service     *
     */
    public UniteMesure getUniteMesure(Integer id) {
        return uniteMesureRepository.findById(id);
    }
}
