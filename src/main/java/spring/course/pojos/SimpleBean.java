package spring.course.pojos;


import org.springframework.stereotype.Component;
import spring.course.interfaces.CustomBean;

@Component
public class SimpleBean implements CustomBean {
    private int id;
    private String name;
    private boolean fim;

    public SimpleBean() {
    }

    public SimpleBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void init(){
        this.fim = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String showInfo() {
        return String.format("id: %s name: %s fim: %s", String.valueOf(id), name, String.valueOf(fim));
    }

    @Override
    public String toString() {
        return String.format("id: %s name: %s fim: %s", String.valueOf(id), name, String.valueOf(fim));
    }
}
