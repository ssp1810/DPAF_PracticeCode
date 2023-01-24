/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQ;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author SHREYA
 */
public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("Sun");
        queue.add("Moon");
        System.out.println(queue);
        System.out.println("Value: "+queue.remove());
        System.out.println("Value: "+queue.remove());
        System.out.println(queue);
        
    }
}
