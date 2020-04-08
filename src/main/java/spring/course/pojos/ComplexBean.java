package spring.course.pojos;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ComplexBean {

    private Map<String, SimpleBean> beans;

    public Map<String, SimpleBean> getBeans() {
        return beans;
    }

    @Autowired
    public void setBeans(Map<String, SimpleBean> beans) {
        this.beans = beans;
    }

    @Override
    public String toString() {
        return beans.toString();
    }
}
