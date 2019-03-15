package com.urbanik.airport.wc;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.urbanik.airport.wc.rest.ForecastController;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Created by A043142 on 10/13/2016.
 */
public class MVCTest {

    @BeforeClass
    public static void prepare(){
        RestAssuredMockMvc.standaloneSetup(new ForecastController());
    }

}