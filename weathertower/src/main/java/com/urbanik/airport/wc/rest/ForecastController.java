package com.urbanik.airport.wc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by A043142 on 10/13/2016.
 */
@RestController
@RequestMapping("/forecast")
public class ForecastController {

    AtomicInteger counter = new AtomicInteger();

    private static Logger logger = LoggerFactory.getLogger(ForecastController.class);

    @GetMapping(produces = "application/json")
    public Forecast getForecast(){
        String condition;
        logger.info("Checking condition");
        if (counter.incrementAndGet() % 2 == 0){
            condition = "good";
        }else {
            condition = "bad";
        }
        logger.info("Forecast ready");
        return new Forecast(condition);
    }

}
