package com.org.movies.Service;

import com.org.movies.Model.Movie;
import com.org.movies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
