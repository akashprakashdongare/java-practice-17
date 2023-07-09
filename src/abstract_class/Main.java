package abstract_class;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "src/abstract_class/data.txt";
        
        new NumberExtractorReport()
                 .prepareAndSendReport(path);

        new EmailExtractorReport()
                 .prepareAndSendReport(path);
        
        Animal dog = new Dog("Foo");
        Animal cat = new Cat("Bar");

        dog.makeSound();
        cat.makeSound();
    }
    
}
