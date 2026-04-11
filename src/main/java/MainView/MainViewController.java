package MainView;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class MainViewController {
    @FXML private PieChart pieChart;
    @FXML private BarChart<String, Number> barchart;
    @FXML private VBox transactionContainer;
    @FXML private VBox legendContainer;
    @FXML private Label totalAmountLabel;

    @FXML
    public void initialize() {

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Food", 450),
                new PieChart.Data("Rent", 1200),
                new PieChart.Data("Savings", 300)
        );
        pieChart.setData(pieData);
        pieChart.setLegendVisible(false);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double[] values = {1200, 1100, 1500, 900, 1300, 1400, 1000, 1600, 1250, 1100, 1450, 2000};

        for (int i = 0; i < months.length; i++) {
            series.getData().add(new XYChart.Data<>(months[i], values[i]));
        }
        barchart.getData().add(series);

        addTransactionRow("Starbucks", "Food", "Apr 10", "-P250");
        addTransactionRow("Salary", "Income", "Apr 09", "+P25k");
        addTransactionRow("Rent", "Bills", "Apr 01", "-P12k");
        addTransactionRow("Netflix", "Subs", "Mar 28", "-P549");

        setupDoughnutChart();
    }

    private void setupDoughnutChart() {
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Food & dining", 35),
                new PieChart.Data("Transport", 22),
                new PieChart.Data("Utilities", 16),
                new PieChart.Data("Entertainment", 12),
                new PieChart.Data("Others", 15)
        );

        pieChart.setData(pieData);

        String[] colors = {"#7cb342", "#4285f4", "#fbc02d", "#c2185b", "#e0e0e0"};

        int i = 0;
        for (PieChart.Data data : pieData) {
            String currentColor = colors[i % colors.length];
            data.getNode().setStyle("-fx-pie-color: " + currentColor);
            addLegendRow(data.getName(), (int)data.getPieValue() + "%", currentColor);
            i++;
        }
    }

    private void addLegendRow(String category, String percentage, String color) {
        HBox row = new HBox(10);
        row.setAlignment(Pos.CENTER_LEFT);

        Pane colorDot = new Pane();
        colorDot.setPrefSize(10, 10);
        colorDot.setStyle("-fx-background-color: " + color + "; -fx-background-radius: 3;");

        Label lblCat = new Label(category);
        lblCat.setTextFill(Color.BLACK);
        lblCat.setPrefWidth(120);
        lblCat.setStyle("-fx-font-size: 10;");

        Label lblPercent = new Label(percentage);
        lblPercent.setTextFill(Color.BLACK);
        lblPercent.setStyle("-fx-font-size: 10; -fx-font-weight: bold;");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        row.getChildren().addAll(colorDot, lblCat, spacer, lblPercent);
        legendContainer.getChildren().add(row);
    }

    private void addTransactionRow(String desc, String cat, String date, String amount) {
        HBox row = new HBox(5);
        Label lblDesc = new Label(desc); lblDesc.setPrefWidth(65); lblDesc.setStyle("-fx-font-size: 9;");
        Label lblCat = new Label(cat); lblCat.setPrefWidth(50); lblCat.setStyle("-fx-font-size: 9;");
        Label lblDate = new Label(date); lblDate.setPrefWidth(35); lblDate.setStyle("-fx-font-size: 9;");
        Label lblAmt = new Label(amount); lblAmt.setPrefWidth(40);

        String color = amount.contains("+") ? "#2e7d32" : "#c62828";
        lblAmt.setStyle("-fx-font-size: 9; -fx-font-weight: bold; -fx-text-fill: " + color + ";");

        row.getChildren().addAll(lblDesc, lblCat, lblDate, lblAmt);
        transactionContainer.getChildren().add(row);
    }
}