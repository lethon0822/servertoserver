package com.rainbowuniv.servertoserver.config.constants;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "constants.feign-client.kma")
public class ConstKma {
    private String serviceKey;
    private String dataType;

}
