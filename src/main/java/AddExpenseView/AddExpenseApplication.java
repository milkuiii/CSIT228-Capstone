package AddExpenseView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddExpenseApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(AddExpenseApplication.class.getResource("/AddExpenseView/AddExpenseView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Add Expense View");
        stage.setScene(scene);
        stage.show();
    }
}
