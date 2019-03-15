package com.urbanik.mikro.ct.rest;

import com.urbanik.mikro.ct.weather.WeatherClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/**
 * Created by A043142 on 10/13/2016.
 */
@RestController
@RequestMapping("/tower")
public class ControlTowerController {

    private static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private final WeatherClient weatherClient;

    public ControlTowerController(WeatherClient weatherClient){
        this.weatherClient = weatherClient;
    }

    @GetMapping
    String getDecision(){
        logger.info("Asking for decision");

         Forecast forecast =  weatherClient.getForecast();
        logger.info("Received forecats {}",forecast.getCondition());
        if ("good".equalsIgnoreCase(forecast.getCondition())){
             return "OK";
         }else if ("bad".equalsIgnoreCase(forecast.getCondition())){
             return "NOTOK";
         }else {
            return "WAIT";
        }
    }
}
