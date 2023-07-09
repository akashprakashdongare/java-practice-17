package externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizationDemo demo = new ExternalizationDemo("Anky", 25, 45200.25f);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream("E:\\test-files\\info.txt")
        );
        objectOutputStream.writeObject(demo);

        ObjectInputStream inputStream = new ObjectInputStream(
            new FileInputStream("E:\\test-files\\info.txt")
        );

        ExternalizationDemo demo2 = (ExternalizationDemo) inputStream.readObject();

        System.out.println("name : " + demo2.name + "\n age : " + demo2.age + "\n salary : " + demo2.salary);
    }
}
