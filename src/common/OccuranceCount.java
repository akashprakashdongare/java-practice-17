package common;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import helper.ArrayHelper;

public class OccuranceCount {
    public static void main(String[] args) {
        String name = "Australia";

        Map<String, Long> occuranceCounting = Arrays.asList(name.split("")).stream().map(String::toLowerCase)
                             .collect(Collectors.groupingBy(value -> value, Collectors.counting()));
        System.out.println(occuranceCounting);

        Map<String, Integer> duplicateOccuranceMap = new HashMap<>();
        for(String str : name.toLowerCase().split("")){
            duplicateOccuranceMap.put(str, 
            duplicateOccuranceMap.get(str) == null ? 1 :
            duplicateOccuranceMap.get(str) + 1
            );
        }
        System.out.println(duplicateOccuranceMap);

        List<String> filterString = Arrays.asList(name.toLowerCase().split("")).stream()
                .filter(s -> s.equals("a") ? false : true).collect(Collectors.toList());
        System.out.println(filterString);

        int[] array = ArrayHelper.getArray();
        boolean isSorted = true;
        for (int i = 0; i < array.length; ++i) {
            isSorted = array[i] <= array[i+1];
        }
        System.out.println(isSorted);
    }
}
