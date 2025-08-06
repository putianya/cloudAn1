package com.hy;

import com.hy.back.DissFallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FallbackfactoryConfig {
    @Bean
    public DissFallback dissFallback(){
        return new DissFallback();
    }
}
