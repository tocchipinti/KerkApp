package com.kerkapp.media.repository;

import com.kerkapp.media.config.MinioConfig;
import io.minio.MinioClient;
import io.vavr.control.Try;
import org.springframework.web.multipart.MultipartFile;

public interface MinioRepository {
    MinioClient createClient(MinioConfig minioConfig);
    Try<Boolean> checkBucket(MinioClient minioClient, String bucketName);
    Try<Void> createBucket(MinioClient minioClient, String bucketName);
    Try<Void> upload(MinioClient minioClient, String bucketName, MultipartFile file);
}
