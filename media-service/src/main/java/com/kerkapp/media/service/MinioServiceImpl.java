package com.kerkapp.media.service;

import com.kerkapp.media.config.MinioConfig;
import io.minio.MinioClient;
import io.vavr.control.Either;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class MinioServiceImpl implements MinioService{
    @Override
    public Either<Throwable, MinioClient> createClient(MinioConfig minioConfig) {
        return null;
    }

    @Override
    public Either<Throwable, Boolean> checkBucket(String bucketName) {
        return null;
    }

    @Override
    public Either<Throwable, Void> createBucket(String bucketName) {
        return null;
    }

    @Override
    public Either<Throwable, Void> upload(String bucketName, MultipartFile file) {
        return null;
    }
}
