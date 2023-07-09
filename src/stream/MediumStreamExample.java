package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Employee;
import bean.Fruit;
import enums.Department;
import enums.Gender;
import helper.BeanListHelper;
import helper.EmployeeHelper;
import helper.ListHelper;
import utils.PrintMessageUtil;

public class MediumStreamExample {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeHelper.getEmployees();
        
        

        PrintMessageUtil.printMsg("employee count");
        Long employeecount = employees.stream().count();
        System.out.println("Count using count() : " + employeecount);

        Long employeeCounting = employees.stream().collect(Collectors.counting());
        System.out.println("Count using Collectors.counting() : " + employeeCounting);

        PrintMessageUtil.printMsg("employee salary asc order");
        List<Employee> employeeSalaryAsc = employees.stream()
                 .sorted((e1, e2) -> (int)(e1.getSalary() - e2.getSalary()))
                 .collect(Collectors.toList());
        employeeSalaryAsc.stream().forEach(System.out::println);

        PrintMessageUtil.printMsg("employee salary desc order");
        List<Employee> employeeSalaryDesc = employees.stream()
                                                     .sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
                                                     .collect(Collectors.toList());
        employeeSalaryDesc.stream().forEach(System.out::println);

        PrintMessageUtil.printMsg("groupingBy example");
        Map<Gender, Long> noOfMaleAndFemelEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemelEmployees);
        Map<Department, Long> employeeCountByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeeCountByDepartment);

        PrintMessageUtil.printMsg("distinct");
        List<Department> departments = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(departments);

        PrintMessageUtil.printMsg("average salary");
        Map<Gender, Double> averageSalaryGenderWise = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryGenderWise);

        PrintMessageUtil.printMsg("highest salary paid by male and female employee");
        Map<Gender, Optional<Employee>> maxSalaryMaleAndFemaleEmployee = 
                      employees.stream().collect(
                        Collectors.groupingBy(Employee::getGender, Collectors.maxBy((e1, e2) -> (int)(e1.getSalary() - e2.getSalary())))
                        );
        System.out.println(maxSalaryMaleAndFemaleEmployee);

        int maxValue = ListHelper.getIntegers().stream().max(Integer::compare).get();

        PrintMessageUtil.printMsg("second highest paid employee");
        Employee secondHighestPaidEmployee = employees.stream().filter(employee -> Gender.MALE.equals(employee.getGender()))
        .sorted( (e1, e2) -> (int)(e2.getSalary() - e1.getSalary())).skip(2).findFirst().get();
        System.out.println(secondHighestPaidEmployee);

        PrintMessageUtil.printMsg("reduce()");

        Optional<Integer> sumUsingReduce = ListHelper.getIntegers().stream().reduce( (a, b) -> a + b );
        System.out.println(sumUsingReduce.get());

        PrintMessageUtil.printMsg("max element by reduce");
        Optional<Integer> maxUsingReduce = ListHelper.getIntegers().stream().reduce( (a, b) -> a < b ? b : a );
        System.out.println(maxUsingReduce.get());

        PrintMessageUtil.printMsg("lowest-paid male and female employee");
        Map<Gender, Optional<Employee>> minSalaryMaleAndFemaleEmployee= employees.stream().collect(
                                  Collectors.groupingBy(
                                     Employee::getGender, 
                                     Collectors.minBy((e1, e2) -> (int)(e1.getSalary() - e2.getSalary()))
                                     ));
        System.out.println("Min salary male : " + minSalaryMaleAndFemaleEmployee.get(Gender.MALE).get());
        System.out.println("Min salary female : " + minSalaryMaleAndFemaleEmployee.get(Gender.FEMALE).get());

        PrintMessageUtil.printMsg("highest paid employee in each department");
        Map<Department, Optional<Employee>> highestPaidInEachDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy((x, y)->(int)(x.getSalary()-y.getSalary()))));
        for(Department department : highestPaidInEachDepartment.keySet())
           System.out.println(department + " : " + highestPaidInEachDepartment.get(department).get());

        PrintMessageUtil.printMsg("highest paid employee in orgnization");
        Employee highestPaidEmployee = employees.stream().collect(
            Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println(highestPaidEmployee);

        PrintMessageUtil.printMsg("Collectors.partitioningBy()");
        Map<Boolean, List<Employee>> employeeOlderThan30 = employees.stream()
        .collect(Collectors.partitioningBy(employee -> employee.getAge() > 30));
        String employeesToOlder = employeeOlderThan30.get(true)
                                 .stream().map(Employee::getName).collect(Collectors.joining(", "));
        String employeeToYoung = employeeOlderThan30.get(false).stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println("Employees are older : " + employeesToOlder);
        System.out.println("EMployees are young : " + employeeToYoung);


        PrintMessageUtil.printMsg("string occurance count");
        String name = "IamDoingGood";
        String[] charecters = name.split("");
        Map<String, Long> stringOccurance = 
              Arrays.asList(charecters).stream().map(String::toLowerCase).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringOccurance);

        PrintMessageUtil.printMsg("joining fruits");
        List<Fruit> fruits = BeanListHelper.getFruits();
        String fruitsName = fruits.stream().map(Fruit::getName).collect(Collectors.joining(", "));
        System.out.println(fruitsName);
        
        PrintMessageUtil.printMsg("partitioning fruit");
        Map<Boolean, List<Fruit>> partitioningFruits = fruits.stream()
                        .collect(Collectors.partitioningBy(fruit -> fruit.getName().startsWith("P")));
        System.out.println(partitioningFruits);

        PrintMessageUtil.printMsg("average salary of each department");
        Map<Department, Double> averageSalaryOfEachDepartment = employees.stream()
                                        .collect(Collectors.groupingBy(
                                            Employee::getDepartment, 
                                            Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfEachDepartment);

        PrintMessageUtil.printMsg("youngest male employee in product department");
        Optional<Employee> youngestMaleEmployeeInProductDevelopment = employees.stream()
                         .filter(employee -> 
                             Gender.MALE.equals(employee.getGender()) && 
                             Department.ProductDevelopment.equals(employee.getDepartment()))
                         .min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngestMaleEmployeeInProductDevelopment.get());

        PrintMessageUtil.printMsg("most working experience");
        Optional<Employee> seniorMostEmployee = employees.stream()
                                      .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                                      .findFirst();
        System.out.println(seniorMostEmployee.get());

        PrintMessageUtil.printMsg("older employee in organization");
        Employee olderEmployee = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(olderEmployee);

        PrintMessageUtil.printMsg("average and total salary of organization");
        DoubleSummaryStatistics employeeSummaryStatistics = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary : " + employeeSummaryStatistics.getAverage());
        System.out.println("Total Salary : " + employeeSummaryStatistics.getSum());

        PrintMessageUtil.printMsg("name of all employee in each department");
        Map<Department, List<Employee>> employeeByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry<Department, List<Employee>> entry : employeeByDepartment.entrySet()){
            System.out.println("--------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            for(Employee emp : entry.getValue()){
                System.out.println(emp.getName());
            }
        }

        PrintMessageUtil.printMsg("employees who are younger or equal to 30 and older than 30");
        Map<Boolean, List<Employee>> employeeYoungerAndOlder30 = employees.stream()
                                         .collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));
        for(Map.Entry<Boolean, List<Employee>> entry : employeeYoungerAndOlder30.entrySet()){
            System.out.println("------------------------------------");
            if(entry.getKey())
            System.out.println("Employee older than 30 yesrs : ");
            else
            System.out.println("Employee younger than or equal to 30 year : ");

            System.out.println("------------------------------------");

            for(Employee emp : entry.getValue())
               System.out.println(emp.getName());
        }
        
        Arrays.asList(name.split("")).stream().map(String::toLowerCase)
                                     .collect(Collectors.groupingBy(str -> str, Collectors.counting()));


        PrintMessageUtil.printMsg("employee age in desc order");
        List<Employee>  sortedEmployeeByAgeDesc =
                employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        sortedEmployeeByAgeDesc.forEach(System.out::println);

    }
    
}
