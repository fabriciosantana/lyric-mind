package com.example.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "songs")
public class Song {

   @Id
   public String id;
   public String title;
   public String artist;
   public String album;
   public String genre;
   public String lyrics;
   public String description;
   public List<String> tags;
   public Integer releaseYear;

   public Song(String title, String artist, String description) {
       this.title = title;
       this.artist = artist;
       this.description = description;
   }
}