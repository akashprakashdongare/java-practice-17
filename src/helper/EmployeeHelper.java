package helper;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import enums.Department;
import enums.Gender;

public class EmployeeHelper {
    
    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(
            new Employee(111, "Jennifer", 22, Gender.MALE, Department.HR, 2017, 55000.0));
        employees.add(
            new Employee(112, "Rohit", 35, Gender.MALE, Department.SalesAndMarketing, 2019, 23500.0));
        employees.add(
            new Employee(113, "Shubman", 29, Gender.MALE, Department.Infrastructure, 2019, 28000.0));
        employees.add(
            new Employee(114, "Rinku", 28, Gender.MALE, Department.ProductDevelopment, 2020, 62500.0));
        employees.add(
            new Employee(115, "Aaditi", 41, Gender.FEMALE, Department.HR, 2022, 29700.0));
        employees.add(
            new Employee(116, "Mahendra", 43, Gender.MALE, Department.SecurityAndTransport, 2023, 20500.0));
        employees.add(
            new Employee(117, "Nitish", 35, Gender.MALE, Department.AccountAndFinance, 2019, 37000.0));
        employees.add(
            new Employee(118, "Aditya", 31, Gender.MALE, Department.ProductDevelopment, 2019, 34500.0));
        employees.add(
            new Employee(119, "Monika", 24, Gender.FEMALE, Department.SalesAndMarketing, 2021, 21500.0));
        employees.add(
            new Employee(120, "Aman", 38, Gender.MALE, Department.SecurityAndTransport, 2021, 31000.5));
        employees.add(
            new Employee(121, "Sangeeta", 27, Gender.FEMALE, Department.Infrastructure, 2021, 35000.0));
        employees.add(
            new Employee(122, "Joshi", 25, Gender.MALE, Department.ProductDevelopment, 2020, 29000.0));
        employees.add(
            new Employee(123, "Jeddy", 27, Gender.FEMALE, Department.AccountAndFinance, 2020, 29000.0));
        employees.add(
            new Employee(124, "Niden", 24, Gender.MALE, Department.SalesAndMarketing, 2020, 30200.5));
        employees.add(
            new Employee(125, "Saig", 23, Gender.MALE, Department.Infrastructure, 2019, 42700.0));
        employees.add(
            new Employee(126, "Saey", 26, Gender.FEMALE, Department.ProductDevelopment, 2018, 38900.0));
        employees.add(
            new Employee(127, "Shreyas", 25, Gender.MALE, Department.ProductDevelopment, 2018, 35700.0));
        return employees;
    }
}
