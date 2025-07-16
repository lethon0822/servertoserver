package com.rainbowuniv.servertoserver.weather.model;

import lombok.Getter;
import lombok.Setter;

// 초단기 실황 조회 요청 메세지
@Getter
@Setter
public class KmuUltraSrtNcstReq {
    private String serviceKey;

}
