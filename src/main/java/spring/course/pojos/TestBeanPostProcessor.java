package spring.course.pojos;


import org.springframework.stereotype.Component;
import spring.course.interfaces.annotations.BPPTest;

import java.util.List;

@Component
public class TestBeanPostProcessor {


    @BPPTest
    public void bpptest(){
        System.out.println("IM PRINTING FROM BEAN POST PROCESSOR");
    }
}
