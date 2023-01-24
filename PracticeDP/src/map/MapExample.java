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
public class MapExample {
    public static void main(String[] args) {
        String studentName;
        Integer ID;
        
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Kisan");
        studentMap.put(2, "Radha");
        studentMap.put(3, "Ganga");
        
        ID = 1;
        studentName = studentMap.get(ID);
        System.out.println("Student : ID = "+ID+" Name: "+studentName);
        ID = 4;
        studentName = studentMap.get(ID);
        if(studentName!=null)
            System.out.println("Student : ID = "+ID+" Name: "+studentName.toUpperCase());
        else
            System.out.println("NO such student found for ID: "+ID);

            
    }
}
