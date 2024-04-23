package com.example.carinformationproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("hello-view.fxml"), 700, 700);
        stage.setTitle("CAR ESTIMATOR!");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml){
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        launch();
//Polymorphism  (this was transferred to controller class)
/* Car c1=new ElectricCar("BMW","i4",2024,"Blue","Electric",109.00);
        System.out.print(c1.toString());
        double cost=c1.getAverageCarCost();
        System.out.println("THE COST OF THIS CAR IS AROUND "+ cost);
        System.out.println("=============================================");
//Polymorphism
        Car c2=new GasolineCar("Hyundai","Elantra",2013,"Black","Gasoline",200.0);
        System.out.print(c2.toString());
        cost=c2.getAverageCarCost();
        System.out.println("THE COST OF THIS CAR IS AROUND "+ cost);
        System.out.println("=============================================");
*/

    }

}