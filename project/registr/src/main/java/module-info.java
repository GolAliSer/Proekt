module com.example.registr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registr to javafx.fxml;
    exports com.example.registr;
}