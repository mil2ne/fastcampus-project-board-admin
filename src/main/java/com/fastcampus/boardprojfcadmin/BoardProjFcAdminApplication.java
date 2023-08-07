package com.fastcampus.boardprojfcadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardProjFcAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardProjFcAdminApplication.class, args);
    }

}
