package com.kerkapp.media.service;

import com.kerkapp.media.config.MinioConfig;
import io.minio.MinioClient;
import io.vavr.control.Either;
import org.springframework.web.multipart.MultipartFile;

public interface MinioService {
    Either<Throwable, MinioClient> createClient(MinioConfig minioConfig);
    Either<Throwable, Boolean> checkBucket(String bucketName);
    Either<Throwable, Void> createBucket(String bucketName);
    Either<Throwable, Void> upload(String bucketName, MultipartFile file);
}
