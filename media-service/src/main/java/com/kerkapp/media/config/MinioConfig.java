package com.kerkapp.media.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class MinioConfig {

    @Value("${minio.uri}")
    private String endpoint;

    @Value("${access-key}")
    private String accessKey;

    @Value("${secret-key}")
    private String secretKey;
}
