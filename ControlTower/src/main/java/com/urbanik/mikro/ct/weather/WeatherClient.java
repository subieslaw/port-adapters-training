package com.urbanik.mikro.ct.weather;

import com.urbanik.mikro.ct.rest.Forecast;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by A043142 on 10/13/2016.
 */
@FeignClient(value = "weather",fallback = WeatherClientImpl.class)
public interface WeatherClient {

    @RequestMapping(value = "/forecast",method = RequestMethod.GET)
    Forecast getForecast();

}
