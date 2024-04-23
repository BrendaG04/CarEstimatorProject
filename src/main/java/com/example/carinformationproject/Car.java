package com.example.carinformationproject;

public abstract class Car {
    protected int year;
    protected String model;
    protected String make;
    protected String color;
    protected String CarType;

//DEFAULT CONSTRUCTORS
    public Car (){
        this.year=0;
        this.model=" ";
        this.make="";
        this.color=" ";
    }

//PARAMETRIC CONSTRUCTOR
    public Car(int _year,String _model, String _make, String _color){
        this.year=_year;
        this.model=_model;
        this.make=_make;
        this.color=_color;
    }

//COPY CONSTRUCTOR
    public Car(Car C){
        this.year=C.year;
        this.model=C.model;
        this.make=C.make;
        this.color=C.color;
    }
//Getters
    public int getYear() {
        return this.year;
    }
    public String getModel() {
        return this.model;
    }
    public String getMake() {
        return this.make;
    }
    public String getColor() {
        return this.color;
    }

//Abstract needed to estimate cost
public abstract double cost();
public double getAverageCarCost(){
    return 0;
}

//OUTPUTTING BASIC INFO
    @Override
    public String toString() {
        String content=" ";
        content="Car Type: "+ this.CarType+" \nCar Model: "+this.getModel()+"\nCar Make: "+
                this.getMake()+"\nCar Year: "+ this.getYear() +"\nCar Color: "+ this.getColor();
        return content;
    }
}
