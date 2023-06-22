package com.mycompany.shape_obj;

public class Rectangle implements Shape
{
    private float width,length;
    
    public Rectangle(float width,float length)
    {
        this.width=width;
        this.length=length;
    }
    
    public void setwidth(float width)
    {
        this.width=width;
    }
    
    public void setLength(float length)
    {
        this.length=length;
    }
    
    public float getWidth()
    {
        return width;
    }
    
    public float getLength()
    {
        return length;
    }
    
    @Override
    public double calculateArea()
    {
        return width*length;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return (2*width)+(2*length);
    }
    
}
