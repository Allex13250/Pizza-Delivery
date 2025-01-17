package com.example.pizza_delivery;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaDeliveryController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private void createOrder(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("CreateOrder.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void showOrder(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ShowOrder.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}