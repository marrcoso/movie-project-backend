package com.example.streaming.movie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "movies")
@Entity(name = "movies")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String director;
    private int year;
    private String genre;
    private int rating;
    private String imageUrl;

    public Movie(MovieRequestDTO data) {
        this.title = data.title();
        this.director = data.director();
        this.year = data.year();
        this.genre = data.genre();
        this.rating = data.rating();
        this.imageUrl = data.imageUrl();
    }
}
