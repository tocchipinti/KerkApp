package com.kerkapp.media.api;

import com.kerkapp.media.payload.UploadFileResponse;
import com.kerkapp.media.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;

@Slf4j
@RestController
public class ImageUploadController {
    private final ImageService imageService;

    @Autowired
    public ImageUploadController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/images")
    @PreAuthorize("hasRole('USER')")
    public UploadFileResponse uploadFile(@RequestParam("image") MultipartFile file,
                                         @AuthenticationPrincipal Principal principal) {
        var upload = imageService.upload();
        return new UploadFileResponse(upload.getFilename(), upload.getUri(), upload.getFileType());
    }
}
