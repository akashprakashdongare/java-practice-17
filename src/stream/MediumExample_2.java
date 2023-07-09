package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.imageio.stream.FileCacheImageOutputStream;

import helper.ArrayHelper;
import helper.ListHelper;
import utils.PrintMessageUtil;

public class MediumExample_2 {
    public static void main(String[] args) {
        List<Integer> integers = ListHelper.getIntegers();

        PrintMessageUtil.printMsg("all even number");
        List<Integer> evenNumbers= integers.stream().filter(no -> no%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        PrintMessageUtil.printMsg("find number starts with 1");
        List<String> numbersStartsWith1 = integers.stream().map(no -> no + "")
                                .filter(no -> no.startsWith("1")).collect(Collectors.toList());
        System.out.println(numbersStartsWith1);

        PrintMessageUtil.printMsg("find duplicate elements in array");
        Set<Integer> numbersSet = new HashSet<>();
        List<Integer> duplicaIntegers = integers.stream().filter(no -> !numbersSet.add(no)).collect(Collectors.toList());
        System.out.println(duplicaIntegers);

        PrintMessageUtil.printMsg("find first element");
        Optional<Integer> firstElement = integers.stream().findFirst();
        System.out.println(firstElement.get());

        PrintMessageUtil.printMsg("find total number of elements");
        long count = integers.stream().count();
        long counting = integers.stream().collect(Collectors.counting());
        System.out.println("count : " + count);;
        System.out.println("counting : " + counting);

        PrintMessageUtil.printMsg("max value");
        int maxvalue = integers.stream().max(Integer::compare).get();
        int maxValueByReduce = integers.stream().reduce((x, y)-> x < y ? y : x).get();
        System.out.println("Max value by max() : " + maxvalue);
        System.out.println("Max value by reduce() : " + maxValueByReduce);

        PrintMessageUtil.printMsg("non-repeated character");
        String name = "Java articles are Awesome";
        String firstNoRepeatingCharacter = 
             Arrays.asList(name.split("")).stream().map(String::toLowerCase)
                                     .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                                     .entrySet()
                                     .stream().filter(entry -> entry.getValue() == 1L)
                                     .map(entry -> entry.getKey())
                                     .findFirst().get();
        System.out.println(firstNoRepeatingCharacter);

        PrintMessageUtil.printMsg("repeating chracter");
        String repeatedCharacter = Arrays.asList(name.split("")).stream()
                                             .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                                             .entrySet().stream()
                                             .filter(entry -> entry.getValue() != 1L)
                                             .map(entry -> entry.getKey())
                                             .findFirst().get();
        System.out.println(repeatedCharacter);

        PrintMessageUtil.printMsg("sort integer list");
        List<Integer> sortedArrayAsc = ListHelper.getMediumIntegrs().stream()
                                          .sorted(Integer::compare).collect(Collectors.toList());
        System.out.println(sortedArrayAsc);
        List<Integer> sortedArrayDesc = ListHelper.getMediumIntegrs().stream()
                                              .sorted(Comparator.reverseOrder())
                                              .collect(Collectors.toList());
        System.out.println(sortedArrayDesc);

        PrintMessageUtil.printMsg("true if any value appears at least twice else return false if every element is distinct");
        List<Integer> numberList = Arrays.asList(ArrayHelper.getIntegerObjectArray());
        Set<Integer> numberSet = new HashSet<>(numberList);
        if(numberList.size() == numberSet.size())
        System.out.println(false);
        else
        System.out.println(true);

        System.out.println("List : " + numberList);

    }
}
