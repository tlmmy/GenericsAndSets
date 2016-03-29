/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author trogers8
 */
public class ListDemo1 {
    public static void main(String[] args) {
        Set<String> shoppingList = new HashSet<>();
        shoppingList.add("Whiskey");
        shoppingList.add("Chips");
        shoppingList.add("Whiskey");
        shoppingList.add("Pizza");
       
        //old way
//        for(int i=0; i < shoppingList.size(); i++){
//            String item = (String)shoppingList.get(i);
//            System.out.println(item);
//        }
        
        // new way
        for(String s : shoppingList){
            System.out.println(s);
        }
        
        //another way
        Iterator<String> i = shoppingList.iterator();
        while(i.hasNext()){
            String item = i.next();
            System.out.println(item);
        }
    }
}
