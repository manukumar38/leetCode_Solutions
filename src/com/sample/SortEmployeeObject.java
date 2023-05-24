package com.sample;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SortEmployeeObject {
    private String name;
    private int salary;
    private String dept;

    public SortEmployeeObject(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public static void main(String[] args) {
        List<SortEmployeeObject> empList = new ArrayList<>();
        empList.add(new SortEmployeeObject("Manu", 6000, "IT" ));
        empList.add(new SortEmployeeObject("Kumar", 2000, "IT" ));
        empList.add(new SortEmployeeObject("Harsha", 5000, "IT" ));
        empList.add(new SortEmployeeObject("Arun", 4000, "IT" ));
        empList.add(new SortEmployeeObject("Punith", 500, "IT" ));
        empList.add(new SortEmployeeObject("Punith", 2000, "IT" ));
        empList.add(new SortEmployeeObject("Adesh", 7000, "IT" ));

        List<SortEmployeeObject> collect = empList.stream().sorted(Comparator.comparing(SortEmployeeObject::getName)
                .thenComparingInt(SortEmployeeObject::getSalary)).collect(Collectors.toList());
        System.out.println(collect);
    }

}
