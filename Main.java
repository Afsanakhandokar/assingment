import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.chart.*;

public class MangoSalesApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        TextField txtMonthlySales = new TextField();
        TextField txtRevenue = new TextField();
        Button btnCalculateRevenue = new Button("Calculate Revenue");
        Button btnForecastSales = new Button("Forecast Sales");
        Button btnPromotions = new Button("Create Promotions");
        Button btnOptimizePricing = new Button("Optimize Pricing");

        // Chart for sales trends
        LineChart<String, Number> salesChart = createSalesTrendChart();

        // Layout for the UI
        VBox root = new VBox(10);
        root.getChildren().addAll(
                new Label("Enter Monthly Sales: "), txtMonthlySales,
                new Label("Total Revenue: "), txtRevenue,
                btnCalculateRevenue, btnForecastSales, btnPromotions, btnOptimizePricing,
                salesChart
        );

        // Set button actions
        btnCalculateRevenue.setOnAction(e -> calculateRevenue(txtMonthlySales, txtRevenue));
        btnForecastSales.setOnAction(e -> forecastSales(salesChart));
        btnPromotions.setOnAction(e -> createPromotions());
        btnOptimizePricing.setOnAction(e -> optimizePricing());

        // Set scene and stage
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Mango Garden Estate - Sales & Marketing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private LineChart<String, Number> createSalesTrendChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Months");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Sales Volume");

        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Sales Trend");

        // Example data for sales trend
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Sales in 2025");
        series.getData().add(new XYChart.Data<>("Jan", 200));
        series.getData().add(new XYChart.Data<>("Feb", 150));
        series.getData().add(new XYChart.Data<>("Mar", 220));
        series.getData().add(new XYChart.Data<>("Apr", 180));
        lineChart.getData().add(series);

        return lineChart;
    }

    private void calculateRevenue(TextField txtMonthlySales, TextField txtRevenue) {
        try {
            int monthlySales = Integer.parseInt(txtMonthlySales.getText());
            double pricePerMango = 1.5; // Example price per mango
            double revenue = monthlySales * pricePerMango;
            txtRevenue.setText("Revenue: $" + revenue);
        } catch (NumberFormatException e) {
            txtRevenue.setText("Invalid Sales Input");
        }
    }

    private void forecastSales(LineChart<String, Number> salesChart) {
        // Simulating sales forecast logic, can be replaced with actual forecast algorithm
        XYChart.Series<String, Number> forecastSeries = new XYChart.Series<>();
        forecastSeries.setName("Sales Forecast for 2025");
        forecastSeries.getData().add(new XYChart.Data<>("May", 230));
        forecastSeries.getData().add(new XYChart.Data<>("Jun", 250));
        forecastSeries.getData().add(new XYChart.Data<>("Jul", 270));
        salesChart.getData().add(forecastSeries);
    }

    private void createPromotions() {
        // Example function to simulate promotion creation
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Promotion Created");
        alert.setHeaderText(null);
        alert.setContentText("New seasonal promotion is live! 20% off Mangoes.");
        alert.showAndWait();
    }

    private void optimizePricing() {
        // Example function to simulate dynamic pricing adjustment
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Pricing Optimized");
        alert.setHeaderText(null);
        alert.setContentText("Price optimized for the upcoming mango season: $1.25 per mango.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.layout.*;
        import javafx.stage.Stage;
import javafx.scene.chart.*;

public class MangoHarvestApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // UI Elements
        TextField txtCrewMember = new TextField();
        TextField txtHarvestedMangoes = new TextField();
        TextField txtHarvestTime = new TextField();
        Button btnAssignCrew = new Button("Assign Crew");
        Button btnTrackHarvest = new Button("Track Harvest");
        Button btnCalculateCost = new Button("Calculate Cost");
        Button btnOptimizeHarvest = new Button("Optimize Harvest");

        // Chart for crew performance
        BarChart<String, Number> performanceChart = createCrewPerformanceChart();

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                new Label("Enter Crew Member: "), txtCrewMember,
                new Label("Enter Harvested Mangoes: "), txtHarvestedMangoes,
                new Label("Enter Harvest Time (hours): "), txtHarvestTime,
                btnAssignCrew, btnTrackHarvest, btnCalculateCost, btnOptimizeHarvest,
                performanceChart
        );

        // Button Actions
        btnAssignCrew.setOnAction(e -> assignCrew(txtCrewMember));
        btnTrackHarvest.setOnAction(e -> trackHarvest(txtHarvestedMangoes, txtHarvestTime));
        btnCalculateCost.setOnAction(e -> calculateLaborCost(txtHarvestedMangoes, txtHarvestTime));
        btnOptimizeHarvest.setOnAction(e -> optimizeHarvesting(performanceChart));

        // Scene and Stage setup
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Mango Garden Estate - Harvesting Crew Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private BarChart<String, Number> createCrewPerformanceChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Crew Members");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Mangoes Harvested");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Crew Harvest Performance");

        // Example data
        XYChart.Series<String, Number> series = new XYChart.Series<>();

