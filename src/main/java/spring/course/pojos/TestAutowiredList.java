package spring.course.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestAutowiredList {

    private List<String> handledStrings;

    private ArrayList<String> strings;

    @Autowired
    public void setHandledStrings(List<String> handledStrings) {
        this.handledStrings = handledStrings;
    }
    @Autowired
    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    @PostConstruct
    public void init(){
        System.out.println("POST CONSTRUCT INVOKE \nTestAutowiredList{" +
                "handledStrings=" + handledStrings +
                ", strings=" + strings +
                '}');
    }

}
