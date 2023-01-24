/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author SHREYA
 */
interface BreadItem
{
    int cost();
}
class Sandwich implements BreadItem
{
    @Override
    public int cost()
    {
        return 30;
    }
}
class Burger implements BreadItem
{
    @Override
    public int cost()
    {
        return 40;
    }
}
class BreadDecorator implements BreadItem
{
    BreadItem breadItem ;
    public BreadDecorator(BreadItem breadItem)
    {
        this.breadItem = breadItem;
    }
    @Override
    public int cost()
    {
        return breadItem.cost();
    }
}
class CheeseSpread extends BreadDecorator
{
    public CheeseSpread(BreadItem breadItem)
    {
        super(breadItem);
    }
    @Override
    public int cost()
    {
        return breadItem.cost()+5;
    }
}
class ButterSpread extends BreadDecorator
{
    public ButterSpread(BreadItem breadItem)
    {
        super(breadItem);
    }
    @Override
    public int cost()
    {
        return breadItem.cost()+10;
    }
}
public class FoodTest {
    public static void main(String[] args) {
        System.out.println("Price of sandwich: "+ new Sandwich().cost());
        System.out.println("Price of sandwich: "+ new Burger().cost());
        System.out.println("Burger with cheeseSpread: "+new CheeseSpread(new Burger()).cost());
        
        BreadItem SandwichWithCheese = new CheeseSpread(new Sandwich());
        BreadItem SandwichWithButterAndCheese = new ButterSpread(SandwichWithCheese);
        System.out.println("Sandwich with cheeseSpread and butterSpread: "+SandwichWithButterAndCheese.cost());

    }
}
