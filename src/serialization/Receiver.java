package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import externalization.Employee;

public class Receiver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(
            new FileInputStream("E:\\test-files\\emp.txt")
        );

        Employee emp = (Employee) inputStream.readObject();

        System.out.println("name : " + emp.name + " \n age : " + emp.age + " \n salary : " + emp.salary);
    }
}
