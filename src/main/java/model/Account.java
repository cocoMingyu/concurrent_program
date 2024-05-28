package model;

/**
 * @ Author : kn
 * @ Description :
 * @ Date : 2024/5/16 10:11
 */
public class Account {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
