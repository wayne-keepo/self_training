package spring.course.pojos;

import org.springframework.stereotype.Component;
import spring.course.interfaces.Movie;
import spring.course.interfaces.annotations.Action;

@Component
@Action
public class ActionMovie implements Movie {

    @Override
    public String genre() {
        return "genre: action";
    }
}
