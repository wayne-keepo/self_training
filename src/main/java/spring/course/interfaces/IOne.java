package spring.course.interfaces;


import javax.annotation.PostConstruct;

public interface IOne {

    @PostConstruct
    default void printOne(){
        System.out.println("Some printing from IOne interfaces via default methods...");
    }

}
