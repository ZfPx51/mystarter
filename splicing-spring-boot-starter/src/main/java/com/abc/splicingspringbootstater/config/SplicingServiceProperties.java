package com.abc.splicingspringbootstater.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhangfan
 */
@Data
@ConfigurationProperties(prefix = "splicing.service")
public class SplicingServiceProperties {

    private  String prefix;

    private  String suffix;
  }
