package funInterface;

public class ExtendImplementExample {
    public static void main(String[] args) {
        Addition add = (a, b) ->  (a + b);
      int sum = add.addition(10, 20);
      System.out.println("Sum is : "+sum);
      Substration sub = (a, b) -> (a - b);
      int dif = sub.addition(20, 10);
      System.out.println("Sub is : "+dif);
    }
}

@FunctionalInterface
interface Addition{
    int addition(int a, int b);
}

@FunctionalInterface
interface Substration extends Addition{

}
