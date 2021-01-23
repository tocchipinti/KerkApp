package com.kerkapp.media.service;

import io.vavr.control.Either;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    Either<Throwable, Void> uploadToCloud(MultipartFile file);
}
