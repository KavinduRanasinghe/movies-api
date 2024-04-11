package com.org.movies.Service;

import com.org.movies.Model.Movie;
import com.org.movies.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


    public Optional<Movie> getMovieById(String imdbId) {
        return movieRepository.findById(imdbId);
    }
}
