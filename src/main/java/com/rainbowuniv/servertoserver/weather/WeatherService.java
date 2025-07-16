package com.rainbowuniv.servertoserver.weather;


import com.rainbowuniv.servertoserver.weather.model.WeatherUltraNcstGetReq;
import com.rainbowuniv.servertoserver.weather.model.feignclient.ResponseParent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherFeignClient weatherFeignClient;

    public ResponseParent ultraSrtNcst(WeatherUltraNcstGetReq req) {
        String serviceKey = "fte7et4WjQ2QQTSP51SJ6VZ%2FXA3aDUYv054aZFUsGdrVOKFJxQnmrKJGh%2Box%2FcnwsvpeJmLazXr4je1K01Uoow%3D%3D";
        String dataType = "json";
        String baseDate = "20250715";
        String baseTime = "1500";
        int nx = 89;
        int ny = 91;

        // 로직 (데이터베이스에 들어가는)

        return weatherFeignClient.getUltraSrtNcst(serviceKey, dataType, req.getBaseDate(), req.getBaseTime(), req.getNx(), req.getNy());
    }
}
