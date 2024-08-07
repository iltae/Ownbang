package com.bangguddle.ownbang.global.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;

public interface S3UploaderService {

    String uploadToS3(File uploadFile, String dirName);

    String uploadMultipartFileToS3(MultipartFile multipartFile, String dirName);

    String uploadHlsFiles(Path outputPath, String sessionId);
}
