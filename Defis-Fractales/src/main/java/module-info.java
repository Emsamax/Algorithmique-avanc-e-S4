module com.example.defisfractales {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.defisfractales to javafx.fxml;
    exports com.example.defisfractales;
}