package com.example.carinformationproject;

public interface AverageCost {
    double rate =1.28;
    static double AverageCarCost (double _cost){
        return _cost * rate;
    }
}
