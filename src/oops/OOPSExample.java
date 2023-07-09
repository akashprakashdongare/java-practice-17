package oops;

import utils.PrintMessageUtil;

public class OOPSExample {
    public static void main(String[] args) {

        PrintMessageUtil.printMsg("pen example");

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        PrintMessageUtil.printMsg("student example");

        Student s1 = new Student("Sumeet", 25);

        s1.printInfo();

        PrintMessageUtil.printMsg("student copy");

        Student s1Copy = new Student(s1);

        s1Copy.printInfo();
    }
}
