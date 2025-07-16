package com.rainbowuniv.servertoserver.weather.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherUltraNcstGetReq {
    private String baseDate;
    private String baseTime;
    private int nx;
    private int ny;
}
