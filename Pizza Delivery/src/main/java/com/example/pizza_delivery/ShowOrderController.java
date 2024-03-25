package com.example.pizza_delivery;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowOrderController implements Initializable {

    private Button CancelOrderButton;

    public void ShowOrderController(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(PizzaDelivery.class.getResource("CreateOrder.fxml"));
        Stage stage = (Stage) CancelOrderButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Label SizeLabel;

    @FXML
    private ChoiceBox<String> pizzaChoice;

    private String[] sizes = {"SMALL", "MEDIUM", "LARGE", "EXTRA_LARGE"};

    public void initialize(URL arg0, ResourceBundle arg1){
        pizzaChoice.getItems().addAll(sizes);
    }
}
