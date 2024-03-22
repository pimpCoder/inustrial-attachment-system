package com.pro.system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileUploadController {

    private static final String UPLOAD_FOLDER = "uploads/";

    @PostMapping("/api/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("files") MultipartFile[] files) {
        List<String> uploadedFiles = new ArrayList<>();
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().body("No file uploaded");
            }
            try {
                byte[] bytes = file.getBytes();
                Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
                Files.write(path, bytes);
                uploadedFiles.add(file.getOriginalFilename());
            } catch (IOException e) {
                return ResponseEntity.status(500).body("Failed to upload " + file.getOriginalFilename() + ": " + e.getMessage());
            }
        }
        return ResponseEntity.ok("Uploaded files: " + uploadedFiles);
    }
}
