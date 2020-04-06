package testdata;

import java.util.Objects;

public class Human {
    private String name;
    private int age;

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }


    private String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }


    @Override
    public int hashCode() {
        int result = 7;
        result = 3 * result + age;
        result = 5 * result + (name == null ? 0 : name.hashCode());
        return result;
    }
}
