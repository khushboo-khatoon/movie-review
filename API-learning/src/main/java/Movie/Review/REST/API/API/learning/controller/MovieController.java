package Movie.Review.REST.API.API.learning.controller;

import Movie.Review.REST.API.API.learning.entity.MovieEntity;
import Movie.Review.REST.API.API.learning.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository= movieRepository;
    }

    @GetMapping
    public List<MovieEntity> getMovies(){

        return movieRepository.findAll();
    }
    @PostMapping
    public MovieEntity setMovies(@RequestBody MovieEntity movie){
        return movieRepository.save(movie);

    }

}
