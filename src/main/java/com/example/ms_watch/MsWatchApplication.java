package com.example.ms_watch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MsWatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWatchApplication.class, args);
    }

}

