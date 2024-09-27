package com.example.finaltest.service.impl;

import com.example.finaltest.dto.MovieRequest;
import com.example.finaltest.entity.Movie;
import com.example.finaltest.repository.MovieRepository;
import com.example.finaltest.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public String save(MovieRequest request) {
        saveToDB(request);
        return "Success";
    }

    @Override
    public String get(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);

        if(movie.isPresent()) {
            return "Success";
        } else {
            return "Data not found";
        }
    }

    private void saveToDB(MovieRequest request) {
        Movie movie = new Movie();

        movie.setTitle(request.getTitle());
        movie.setGenre(request.getGenre());

        movieRepository.save(movie);

    }
}
