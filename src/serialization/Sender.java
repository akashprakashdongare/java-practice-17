package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(1, "Anky", 25, 45200.25f);
        ObjectOutputStream outStream = new ObjectOutputStream(
            new FileOutputStream("E:\\test-files\\emp.txt")
        );
        outStream.writeObject(employee);
    }
}
