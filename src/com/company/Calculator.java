package com.company;

public class Calculator {
    //properties to include width and height
    private int width;
    private int height;
    private String shape;

    //method to calculate area of a certain shape
    public void calculateArea (String name) {
        System.out.println ( name + " is " + width + " feet wide and " + height +
                " feet tall and the area is " + (width*height) + " square feet.");
    }

    //method for setting width
    public void setWidth(int widthOfShape) {
        width = widthOfShape;
    }
    public int getWidth () {
        return width;
    }

    //method for setting height
    public void setHeight(int heightOfShape) {
        height = heightOfShape;
    }
    public int getHeight () {
        return height;
    }
}