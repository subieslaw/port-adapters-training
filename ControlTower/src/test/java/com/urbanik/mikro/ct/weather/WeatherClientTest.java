package com.urbanik.mikro.ct.weather;

import com.urbanik.mikro.ct.rest.Forecast;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static  org.assertj.core.api.Assertions.*;
/**
 * Created by A043142 on 10/13/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.urbanik.airport:ws:+:stubs",workOffline = true)
public class WeatherClientTest  {

    @Autowired
    WeatherClient weatherClient;

    @Test
    public void shouldretriveForecast(){
        //when
        Forecast forecast = weatherClient.getForecast();

        //then
        assertThat(forecast.getCondition()).isEqualTo("good");
    }
}