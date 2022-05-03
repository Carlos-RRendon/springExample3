package com.FirstServer.App.springairline.configuration;

import com.FirstServer.App.springairline.model.AircraftFleet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAirlineConfiguration {
    @Bean
    public AircraftFleet aircraftFleet(){
        return new AircraftFleet();
    }
}