package com.company.FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class MoreStreamQues {
    static void main() {
        //1
        List<Integer> num = List.of(3,5,5,9,7,4,1,2,3);
        List<Integer> distinctNum = num.stream()
                .distinct()
                .toList();  // .collect(Collectors.toList()
        System.out.println(num);
        System.out.println(distinctNum);

        //2
        List<Employee> empList = List.of(
                new Employee("Lucy",1000),
                new Employee("Roxy",1500),
                new Employee("Golu",15000),
                new Employee("Gola",10000),
                new Employee("Jakal",100)
        );

        empList.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);

        //3
        List<String> nums = List.of("1","2","3","4","5");
        nums.stream()
                .map(Integer::parseInt)
                .map(n -> Math.pow(n,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }
}
