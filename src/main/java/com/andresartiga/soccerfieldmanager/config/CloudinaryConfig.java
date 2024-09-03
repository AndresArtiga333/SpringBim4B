package com.andresartiga.soccerfieldmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;


@Configuration
public class CloudinaryConfig {
    @Bean
    Cloudinary cloudinary(){
        return new CloudinaryConfig(ObjectUtils.asMap(
            "cloud_name", "dvnbl8hrb",
            "api_key", "396738352787499",
            "api_secret", "pjlpOPtv76igM49hJ1hHK6zpd24"

        ));
    }
}
