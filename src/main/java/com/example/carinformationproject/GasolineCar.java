package com.example.carinformationproject;

public class GasolineCar extends Car implements AverageCost{
    protected int drivingRange;

//Parametric Constructor
    GasolineCar (String _model,String _make,  int _year, String _color, String _CarType,int _drivingRange){
        super(_year, _model, _make, _color);
        this.CarType=_CarType;
        this.drivingRange=_drivingRange;
    }


//FINDING ESTIMATE COST
    @Override
    public double cost(){
        double cost = 0.0;
        if (this.CarType.equals("Gasoline"))
            cost = 0.0 + 10000;
        if (year < 2020)
            cost = cost-5000;
        if (drivingRange>200)
            cost = cost-1000;
        return cost;
    }
//Interface
    public double getAverageCarCost() {
        return AverageCost.AverageCarCost(cost());
    }


//OUTPUTTING BASIC INFO + MILES
    @Override
    public String toString() {
        String content=super.toString();
        content= content+ "\nDriving Range: "+drivingRange+
                "miles \n";
        return content;
    }
}
