package com.javatechie.vault.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("justice")
public class Credential {

    private String username;
    private String password;
}
