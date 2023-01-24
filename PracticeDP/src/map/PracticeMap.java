/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author SHREYA
 */
public class PracticeMap {
    public static void main(String[] args) {
        Map<String, Integer>  numbers = new HashMap<>();
        
        //to add elements put method is used
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 23);
        
        //to check if key is not repeated
//        numbers.putIfAbsent("Four", 23);
       
        System.out.println(numbers);
        
        //to iterate the values of map
        for (Map.Entry<String, Integer> num : numbers.entrySet())
        {
            System.out.println(num);
            System.out.println(num.getKey());       //mapvalues by its key
            System.out.println(num.getValue());     //mapvalues by its values
        }
        
        //returns the set of key
        for (String key : numbers.keySet())
        {
            System.out.println(key);
        }
        //returns the set of values
        for (Integer val : numbers.values())
        {
            System.out.println(val);
        }
        
        //to check an element exist in map ornot
        System.out.println(numbers.containsValue(2));
        System.out.println(numbers.isEmpty());
        
    }
}
