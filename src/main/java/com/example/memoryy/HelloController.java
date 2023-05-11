package com.example.memoryy;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import java.net.URL;


import javafx.fxml.FXML;

public class HelloController {

    @FXML
    private Button quitButton;

    @FXML
    private void handleQuitButtonAction(ActionEvent event) {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private Button startButton;

    @FXML
    private void handleStartButtonAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        URL location = new URL("file:///C:/Users/Emili/Documents/Webstart_2/Java/Projet/Memoryy/src/main/resources/com/example/memoryy/game-view.fxml");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(location);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

