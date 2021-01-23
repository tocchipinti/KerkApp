package com.kerkapp.media.repository;

import com.kerkapp.media.config.MinioConfig;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.vavr.control.Try;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
@Slf4j
public class MinioRepositoryImpl implements MinioRepository{

    @Override
    public MinioClient createClient(MinioConfig minioConfig) {
        log.info("Creating MinioClient for url " + minioConfig.getEndpoint());
        return MinioClient.builder()
                .endpoint(minioConfig.getEndpoint())
                .credentials(minioConfig.getAccessKey(), minioConfig.getSecretKey())
                .build();
    }

    @Override
    public Try<Boolean> checkBucket(MinioClient minioClient, String bucketName) {
        return Try.of(() -> minioClient.bucketExists(
                BucketExistsArgs.builder()
                        .bucket(bucketName)
                        .build()));
    }

    @Override
    public Try<Void> createBucket(MinioClient minioClient, String bucketName) {
        return Try.run(() -> minioClient.makeBucket(
                MakeBucketArgs.builder()
                        .bucket(bucketName)
                        .build()));
    }

    @Override
    public Try<Void> upload(MinioClient minioClient, String bucketName, MultipartFile file) {
        return Try.of(() -> minioClient.uploadObject(
                UploadObjectArgs.builder()
                        .bucket(bucketName)
                        .object(file.getName())
                        .filename(file.getOriginalFilename())
                        .contentType(file.getContentType())
                        .build()))
                .flatMap(objectWriteResponse -> Try.success(null));
    }
}
