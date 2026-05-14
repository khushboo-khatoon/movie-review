package Movie.Review.REST.API.API.learning.repository;

import Movie.Review.REST.API.API.learning.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {


}
