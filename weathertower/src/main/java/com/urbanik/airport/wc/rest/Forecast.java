package com.urbanik.airport.wc.rest;

/**
 * Created by A043142 on 10/13/2016.
 */
public class Forecast {

    private final String condition;

    public String getCondition() {
        return condition;
    }

    public Forecast(String condition) {
        this.condition=condition;
    }
}
