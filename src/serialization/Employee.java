package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    //private static final long serialVersionUID = 1L;
    int ssn;
    String name;
    int age;
    float salary;

    public Employee() {
    }

    public Employee(int ssn, String name, int age, float salary) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
