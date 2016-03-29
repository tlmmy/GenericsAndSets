/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author trogers8
 */
public class EqualityDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Sally", "Smith", "111-22-3333");
        Person p2 = new Person("Sally", "Smith", "111-22-3333");
        Person p3 = new Person("John", "Doe", "333-22-1111");

          
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        
        Set<Person> peopleSet = new HashSet<>(people);
        
        for(Person p : peopleSet){
            System.out.println(p);
        }
        
        people = new ArrayList<>(peopleSet);
}
}