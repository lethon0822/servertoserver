package com.rainbowuniv.servertoserver.weather;

import com.rainbowuniv.servertoserver.weather.model.feignclient.ResponseParent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="kma"
        , url="${constants.feign-client.kma-url}" )
public interface WeatherFeignClient {
    @GetMapping("/getUltraSrtNcst")
    ResponseParent getUltraSrtNcst(@RequestParam String serviceKey,
                                   @RequestParam String dataType,
                                   @RequestParam("base_date") String baseDate,
                                   @RequestParam("base_time") String baseTime,
                                   @RequestParam("nx") int nx,
                                   @RequestParam("ny") int ny);

}
