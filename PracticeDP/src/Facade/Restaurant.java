/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author SHREYA
 */
class Dish{
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

class Pasta extends Dish{
}

class Pizza extends Dish{
}

//Dish maker is chef
interface Chef {
    void makeDish(Dish dish);
}

class PastaMaker implements Chef
{
    @Override
    public void makeDish(Dish dish)
    {
        System.out.println("Your dish "+dish.getName()+" is being prepared");
        System.out.println("Dish price: "+dish.getCost());
    }
}

class PizzaMaker implements Chef
{
    @Override
    public void makeDish(Dish dish)
    {
        System.out.println("Your dish "+dish.getName()+" is being prepared");
        System.out.println("Dish price: "+dish.getCost());
    }
}

class Waiter 
{
    private Chef pastaMaker;
    private Chef pizzaMaker;
    
    public Waiter()
    {
        pastaMaker = new PastaMaker();
        pizzaMaker = new PizzaMaker();
    }
    
    //customer will call waiter to get pizza
    //which will inturn call chef to order pizza maker to make pizza
    
    public void getPizza(Pizza pizza)
    {
        pizzaMaker.makeDish(pizza);
    }

    //customer will call waiter to get pasta    
    //which will inturn call chef to order pasta maker to make pasta

    public void getPasta(Pasta pasta)
    {
        pastaMaker.makeDish(pasta);
    }
}
public class Restaurant {
    public static void main(String[] args) {
        
        System.out.println("----Welcome to Restaurant----");
        //customer calling waiter
        Waiter waiter = new Waiter();
        
        //dishes in menu with name and price
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setCost(200);
        
        Pasta pasta = new Pasta();
        pasta.setName("Red Sause pasta");
        pasta.setCost(250);
        
        //dishes information
        System.out.println("Pizza ");
        System.out.println("Name: "+pizza.getName()+" and cost: "+pizza.getCost());
        
        System.out.println("Pasta ");
        System.out.println("Name: "+pasta.getName()+" and cost: "+pasta.getCost());
       
        //ordering for dishes
        System.out.println();
        System.out.println("Pizza is ordered");
        waiter.getPizza(pizza);
        
        System.out.println();
        System.out.println("Pasta is ordered");
        waiter.getPasta(pasta);
        
    }
}
