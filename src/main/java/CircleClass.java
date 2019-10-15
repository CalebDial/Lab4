/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caleb
 */
import java.util.Scanner;
public class CircleClass {
     private double radius;
    private final double PI = 3.14159;
    CircleClass(double radius){
        this.radius = radius;
    }
    CircleClass(){
        this.radius = 0.00;
    }
    public void putRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getCircumference(){
        return this.PI * 2.0 * this.radius;
    }
    public double getArea(){
        return this.PI * this.radius * this.radius;
    }
    public double getDiameter(){
        return this.radius * 2;
    }

    public static void main(String[] args) {
        
        
        System.out.println("Please enter a radius for a circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        
        
        CircleClass newCircle = new CircleClass(radius);
        System.out.println("The circle you entered has a circumference of " + newCircle.getCircumference());
        
        System.out.println("The circle you entered has an area of " + newCircle.getArea());
        System.out.println("The circle you entered has a diameter of " + newCircle.getDiameter());

    }
}
