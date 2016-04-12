/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author trogers8
 */
public class Lab {
    public static void main(String[] args) {
    // lab 3
    Employee e1 = new Employee("Smith", "Bob", "111-11-1111");
    Employee e2 = new Employee("Jones", "Sally", "222-22-2222");
    Employee e3 = new Employee("Pecker", "Peter", "333-33-3333");
    Employee e4 = new Employee("Jones", "Tim", "222-22-2222");
    
    Map<String, Employee> employees = new HashMap<>();
    employees.put(e1.getSsn(), e1);
    employees.put(e2.getSsn(), e2);
    employees.put(e3.getSsn(), e3);
    employees.put(e4.getSsn(), e4);
    
    Employee retrievedEmployee = employees.get(e1.getSsn());
    System.out.println(retrievedEmployee);
        System.out.println("");
    
    //loop over keys
    Set<String> keys = employees.keySet();
        for(String key : keys) {
            Employee found = employees.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
    
    //loop over values
    Collection<Employee> collection = employees.values();
    
        for(Employee e : collection){
            System.out.println(e);
        }
    System.out.println("");
    
    //lab 4
    Map<String, Employee> employees2 = new TreeMap<>();
    employees2.put(e1.getSsn(), e1);
    employees2.put(e2.getSsn(), e2);
    employees2.put(e3.getSsn(), e3);
    employees2.put(e4.getSsn(), e4);
    
    Set<String> keys2 = employees2.keySet();
        for(String key : keys2) {
            Employee found = employees2.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("");
    
    }
}
