/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesign;
/**
 *
 * @author SHREYA
 */
interface Candy
{
    void candyType();
    //void candyType(char a);
}

class candyA implements Candy
{
//    private char type;
//    public candyA(char type)
//    {
//        this.type = type;
//    }
    @Override
    public void candyType()
    {
        System.out.println("Candytype: A");
    }
}
class candyB implements Candy
{
//    private char type;
//    public candyB(char type)
//    {
//        this.type = type;
//    }
    @Override
    public void candyType()
    {
        System.out.println("Candytype: B");
    }
}
class candyC implements Candy
{
//    private char type;
//    public candyC(char type)
//    {
//        this.type = type;
//    }
    @Override
    public void candyType()
    {
        System.out.println("Candytype: C");
    }
}

class CandyFactory 
{
    public static Candy getCandy(char c)
    {
        if(c == 'A')
            return new candyA();
        else if(c == 'B')
            return new candyB();
        else if(c == 'C')
            return new candyC();
        else
            return null;
    }
    
}
public class CandyService {
    public static void main(String[] args) {
        Candy cf1 = CandyFactory.getCandy('A');
        cf1.candyType();
        Candy cf2 = CandyFactory.getCandy('B');
        cf2.candyType();
        Candy cf3 = CandyFactory.getCandy('C');
        cf3.candyType();
    }
}
