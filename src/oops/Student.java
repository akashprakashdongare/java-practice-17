package oops;

public class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // default/non-parameterize constructor
    public Student() {
        System.out.println("non parameter constructor initialize");
    }

    // parameterize constuctor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
       System.out.println(name + " " + age);
    }
}
