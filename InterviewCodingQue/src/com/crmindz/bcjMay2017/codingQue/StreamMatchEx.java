package com.crmindz.bcjMay2017.codingQue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
  
public class StreamMatchEx {
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Nataraja G", "Security", 2500));
        empList.add(new Employee("Amar", "Admin", 12500));
 
        boolean result = empList.stream().anyMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
 
        result = empList.stream().allMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
 
        result = empList.stream().noneMatch(emp->emp.getAccount().matches("Admin"));
        System.out.println(result);
        
        empList = empList.stream().sorted((Employee e1,Employee e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
        
        for(Employee emp : empList){
        	
        	System.out.println(emp);
        }
    }
}

