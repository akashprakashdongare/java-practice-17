package externalization;

import java.io.Serializable;

public class Employee implements Serializable {
    //private static final long serialVersionUID = 1L;
    public String name;
    public int age;
    public float salary;

    public Employee() {
    }

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }  

}
