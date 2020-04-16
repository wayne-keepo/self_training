package spring.course.pojos;

import org.springframework.stereotype.Component;
import spring.course.interfaces.IOne;
import spring.course.interfaces.ITwo;

import javax.annotation.PostConstruct;

@Component
public class CheckSpringFromDefaultMethodsSecond implements IOne, ITwo {

    @PostConstruct
    public void init(){
        System.out.println("Printing @PostConstruct from "+this.getClass());
    }
}
