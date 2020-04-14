package spring.course.pojos;

import org.springframework.stereotype.Component;
import spring.course.interfaces.Movie;
import spring.course.interfaces.annotations.Drama;

@Component
@Drama
public class DramaMovie implements Movie {

    @Override
    public String genre() {
        return "genre: drama";
    }
}
