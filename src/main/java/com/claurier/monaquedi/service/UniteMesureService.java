package com.claurier.monaquedi.service;

import com.claurier.monaquedi.bean.UniteMesureBean;
import com.claurier.monaquedi.enums.StatutUniteMesure;
import com.claurier.monaquedi.exception.ApplicationException;
import com.claurier.monaquedi.model.UniteMesure;
import com.claurier.monaquedi.repository.UniteMesureRepository;
import com.claurier.monaquedi.utils.PostgreDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class UniteMesureService {

    @Autowired
    UniteMesureRepository uniteMesureRepository;

    /**
     * @param id
     * @return
     * @author claurier
     * Méthode appelée par certains controllers qui contiennent beaucoup de code métier, qui devrait être probablement être présent dans un service     *
     */
    public UniteMesure getUniteMesure(Integer id) {
        return uniteMesureRepository.findById(id).get();
    }

    /**
     * On crée une unité de mesure si elle n'existe pas ou on la met à jour si elle existe
     * A différencier des méthodes create et update du service, qui elles, spécifient une seule action possible (création ou maj)
     * et sont plutôt utiles au FrontEnd
     *
     * @param beanToPersist
     */
    // TODO @author claurier - Convertir l'id en Long
    public Integer save(UniteMesureBean beanToPersist) {
        try {
            UniteMesure uniteExists = uniteMesureRepository.findByCdUniteMesureAndCdUniteMesureSchemeAgencyId(beanToPersist.getCodeSandre(), beanToPersist.getCodeAgence());
            if (null != uniteExists) {
                // On maj l'unite de mesure existante plutôt que de créer une nouvelle
                beanToPersist.setId(uniteExists.getUniteMesureId());
            }
            UniteMesure uniteMesureToPersist = convertBeanToUniteMesure(beanToPersist);
            UniteMesure uniteMesurePersisted = uniteMesureRepository.save(uniteMesureToPersist);
            return uniteMesurePersisted.getUniteMesureId();
        } catch (Exception ex) {
            throw new ApplicationException("Erreur de persistance en base", "Erreur de création ou de mise à jour de l'unite de mesure. Détails: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public UniteMesure convertBeanToUniteMesure(UniteMesureBean bean) throws ApplicationException {

        UniteMesure uniteMesure = null;
        String beanCodeSandre = bean.getCodeSandre();
        String beanCodeAgence = bean.getCodeAgence();
        if (bean.getId() != null) {
            uniteMesure = uniteMesureRepository.findById(bean.getId()).get();
        } else uniteMesure = uniteMesureRepository.findByCdUniteMesureAndCdUniteMesureSchemeAgencyId(beanCodeSandre, beanCodeAgence);
        if (null == uniteMesure) {
            uniteMesure = new UniteMesure();
            uniteMesure.setDateCreUniteMesure(PostgreDateUtils.convertLocalDateToPostgreDate(LocalDate.now()));
        }
        uniteMesure.setCdUniteMesure(beanCodeSandre);
        uniteMesure.setCdUniteMesureSchemeAgencyId(beanCodeAgence);
        uniteMesure.setLbUniteMesure(bean.getLibelle());
        uniteMesure.setSymUniteMesure(bean.getSymbole());
        uniteMesure.setDsUniteMesure(bean.getDescription());
        uniteMesure.setStUniteMesure(StatutUniteMesure.findByLibelle(bean.getStatut()).getLibelle());
        uniteMesure.setPivot(bean.getPivot());
        return uniteMesure;
    }
}
