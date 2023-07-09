package statics;

class Employee{
    int empId;
    String name;
    String companyName = "Infosys";

    public Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    public void display(){
        System.out.println("empId : "+empId);
        System.out.println("name : "+name);
        System.out.println("companyName : "+companyName);
    }

    @Override
    public String toString() {
        return " {empId=" + empId + ", name=" + name + ", companyName=" + companyName + "}";
    }
    
}

public class StaticVariableExample {
    int number;
    //static String city;
    public static void main(String[] args) {
        //number = 10;
        Employee e1 = new Employee(100, "Karan Sharma");
        //e1.display();
        System.out.println(e1);
        
        Employee e2 = new Employee(101, "Rohit Sharma");
        //e2.display();
        e2.companyName = "TIAA";
        System.out.println(e2);
        
        Employee e3 = new Employee(102, "Mohit Sharma");
        //e3.display();
        System.out.println(e3);
        
        Employee e4 = new Employee(103, "Vikas Jain");
        //e4.display();
        System.out.println(e4);
    }
}
