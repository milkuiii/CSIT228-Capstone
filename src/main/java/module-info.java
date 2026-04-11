module com.example.wildkatseye {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;

    opens MainView to javafx.fxml;
    exports MainView;

    opens AddExpenseView to javafx.fxml;
    exports AddExpenseView;
}