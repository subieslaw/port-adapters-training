package com.urbanik.mikro.ct.weather;

import com.urbanik.mikro.ct.rest.Forecast;
import org.springframework.stereotype.Component;

/**
 * Created by A043142 on 10/13/2016.
 */
@Component
public class WeatherClientImpl implements WeatherClient {
    @Override
    public Forecast getForecast() {
        return new Forecast("unknown");
    }
}
