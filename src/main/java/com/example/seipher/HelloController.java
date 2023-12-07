package com.example.seipher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Button classic_crypt_button, modern_crypt_button;
    @FXML
    protected void onModernCryptoButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(modernCrypt.class.getResource("moderncrypt-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onClassicCryptoButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(classicCrypt.class.getResource("classiccrypt-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}