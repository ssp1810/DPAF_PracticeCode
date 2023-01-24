/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryDesign;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SHREYA
 */
//shape interface
interface Shape
{
   void draw();
}

interface PrinterFriendlyShape extends Shape{}
interface DisplayFriendlyShape extends Shape{}

class DisplayFriendlyCircle implements DisplayFriendlyShape
{
    private int xPos, yPos;
    private int radius;
    public DisplayFriendlyCircle(int x, int y, int r)
    {
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("DisplayFriendlyCircle constructor");
    }
    @Override
    public void draw()
    {
        System.out.println("DisplayFriendlyCircle draw()");
        //draw() implementation
    }
}
class DisplayFriendlyRectangle implements DisplayFriendlyShape
{
    private int lenght, height;
    public DisplayFriendlyRectangle(int l, int h)
    {
        lenght = l;
        height = h;
        System.out.println("DisplayFriendlyRectangle constructor");
    }
    @Override
    public void draw()
    {
        System.out.println("DisplayFriendlyRectangle draw()");
        //draw() implementation
    }
}
class PrinterFriendlyCircle implements PrinterFriendlyShape
{
    private int xPos, yPos;
    private int radius;
    public PrinterFriendlyCircle(int x, int y, int r)
    {
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("PrinterFriendlyCircle constructor");
    }
    @Override
    public void draw()
    {
        System.out.println("PrinterFriendlyCircle draw()");
        //draw() implementation
    }
}
class PrinterFriendlyRectangle implements PrinterFriendlyShape
{
    private int lenght, height;
    public PrinterFriendlyRectangle(int l, int h)
    {
        lenght = l;
        height = h;
        System.out.println("PrinterFriendlyRectangle constructor");
    }
    @Override
    public void draw()
    {
        System.out.println("PrinterFriendlyRectangle draw()");
        //draw() implementation
    }
}
interface ShapeFactory
{
    Shape getShape(String sourceType);
}

//displayFriendlyFactory.java
class DisplayFriendlyFactory implements ShapeFactory
{
    @Override
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
                return new DisplayFriendlyCircle(10, 10, 20);
            case "Rectangle":
                return new DisplayFriendlyRectangle(10, 20);
        }
        return null;
    }
}
//displayFriendlyFactory.java
class PrinterFriendlyFactory implements ShapeFactory
{
    @Override
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
                return new PrinterFriendlyCircle(10, 10, 20);
            case "Rectangle":
                return new PrinterFriendlyRectangle(10, 20);
        }
        return null;
    }
}
//canvas where instances are created
//canvas can also be included in main class

class Canvas
{
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();
    public void addNewShape(String shapeType, String objectType)
    {
        Shape shape = null;
        switch(objectType)
        {
            case "DisplayFriendly":
                shape = new DisplayFriendlyFactory().getShape(shapeType);
                break;
                
            case "PrinterFriendly":
                shape = new PrinterFriendlyFactory().getShape(shapeType);
                break;
        }
        shapeList.add(shape);
    }
    public void redraw() 
    {
        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()) 
        {
            Shape shape = itr.next();
            shape.draw();
        }
    }
}
public class Test {
    public static void main(String[] args) 
    {
        Canvas canvas = new Canvas();
        canvas.addNewShape("Circle", "DisplayFriendly");
        canvas.addNewShape("Rectangle", "DisplayFriendly");
        canvas.redraw();
    }
}
