package com.example;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main {

    public void start(Stage primaryStage, String username) {
        Label welcomeLabel = new Label("Welcome, " + username + "!");
        StackPane root = new StackPane(welcomeLabel);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
