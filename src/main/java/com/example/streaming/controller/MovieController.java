package com.example.streaming.controller;

import com.example.streaming.movie.Movie;
import com.example.streaming.movie.MovieRepository;
import com.example.streaming.movie.MovieRequestDTO;
import com.example.streaming.movie.MovieResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void newMovie(@RequestBody MovieRequestDTO data) {
        Movie movieData = new Movie(data);
        repository.save(movieData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<MovieResponseDTO> getAll() {
        List<MovieResponseDTO> movieList = repository.findAll().stream().map(MovieResponseDTO::new).toList();
        return movieList;
    }
}
