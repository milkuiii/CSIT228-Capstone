package MainView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainViewApplication extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/MainView/MainView.fxml"));
        if(loader.getLocation() == null) {
            throw new RuntimeException("Error: Could not find MainView.fxml!");
        }
        Scene scene = new Scene(loader.load());
        stage.setTitle("Personal Finance Tracker");
        stage.setScene(scene);
        stage.show();
    }
}
