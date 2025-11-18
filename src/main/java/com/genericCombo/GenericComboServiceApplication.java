package com.genericCombo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.WebApplicationType;

@SpringBootApplication
public class GenericComboServiceApplication extends SpringBootServletInitializer {

    // For WAR deployment: keeps the servlet initializer
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GenericComboServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GenericComboServiceApplication.class);

        // Force Spring Boot to run as a web application (important if you run from IDE)
        app.setWebApplicationType(WebApplicationType.SERVLET);

        app.run(args);
    }
}
