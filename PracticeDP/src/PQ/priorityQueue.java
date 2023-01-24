/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQ;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author SHREYA
 */
public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        //here by defualt min heap will be run and output will be appeared as min first
        pq.offer(20);
        pq.offer(40);
        pq.offer(12);
        pq.offer(3);
        System.out.println(pq);
        
        //this will remove least valued number
        pq.poll();
        System.out.println(pq);
        
        //to see the bottom element
        System.out.println(pq.peek());
        
        //to print the queue with max. value first then use
        //Comparator.reverseOrder() class in intialization
    }
}
