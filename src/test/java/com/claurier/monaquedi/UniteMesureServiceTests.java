package com.claurier.monaquedi;


import com.claurier.monaquedi.bean.UniteMesureBean;
import com.claurier.monaquedi.repository.ConversionUniteMesureRepository;
import com.claurier.monaquedi.repository.UniteMesureRepository;
import com.claurier.monaquedi.service.ConversionUniteMesureService;
import com.claurier.monaquedi.service.UniteMesureService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.*;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@Rollback(true)
@WebAppConfiguration
public class UniteMesureServiceTests {

    private static final Logger logger = LogManager.getLogger("debug");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Autowired
    UniteMesureService uniteMesureService;

    @Autowired
    ConversionUniteMesureService conversionUniteMesureService;

    @Autowired
    UniteMesureRepository persistanceUniteMesure;

    @Autowired
    ConversionUniteMesureRepository persistanceConversionUniteMesure;

    UniteMesureBean uniteMesureBeanNotPivot;
    UniteMesureBean uniteMesureBeanPivot;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        uniteMesureBeanNotPivot = new UniteMesureBean();
        uniteMesureBeanNotPivot.setCodeSandre("10411455");
        uniteMesureBeanNotPivot.setCodeAgence("SIAAP");
        uniteMesureBeanNotPivot.setLibelle("nombre par volume filtré (exprimé en Litres)");
        uniteMesureBeanNotPivot.setStatut("Validé");
        uniteMesureBeanNotPivot.setSymbole("g/n/f 1041145104114545");
        uniteMesureBeanNotPivot.setDescription("0949 Biomasse capturée par filet et par \"nuit\" de 12h ");
        uniteMesureBeanNotPivot.setPivot(false);
        //uniteMesureBeanNotPivot = uniteMesureService.create(uniteMesureBeanNotPivot);
        //uniteMesureBeanPivot = uniteMesureBeanNotPivot.copy();
        uniteMesureBeanPivot.setPivot(true);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getUniteMesureFromId() throws Exception {
        String contentAsString = mockMvc.perform(get("/api/v1/referentiels/unites_mesures/55815"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
        Assert.assertFalse(contentAsString.isEmpty());
    }

    @Test
    public void createAndDeleteUniteMesureTest() {

        Integer newId;
        UniteMesureBean beanJustCreated;
        UniteMesureBean uniteMesureBeanToAdd = new UniteMesureBean();
        uniteMesureBeanToAdd.setCodeSandre("10411454");
        uniteMesureBeanToAdd.setCodeAgence("SIAAP");
        uniteMesureBeanToAdd.setLibelle("nombre par volume filtré (exprimé en Litres)");
        uniteMesureBeanToAdd.setStatut("Validé");
        uniteMesureBeanToAdd.setSymbole("g/n/f 10411454");
        uniteMesureBeanToAdd.setDescription("0949 Biomasse capturée par filet et par \"nuit\" de 12h (temps en heure exprimé conventionnellement en nuits par règle de trois sur la base de 12h par nuit).");

    }

    @Test
    public void paginationTest() {
        Integer maxParPage = 25;
        Integer page = 0;

    }

    @Test
    public void getUniteMesurePages() {
        Integer page = 1;
        Integer resultatMaxParPage = 10;

    }

    @Test
    public void creationNouvelleUnitePivot() {
        UniteMesureBean beanJustCreated;
        UniteMesureBean newUniteMesureBean = new UniteMesureBean();
        newUniteMesureBean.setCodeSandre(UUID.randomUUID().toString());
        newUniteMesureBean.setCodeAgence("SIAAP");
        newUniteMesureBean.setLibelle("nombre par volume filtré (exprimé en Litres)");
        newUniteMesureBean.setStatut("Validé");
        newUniteMesureBean.setSymbole(UUID.randomUUID().toString());
        newUniteMesureBean.setDescription("0949 Biomasse capturée par filet et par \"nuit\" de 12");
        newUniteMesureBean.setPivot(true);
        }

    @Test
    public void saveUniteToUniteReference() {
        Integer umUpdatedId = uniteMesureBeanPivot.getId();

    }

    @Test
    public void saveUniteReferenceToUnite() {
        Integer umUpdatedId = uniteMesureBeanPivot.getId();

    }

    @Test
    public void updateUniteToUniteReference() {
        Integer umUpdatedId = uniteMesureBeanPivot.getId();

    }

    @Test
    public void updateUniteReferenceToUnite() {
        Integer umUpdatedId = uniteMesureBeanPivot.getId();

    }
}
