package dp;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        System.out.println(object.hashCode());
        Singleton object1 = Singleton.getInstance();
        System.out.println(object1.hashCode());
        Singleton object2 = Singleton.getInstance();
        System.out.println(object2.hashCode());
        try {
            Singleton objectClone = (Singleton) object2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class CloneNotAllowException extends RuntimeException{
    public CloneNotAllowException(String msg){
        super(msg);
    }
}

class Singleton implements Cloneable{

    private static Singleton instance = null;

    private Singleton(){
        System.out.println("Singleton class initialize..");
    }

    public synchronized static Singleton getInstance(){
        
        if(null == instance)
         instance = new Singleton();

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotAllowException("This class is not support for clone..");
    }

}
