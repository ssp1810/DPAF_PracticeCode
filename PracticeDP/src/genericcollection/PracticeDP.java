/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericcollection;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SHREYA
 */

//Traditional Arraylist
public class PracticeDP {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//        
//        //to access an element of list
//        System.out.println(list.get(3));
//        
//        //to remove any element of list
//        list.remove(1);
//        System.out.println(list);
        
    
        //for general list
        List<Object> list = new ArrayList<>();
        list.add("Sun");
        list.add(108);
        System.out.println("Value = "+list.get(0)+" Type: "+list.get(0).getClass().getName());
        System.out.println("Value = "+list.get(1)+" Type: "+list.get(1).getClass().getName());
        
    }
    
}
