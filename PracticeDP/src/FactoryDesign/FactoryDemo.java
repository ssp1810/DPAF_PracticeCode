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
interface Shape{
    public void draw();
    public void fillColor();
}

//Circle.java
class Circle implements Shape
{
    private int xPos, yPos;
    private int radius;
    public Circle(int x, int y, int r)
    {
        xPos = x;
        yPos = y;
        radius = r;
        System.out.println("Circle constructor");
        System.out.println("(x, y): ( "+xPos+", "+yPos+" ) radius: "+radius);
    }

    @Override
    public void draw()
    {
        System.out.println("Circle draw()");
        //draw() implementation
    }

    @Override
    public void fillColor()
    {
        System.out.println("Color filled in Circle");
        //fillColor() implementation
    }
}

//Rectangle.java
class Rectangle implements Shape
{
    private int length, height;
    public Rectangle(int l, int h)
    {
        length = l;
        height= h;
        System.out.println("Rectangle constructor");
        System.out.println("l: "+length+" , h: "+height);
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle draw()");
        //draw() implementation
    }

    @Override
    public void fillColor()
    {
        System.out.println("Color filled in Rectangle");
        //fillColor() implementation
    }
}

//ShapeFactory.java
class ShapeFactory{
    public static Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
            return new Circle(10, 10, 20);

            case "Rectangle":
            return new Rectangle(12, 13);
        }
        return null;
    }
}
public class FactoryDemo {
    public static void main(String[] args) 
    {

        Shape shape1 = ShapeFactory.getShape("Circle");
        Shape shape2 = ShapeFactory.getShape("Rectangle");

        shape1.draw();
        shape1.fillColor();
        System.out.println();
        shape2.draw();
        shape2.fillColor();
        

    }
}
