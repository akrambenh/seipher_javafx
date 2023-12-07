package com.example.seipher;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;

public class modernCrypt extends Application {
    private Stage stage;
    private Scene scene;
    @FXML
    ToggleGroup group = new ToggleGroup();
    @FXML
    private TextField input_text;
    @FXML
    private Button crypt_button, decrypt_button, back_button;
    @FXML
    private Label result_text;
    @FXML
    private RadioButton aes_radio, des_radio, rsa_radio;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
    public void onCryptButton(ActionEvent event){
        // Dir le code ta3 cryption hna
        String s = input_text.getText();
        if(aes_radio.isSelected()){

        }else if(des_radio.isSelected()){

        }else if(rsa_radio.isSelected()){

        }
        result_text.setText("crypted message"); // hadi badalha b variable String fih le message crypte
    }
    public void onDecryptButton(ActionEvent event){
        // dir le code ta3 decryption hna
        String s = input_text.getText();
        if(aes_radio.isSelected()){

        }else if(des_radio.isSelected()){

        }else if(rsa_radio.isSelected()){

        }
        result_text.setText("decrypted message"); // hadi badalha b variable String fih le message decryptre
    }
    @FXML
    public void onBackButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
