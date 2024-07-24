package org.daesoo.otel;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OtelApplication {

    public static void main(String[] args) {
//        SpringApplication.run(OtelApplication.class, args);
        SpringApplication app = new SpringApplication(OtelApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
