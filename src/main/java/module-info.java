module com.example.wildkatseye {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;

    opens com.example.wildkatseye to javafx.fxml;
    exports com.example.wildkatseye;
}