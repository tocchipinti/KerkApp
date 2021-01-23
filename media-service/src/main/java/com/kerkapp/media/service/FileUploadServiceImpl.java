package com.kerkapp.media.service;

import io.vavr.control.Either;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class FileUploadServiceImpl implements FileUploadService{

    private final MinioService minioService;

    @Autowired
    public FileUploadServiceImpl(MinioService minioService) {
        this.minioService = minioService;
    }

    @Override
    public Either<Throwable, Void> uploadToCloud(MultipartFile file) {
        return null;
    }
}
