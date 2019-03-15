package com.urbanik.mikro.ct.rest;

/**
 * Created by A043142 on 10/13/2016.
 */
public class Forecast {
    private String condition;

    public Forecast(String condition) {
        this.condition = condition;
    }

    public Forecast() {
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
