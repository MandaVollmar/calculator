
package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator rectangleShape = new Calculator();

        rectangleShape.setHeight(5);
        rectangleShape.setWidth(5);

        String s = "The rectangle";
        rectangleShape.calculateArea("The rectangle");
    }
}