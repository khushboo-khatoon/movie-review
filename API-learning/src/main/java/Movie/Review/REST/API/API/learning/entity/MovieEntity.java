package Movie.Review.REST.API.API.learning.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //it tells This Java class should be mapped to a database table
@Getter
@Setter
@Table(name="movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   private String title;
   private  String genre;
   private Integer releaseYear;
   private Integer rating;

}
