package stream;

import bean.Person;
import bean.Relation;
import helper.PersonHelper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Person> persons = PersonHelper.getPersons();

        Map<String, List<Integer>> personAging = persons.stream().collect(
                Collectors.groupingBy(
                        person -> person.getName(), Collectors.mapping(e -> e.getAge(), Collectors.toList())
                )
        );

       // System.out.println(personAging);

        Map<String, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(Person::getName));

        List<Person> personList = PersonHelper.getPersonList();

        Map<Relation, List<Person>> relations = personList.stream().collect(Collectors.groupingBy(Person::getRelation));

        System.out.println(relations);

        Map<Relation, List<String>> relationsName = personList.stream().collect(
                Collectors.groupingBy(
                        person -> person.getRelation(), Collectors.mapping(p -> p.getName(), Collectors.toList())
                )
        );

        System.out.println(relationsName);

    }
}
