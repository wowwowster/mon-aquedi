package com.claurier.monaquedi;


import com.claurier.monaquedi.bean.UniteMesureBean;
import com.claurier.monaquedi.repository.ConversionUniteMesureRepository;
import com.claurier.monaquedi.repository.UniteMesureRepository;
import com.claurier.monaquedi.service.ConversionUniteMesureService;
import com.claurier.monaquedi.service.UniteMesureService;
import com.claurier.monaquedi.utils.PostgreDateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@Rollback(true)
@WebAppConfiguration
public class PostgreUtilsTests {

    private static final Logger logger = LogManager.getLogger("debug");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;



    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void datesTest() {
        Date dateFormatUn = PostgreDateUtils.convertLocalDateToPostgreDate(LocalDateTime.now());
        /*Long now = System.currentTimeMillis();
        new Date(now)*/
        Date dateFormatDeux = new Date();
        String toto ="";
        Assert.assertNull(toto);
    }


}
