module com.example.pizza_delivery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizza_delivery to javafx.fxml;
    exports com.example.pizza_delivery;
}