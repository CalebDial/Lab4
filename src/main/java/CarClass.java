/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caleb
 */
public class CarClass {
  private final String myMake;
    private final int myYearModel;
    private double mySpeed;
    CarClass(int yearModel, String make){
        this.myYearModel = yearModel;
        this.myMake = make;
        this.mySpeed = 0;
    }
    public String getMyMake() {
        return myMake;
    }
    public int getMyYearModel() {
        return myYearModel;
    }
    public double getMySpeed() {
        return mySpeed;
    }
    public void accelerate() {
        this.mySpeed = this.mySpeed + 5;
    }
    public void brake() {
        this.mySpeed = this.mySpeed - 5;
    }
    public static void main(String [] args) {
        
        CarClass myLambo = new CarClass(2019, "Lamborghini");
        
 
        System.out.println("Buckle up!....");
        
        int xLoop = 0; 
        while (xLoop <= 4) 
        { 
            myLambo.accelerate();
            System.out.println(myLambo.getMySpeed() + "MPH");
 
            xLoop++; 
        } 
       
        xLoop = 0;
        while (xLoop <= 4) 
        { 
            myLambo.brake();
            System.out.println(myLambo.getMySpeed() + "MPH");
  
            xLoop++; 
        } 
        }
}
