package helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListHelper {
    
    public static List<String> getCitys(){
        List<String> citys = new ArrayList<>();
        citys.add("Nagpur");
        citys.add("Pune");
        citys.add("Mumbai");
        citys.add("Amravati");
        citys.add("Washim");
        citys.add("Aurangabad");
        citys.add("Bangalor");
        citys.add("Chennai");
        citys.add("Kolkata");
        citys.add("Maysor");
        citys.add("Agra");
        citys.add("Hydrabad");
        return citys;
    }

    public static List<String> getPersonNames(){
        List<String> personNames = new ArrayList<>();
        personNames.add("Mukul");
        personNames.add("Sagar");
        personNames.add("Karan");
        personNames.add("Paresh");
        personNames.add("Virat");
        personNames.add("Mahesh");
        personNames.add("Sudesh");
        personNames.add("Varun");
        personNames.add("Komal");
        personNames.add("Kalyani");
        personNames.add("Kumari");
        personNames.add("Danashree");
        personNames.add("Vidya");
        return personNames;
    }

    public static List<Integer> getIntegers(){
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(16);
        integers.add(17);
        integers.add(18);
        integers.add(19);
        integers.add(20);
        integers.add(21);
        integers.add(20);
        integers.add(21);
        return integers;
    }

    public static List<Integer> getMediumIntegrs(){
        List<Integer> integers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        return integers;
    }
}
