package com.rainbowuniv.servertoserver.weather;



import com.rainbowuniv.servertoserver.weather.model.WeatherUltraNcstGetReq;
import com.rainbowuniv.servertoserver.weather.model.feignclient.ResponseParent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/ultra_srt_ncst")
    public ResponseParent ultraStrNcst(@ModelAttribute WeatherUltraNcstGetReq req){
        return weatherService.ultraSrtNcst(req);
    }

}
