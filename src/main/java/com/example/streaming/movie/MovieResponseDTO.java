package com.example.streaming.movie;

public record MovieResponseDTO(Integer id, String title, String director, Integer year, String genre, String rating, String imageUrl) {
    public MovieResponseDTO(Movie movie) {
        this(movie.getId(), movie.getTitle(), movie.getDirector(), movie.getYear(), movie.getGenre(), movie.getRating(), movie.getImageUrl());
    }
}
