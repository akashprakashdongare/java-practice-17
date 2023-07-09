package stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Fruit;
import helper.BeanListHelper;
import helper.ListHelper;

public class Examples {

    public static void main(String[] args) {

        List<String> citys = ListHelper.getCitys();
        List<String> personNames = ListHelper.getPersonNames();
        List<Integer> integers = ListHelper.getIntegers();
        List<Fruit> fruits = BeanListHelper.getFruits();

        List<Integer> squares = integers.stream().map(a-> a*a).collect(Collectors.toList());
        System.out.println(squares);

        List<String> fruitNames = fruits.stream().map(Fruit::getName)
                                                 .collect(Collectors.toList());
        System.out.println(fruitNames);

        List<String> fruitsStartWithS = fruitNames.stream().filter(name -> name.startsWith("S"))
                                                           .collect(Collectors.toList());
        System.out.println(fruitsStartWithS);

        
    }
}
