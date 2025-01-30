package com.example.streaming.controller;

import com.example.streaming.movie.Movie;
import com.example.streaming.movie.MovieRepository;
import com.example.streaming.movie.MovieResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @GetMapping
    public List<MovieResponseDTO> getAll() {
        List<MovieResponseDTO> movieList = repository.findAll().stream().map(MovieResponseDTO::new).toList();
        return movieList;
    }
}
