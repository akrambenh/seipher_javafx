package com.example.seipher;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class classicCrypt extends Application {
    private Stage stage;
    private Scene scene;

    @FXML
    private Button back_button, cryptButton, decryptButton;
    @FXML
    private Label result_text;
    @FXML
    private TextField input_text;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void onBackButtonClick(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public  void onCryptButtonClick(ActionEvent event){
        String m = input_text.getText();
        // Your code here
        result_text.setText("message"); // hna dir le variable a affiche
    }
    public  void onDecryptButtonClick(ActionEvent event){
        String m = input_text.getText();
        // Your code here
        result_text.setText("message"); // hna dir le variable a affiche
    }
}
