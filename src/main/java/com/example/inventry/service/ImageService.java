package com.example.inventry.service;

import com.example.inventry.repo.ImageRepository;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSUploadStream;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.io.InputStream;


@Service
public class ImageService {


    @Autowired
    private GridFSBucket gridFSBucket;

    @Autowired
    private ImageRepository imageRepository;

    public String uploadImage(MultipartFile file) throws IOException {
        // Create GridFS upload stream and save the file
        InputStream inputStream = file.getInputStream();
        GridFSUploadStream uploadStream = gridFSBucket.openUploadStream(file.getOriginalFilename());
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            uploadStream.write(buffer, 0, bytesRead);
        }
        uploadStream.close();

        return "File uploaded successfully!";
    }





    public byte[] getImageById(String id) throws Exception {
        return imageRepository.downloadImage(id);
    }



}

