package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableEaxmple {
    public static void main(String[] args) {
        Address address = new Address("Ramkrushna nagar, dighori, Nagpur", 440031);
        List<String> citys = Arrays.asList("Nagpur", "Pune", "Amravati", "Waroli");
        Immutable immutable = new Immutable("Sanjay Kumar", 51, address, citys);
        System.out.println(immutable);
        address.street = "abc";
        System.out.println(address);
        //citys.add("Hydrabad");
        System.out.println(immutable);
    }
}
class Address{
    String street;
    int zip;

    public Address(String street, int zip){
        this.street = street;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return " {street=" + street + ", zip=" + zip + "}";
    }
    
}
class Immutable{
    private final String name;
    private final int age;
    private final Address address;
    private final List<String> citys;

    public Immutable(String name, int age, Address address, List<String> citys){
        this.name = name;
        this.age = age;
        this.address = new Address(address.street, address.zip);
        this.citys = new ArrayList<>(citys);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getCitys() {
        return citys;
    }

    @Override
    public String toString() {
        return " {name=" + name + ", age=" + age + ", address=" + address + ", citys=" + citys + "}";
    }

    
    
}