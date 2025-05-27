package org.example.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends javafx.application.Application {
    public HelloApplication() {}
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("project1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 290, 580);
        stage.setTitle("Погода");
     stage.setScene(scene);
        stage.setResizable(false); //трансформация окна приложения
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}