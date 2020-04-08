package spring.course.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.course.pojos.ComplexBean;

@Service
public class TestService {

    private ComplexBean complexBean;

    public TestService() {
    }

    @Autowired
    public void setComplexBean(ComplexBean complexBean) {
        this.complexBean = complexBean;
    }

    public void show(){
        System.out.println(complexBean.toString());
    }
}
