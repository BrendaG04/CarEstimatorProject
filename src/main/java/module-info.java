module com.example.carinformationproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.carinformationproject to javafx.fxml;
    exports com.example.carinformationproject;
}