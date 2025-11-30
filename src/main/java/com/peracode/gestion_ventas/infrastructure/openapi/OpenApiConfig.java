package com.peracode.gestion_ventas.infrastructure.openapi;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Value("${app.api.title}")
    private String title;

    @Value("${app.api.description}")
    private String description;

    @Value("${app.api.version}")
    private String version;

    @Value("${app.api.contact.name}")
    private String contactName;

    @Value("${app.api.contact.email}")
    private String contactEmail;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(title)
                        .version(version)
                        .description(description)
                        .contact(new Contact()
                                .name(contactName)
                                .email(contactEmail)));
    }
}