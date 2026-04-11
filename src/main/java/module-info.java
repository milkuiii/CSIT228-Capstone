module com.example.wildkatseye {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wildkatseye to javafx.fxml;
    exports com.example.wildkatseye;
}