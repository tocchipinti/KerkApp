package com.kerkapp.media.service;

import com.kerkapp.media.domain.ImageMetadata;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public ImageMetadata upload() {
        return new ImageMetadata("test", "google.nl", "jpeg");
    }
}
