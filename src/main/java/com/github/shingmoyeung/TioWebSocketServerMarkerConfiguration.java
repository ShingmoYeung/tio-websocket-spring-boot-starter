package com.github.shingmoyeung;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Responsible for adding in a marker bean to activate
 * {@link TioWebSocketServerAutoConfiguration}
 * @author fanyuepan
 * */
@Configuration
public class TioWebSocketServerMarkerConfiguration {

    @Bean
    public Marker tioWebSocketServerMarkBean() {
        return new Marker();
    }

    class Marker {
    }
}