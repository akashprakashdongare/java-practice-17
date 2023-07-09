package generics;

import java.io.Serializable;

public class Counter<T extends Number & Serializable> {

    T t;

    public Counter(T t){
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }
}
