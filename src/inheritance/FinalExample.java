package inheritance;

public class FinalExample {
    public static void main(String[] args) {
        display("This is display method");
    }

    private static final void display(String msg) {
        System.out.println(msg);
    }
}

class A{
    public A(){
        System.out.println("Class A initialized");
    }

    public void display(){
        System.out.println("Display method of class A");
    }
}
class B extends A{
    public B(){
        System.out.println("Class B initialized");
    }

    public void display(){
        System.out.println("Display method of class B");
    }
}
