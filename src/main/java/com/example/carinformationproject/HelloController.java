package com.example.carinformationproject;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class HelloController {

    @FXML
    private TextField txtCarModel;
    @FXML
    private TextField txtCarMake;
    @FXML
    private TextField txtCarType;
    @FXML
    private TextField txtDrivingRange;
    @FXML
    private TextField txtCarColor;
    @FXML
    private TextField txtCarYear;
    @FXML
    private Label result;
    @FXML
    private Label money;
    @FXML
    private Button SubmitBTN;


    @FXML
    public void btnSubmit_Click(ActionEvent actionEvent) {
        String carType = txtCarType.getText();
        String model = txtCarModel.getText();
        String make = txtCarMake.getText();
        String color = txtCarColor.getText();
        int year = Integer.parseInt(txtCarYear.getText());
        int drivingRange = Integer.parseInt(txtDrivingRange.getText());

        if (carType.equals("Electric")) {
            Car c1 = new ElectricCar(model, make, year, color, carType, drivingRange);
            result.setText(c1.toString());
            double cost = c1.getAverageCarCost();
            money.setText("Cost: $"+ cost);
        }

        if (carType.equals("Gasoline")) {
            Car c2 = new GasolineCar(model, make, year, color, carType, drivingRange);
            result.setText(c2.toString());
            double cost = c2.getAverageCarCost();
            money.setText("Cost: $"+ cost);
        }

    }
}