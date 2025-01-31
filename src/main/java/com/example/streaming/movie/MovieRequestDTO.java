package com.example.streaming.movie;

public record MovieRequestDTO(String title, String director, Integer year, String genre, Integer rating, String imageUrl) {
}
