package com.airbnb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application entry point for Airbnb Backend System.
 * 
 * This class serves as the bootstrap class for the Airbnb Recommendation System backend.
 * It enables auto-configuration and component scanning for the application.
 */
@SpringBootApplication
public class AirbnbBackendApplication {

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AirbnbBackendApplication.class, args);
    }
}
