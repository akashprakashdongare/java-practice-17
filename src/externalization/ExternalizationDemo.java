package externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo implements Externalizable {

    String name;
    int age;
    float salary;

    public ExternalizationDemo(){
        System.out.println("no-arg constructor...");
    }

    public ExternalizationDemo(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        age = (Integer)in.readObject();
    }
    
}
