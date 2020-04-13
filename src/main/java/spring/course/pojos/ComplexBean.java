package spring.course.pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.course.interfaces.CustomBean;

import java.util.Map;

@Component
public class ComplexBean implements CustomBean {

    private Map<String, CustomBean> beans;

    public Map<String, CustomBean> getBeans() {
        return beans;
    }

    @Autowired
    public void setBeans(Map<String, CustomBean> beans) {
        this.beans = beans;
    }

    @Override
    public String showInfo() {
        return beans.toString();
    }

    @Override
    public String toString() {
        return beans.toString();
    }
}
