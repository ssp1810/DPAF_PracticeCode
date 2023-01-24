/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SHREYA
 */
class Employee {
    private String name;
    private String dept;
    private List<Employee> subordinates;
    
    public Employee(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee e){
        subordinates.add(e);
    }
    public void remove(Employee e){
        subordinates.remove(e);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return ("Employee :[Name: "+name+", dept: "+dept+"]");
    }
}
public class Test {
    public static void main(String[] args) {
    Employee dean = new Employee("Prof. Panchal","Dean, FoT");
    Employee hodIT = new Employee("Prof. Chhajed","Head, IT");
    Employee hodEC = new Employee("Prof. Kothari","Head, EC");
    Employee fac1IT = new Employee("Prof. Prajapati","AP, IT");
    Employee fac2IT = new Employee("Prof. Dabhi","AP, IT");
    Employee fac1EC = new Employee("Prof. Thumar","P, EC");
    Employee fac2EC = new Employee("Prof. Dalal","AP, EC");
    dean.add(hodIT);
    dean.add(hodEC);
    hodIT.add(fac1IT);
    hodIT.add(fac2IT);
    hodEC.add(fac1EC);
    hodEC.add(fac2EC);
    //print all employees of the organization
    System.out.println(dean);
    for (Employee headEmployee : dean.getSubordinates()) 
    {
        System.out.println(headEmployee);
        for (Employee employee : headEmployee.getSubordinates()) 
        {
            System.out.println(employee);
        }
    }
    }
}