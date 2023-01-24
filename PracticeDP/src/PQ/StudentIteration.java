/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SHREYA
 */
class Student{
    private int studentId;
    private String studentName;
    
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public Student(int id, String name)
    {
        studentId = id;
        studentName = name;
    }
}
public class StudentIteration {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(5);
        studentList.add(new Student(1, "Kisan"));
        studentList.add(new Student(2, "Radha"));
        studentList.add(new Student(3, "Ganga"));
        studentList.add(new Student(4, "Narmada"));
    
    Iterator<Student>
            iterator = studentList.iterator();
            Student student;
            System.out.println("Student Information");
            while(iterator.hasNext())
            {
                student= iterator.next();
                System.out.println("ID: "+student.getStudentId()+" Name: "+student.getStudentName());
            }
            
    
    }
}
