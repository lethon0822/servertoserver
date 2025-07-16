package com.rainbowuniv.servertoserver.weather.model.feignclient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Body {
    private ParentItem items;
}
