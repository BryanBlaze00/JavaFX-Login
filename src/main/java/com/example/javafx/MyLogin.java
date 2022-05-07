package com.example.javafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MyLogin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MyLogin.fxml"));
        Scene scene = new Scene(root , 300 , 200, Color.TEAL);

        scene.getStylesheets().add(MyLogin.class.getResource("MyLogin.css").toExternalForm());

        stage.setTitle("My Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}