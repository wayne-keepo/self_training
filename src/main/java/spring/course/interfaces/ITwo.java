package spring.course.interfaces;

import javax.annotation.PostConstruct;

public interface ITwo {

    @PostConstruct
    default void printTwo(){
        System.out.println("Some printing from ITwo interfaces via default methods...");
    }
}
