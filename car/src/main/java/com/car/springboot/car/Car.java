
package com.car.springboot.car;

public class Car {
    private int modelYear;
    private String modelName;
    private String bodyShape;
    private int milesDriven;
    private String carColor;

    
    public Car() {
    }
    
    public Car(int year, String name, String body, int miles, String color) {
        this.modelYear = year;
        this.modelName = name;
        this.bodyShape = body;
        this.milesDriven = miles;
        this.carColor = color;
    }
    
    // Getter methods
    public int getModelYear() {                   //  Get YEAR
        return modelYear;
    }

    public String getModelName() {           // Get NAME
        return modelName;
    }
    
    public String getBodyShape() {            // Get SHAPE
        return bodyShape;
    }

    public int getMilesDriven() {                 // Get MILES
        return milesDriven;
    }

    public String getCarColor() {               // Get COLOR
        return carColor;
    }

    // Setter methods
    public void setModelYear(int modelYear) {               // Set YEAR
        this.modelYear = modelYear;
    }

    public void setModelName(String modelName) {     // Set NAME
        this.modelName = modelName;
    }
    
    
    public void setBodyShape(String bodyShape) {
        this.bodyShape = bodyShape;
    }

    public void setMilesDriven(int milesDriven) {           // Set MILES
        this.milesDriven = milesDriven;
    }

    public void setCarColor(String carColor) {               // Set COLOR
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "\nModel Year: " + modelYear + "\nModel Name: " + modelName
                                             + "\nMile Driven: " + milesDriven + "\nBody Shape: "
                                            + bodyShape + "\nCar Color: " + carColor + "\n"; 
    }
    
}