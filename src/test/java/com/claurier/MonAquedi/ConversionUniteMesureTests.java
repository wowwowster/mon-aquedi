package com.claurier.MonAquedi;

import com.claurier.MonAquedi.model.UniteMesure;
import com.claurier.MonAquedi.repository.ConversionUniteMesureRepository;
import com.claurier.MonAquedi.repository.UserRepository;
import com.claurier.MonAquedi.service.ConversionUniteMesureService;
import org.junit.Before;
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
public class ConversionUniteMesureTests {

    UniteMesure metre ;
    UniteMesure centimetre ;
    UniteMesure picometre ;
    UniteMesure kilometre ;
    UniteMesure micrometre ;
    UniteMesure femtometre ;
    UniteMesure nanometre ;
    UniteMesure millimetre;

    @Autowired
    private ConversionUniteMesureRepository conversionUniteMesurerRepository;

    @Autowired
    private ConversionUniteMesureService conversionUniteMesureService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        metre = conversionUniteMesureService.getUniteMesure(55887);
        centimetre = conversionUniteMesureService.getUniteMesure(55723);
        picometre = conversionUniteMesureService.getUniteMesure(55851);
        kilometre = conversionUniteMesureService.getUniteMesure(56120);
        micrometre = conversionUniteMesureService.getUniteMesure(56122);
        femtometre = conversionUniteMesureService.getUniteMesure(56127);
        nanometre = conversionUniteMesureService.getUniteMesure(56221);
        millimetre = conversionUniteMesureService.getUniteMesure(56222);
    }

    @Test
    public void contextLoads() {
    }


    @Test
    public void testHowToHandleSQLException() {

    }

}
