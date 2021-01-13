package com.abc.splicingspringbootstater.config;

import com.abc.splicingspringbootstater.Service.SplicingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author zhangfan
 * 自动配置类
 */
@Configuration
@ConditionalOnClass(SplicingService.class)
@EnableConfigurationProperties(SplicingServiceProperties.class)
public class SplicingAutoConfiguration {

    @Resource
    private SplicingServiceProperties properties;

    @Bean
    @ConditionalOnProperty(name = "splicing.service.enabled", havingValue = "true")
    public SplicingService splicingService2() {
        return new SplicingService(properties.getPrefix(), properties.getSuffix());
    }

    @Bean
    @ConditionalOnMissingBean()
    public SplicingService splicingService() {
        return new SplicingService("", "");
    }
}
