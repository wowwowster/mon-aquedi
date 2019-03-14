package com.claurier.monaquedi;

import com.claurier.monaquedi.bean.UniteMesureBean;
import com.claurier.monaquedi.model.UniteMesure;
import com.claurier.monaquedi.repository.ConversionUniteMesureRepository;
import com.claurier.monaquedi.repository.UniteMesureRepository;
import com.claurier.monaquedi.service.ConversionUniteMesureService;
import com.claurier.monaquedi.service.UniteMesureService;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
public class ConversionUniteMesureServiceTests {

    UniteMesure metre ;
    UniteMesure centimetre ;
    UniteMesure picometre ;
    UniteMesure kilometre ;
    UniteMesure micrometre ;
    UniteMesure femtometre ;
    UniteMesure nanometre ;
    UniteMesure millimetre;
    UniteMesure decametre;
    UniteMesure hectometre;

    @Autowired
    private UniteMesureService uniteMesureService;

    @Autowired
    private ConversionUniteMesureService conversionUniteMesureService;

    @Autowired
    ConversionUniteMesureRepository conversionUniteMesureRepository;

    @Autowired
    UniteMesureRepository uniteMesureRepository;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        micrometre = uniteMesureService.getUniteMesure(56122);
        millimetre = uniteMesureService.getUniteMesure(56222);
        centimetre = uniteMesureService.getUniteMesure(55723);
        metre = uniteMesureService.getUniteMesure(55887);
        kilometre = uniteMesureService.getUniteMesure(56120);

        picometre = uniteMesureService.getUniteMesure(55851);
        femtometre = uniteMesureService.getUniteMesure(56127);
        nanometre = uniteMesureService.getUniteMesure(56221);
        UniteMesureBean decametreBean = new UniteMesureBean();
        decametreBean.setCodeAgence("SIAAP");
        decametreBean.setCodeSandre("142709012019");
        decametreBean.setStatut("Validé");
        decametreBean.setLibelle("decametre");
        Integer idUniteDecametre = uniteMesureService.save(decametreBean);
        decametre = uniteMesureRepository.findById(idUniteDecametre).get();

        UniteMesureBean hectometreBean = new UniteMesureBean();
        hectometreBean.setCodeAgence("SIAAP");
        hectometreBean.setCodeSandre("142709012020");
        hectometreBean.setStatut("Validé");
        hectometreBean.setLibelle("hectometre");
        Integer idHectometre =uniteMesureService.save(hectometreBean);
        hectometre = uniteMesureRepository.findById(idHectometre).get();

    }
    @Test
    public void contextLoads() {
    }


    @Test
    public void testHowToHandleSQLException() {

    }
}
