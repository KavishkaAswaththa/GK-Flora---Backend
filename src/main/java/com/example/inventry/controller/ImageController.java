/*package com.example.inventry.controller;


import com.example.inventry.service.ImageService;
import com.mongodb.client.gridfs.GridFSBucket;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageService imageService;




    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            ObjectId fileId = imageService.uploadImage(file);
            return ResponseEntity.ok("File uploaded successfully with ID: " + fileId.toString());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed!");
        }
    }







    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImage(@PathVariable String id) {
        try {
            byte[] imageData = imageService.getImageById(id);

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "image/jpeg"); // Adjust as per your needs

            return ResponseEntity.ok()
                    .headers(headers)
                    .body(imageData);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
*/