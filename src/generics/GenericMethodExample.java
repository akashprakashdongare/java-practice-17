package generics;

public class GenericMethodExample {
    public static void main(String[] args) {
        print(1);
        print(2.0);
    }

    public static <T extends Number> void print(T t){
        System.out.println(t);
    }
}
