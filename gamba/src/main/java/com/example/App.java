package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Login login = new Login();
        login.display();
        String username = login.getUsername();

        if (username == null || username.isEmpty()) {
            System.out.println("No username provided. Exiting.");
            return;
        }

        Main main = new Main();
        main.start(primaryStage, username);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
