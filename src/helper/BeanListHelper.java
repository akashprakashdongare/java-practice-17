package helper;

import java.util.ArrayList;
import java.util.List;

import bean.Fruit;

public class BeanListHelper {
    
    public static List<Fruit> getFruits(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Mango", 20.0, 100));
        fruits.add(new Fruit("Apple", 40.0, 50));
        fruits.add(new Fruit("Banana", 5.0, 500));
        fruits.add(new Fruit("Orange", 10.0, 100));
        fruits.add(new Fruit("Grapes", 2.0, 1000));
        fruits.add(new Fruit("Pineapple", 150.0, 20));
        fruits.add(new Fruit("Pomegranate", 10, 50));
        fruits.add(new Fruit("Coconut", 15.0, 10));
        fruits.add(new Fruit("Papaya", 50.0, 10));
        fruits.add(new Fruit("Watermelon", 30.0, 50));
        fruits.add(new Fruit("Dragon Fruit", 100.0, 10));
        fruits.add(new Fruit("Strawberry", 20.0, 100));
        fruits.add(new Fruit("Blueberry", 5.0, 2000));
        fruits.add(new Fruit("Cherry", 10.0, 200));
        fruits.add(new Fruit("Jackfruit", 200.0, 10));
        return fruits;
    }
}
