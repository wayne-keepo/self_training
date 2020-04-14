package spring.course.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.course.interfaces.Movie;
import spring.course.interfaces.annotations.Action;
import spring.course.interfaces.annotations.Drama;

import java.util.List;

@Service
public class MovieService {


    private List<Movie> actions;

    private List<Movie> drama;

    public MovieService(@Action List<Movie> actions, @Drama List<Movie> drama) {
        this.actions = actions;
        this.drama = drama;
    }

    @Override
    public String toString() {
        return "MovieService{" +
                "actions=" + actions +
                ",\ndrama=" + drama +
                '}';
    }
}
