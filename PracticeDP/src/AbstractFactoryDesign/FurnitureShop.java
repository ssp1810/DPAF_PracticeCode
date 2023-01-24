/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryDesign;
interface Furniture
{
    void buyFur();
}
interface FurnitureTypeA extends Furniture{}
interface FurnitureTypeB extends Furniture{}

class ChairTypeA implements FurnitureTypeA
{
    int price = 430;
    public ChairTypeA()
    {
        System.out.println("Furniture: Chair, Type: A");
    }
    @Override
    public void buyFur()
    {
        System.out.println("Type A chair Purchased");
        System.out.println("Chair A Price: "+price);

    }
  
}
class ChairTypeB implements FurnitureTypeB
{
    int price = 300;
    public ChairTypeB()
    {
        System.out.println("Furniture: Chair, Type: B");
    }
    @Override
    public void buyFur()
    {
        System.out.println("Type B chair Purchased");
        System.out.println("Chair B Price: "+price);

    }
}

class TableTypeA implements FurnitureTypeA
{
    int price = 250;
    public TableTypeA()
    {
        System.out.println("Furniture: Table, Type: A");
    }
    @Override
    public void buyFur()
    {
        System.out.println("Type A table Purchased");
        System.out.println("Table A Price: "+price);
    }
  
}

class TableTypeB implements FurnitureTypeB
{
    int price = 200;
    public TableTypeB()
    {
        System.out.println("Furniture: Table, Type: B");
    }
    @Override
    public void buyFur()
    {
        System.out.println("Type B table Purchased");
        System.out.println("Table B Price: "+price);
    }
  
}
interface FurnitureFactory{
    public Furniture getFurniture(String furni);
}

class TypeAFurnitureFactory implements FurnitureFactory
{
    @Override
    public FurnitureTypeA getFurniture(String furni)
    {
        switch(furni)
        {
            case "Chair":
                return new ChairTypeA();
            case "Table":
                return new TableTypeA();
        }
        return null;
    }
}

class TypeBFurnitureFactory implements FurnitureFactory
{
    @Override
    public FurnitureTypeB getFurniture(String furni)
    {
        switch(furni)
        {
            case "Chair":
                return new ChairTypeB();
            case "Table":
                return new TableTypeB();
        }
        return null;
    }
}
class Customer
{
    public void showFurniture(String furn, char objType)
    {
        Furniture furniture = null;
        switch(objType)
        {
            case 'A':
                furniture = new TypeAFurnitureFactory().getFurniture(furn);
                break;
            
            case 'B':
                furniture = new TypeBFurnitureFactory().getFurniture(furn);
                break;
        }
    }
    public void buyFurniture(String furn, char objType)
    {
        Furniture furniture = null;
        switch(objType)
        {
            case 'A':
                furniture = new TypeAFurnitureFactory().getFurniture(furn);
                furniture.buyFur();
                break;
            
            case 'B':
                furniture = new TypeBFurnitureFactory().getFurniture(furn);
                furniture.buyFur();
                break;
        }
    }
}
public class FurnitureShop
{
    public static void main(String[] args) {
        Customer c = new Customer();
        c.showFurniture("Chair", 'A');
        c.showFurniture("Chair", 'B');
        c.showFurniture("Table", 'A');
        c.showFurniture("Table", 'B');
        System.out.println();
        c.buyFurniture("Table", 'A');
        c.buyFurniture("Chair", 'B');
    }
}