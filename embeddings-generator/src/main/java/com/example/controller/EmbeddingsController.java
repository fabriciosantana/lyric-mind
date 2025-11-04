package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.dto.BulkSongRequest;
import com.example.model.dto.BulkSongResponse;
import com.example.service.SongEmbeddingService;

@RestController
@RequestMapping("/api/lyricmind/v1/embeddings")
public class EmbeddingsController {

   @Autowired
   SongEmbeddingService songEmbeddingService;

   @PostMapping("/bulk-songs")
   ResponseEntity<BulkSongResponse> createEmbeddingFromBulkSong(@RequestBody BulkSongRequest request){
       return new ResponseEntity<>(songEmbeddingService.createEmbeddingFromBulkSong(request), HttpStatus.CREATED);
   }

}
