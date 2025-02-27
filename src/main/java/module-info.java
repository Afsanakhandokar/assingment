module iub.demo6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens iub.demo6 to javafx.fxml;
    exports iub.demo6;
}