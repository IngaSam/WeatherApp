/*import javafx.fxml.FXML;
import javafx.scene.control.Label;

@FXML
private Label welcomeText;

@FXML
protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
}*/

package org.example.weather;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HelloController {
 /*@FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");}*/

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city;

    @FXML
    private Button getData;

    @FXML
    private ImageView image;

    @FXML
    private Text pressure;

    @FXML
    private Text temp_feels;

    @FXML
    private Text temp_info;

    @FXML
    private Text temp_max;

    @FXML
    private Text temp_min;

    @FXML
    public void initialize() {
       if (getData != null) {
          getData.setOnAction(event -> {
             System.out.println("Всё работает!");
          });
       }else {
          System.out.println("null fxml");
       }

        // Загрузка изображения программно
        try {
            Image weatherImage = new Image(getClass().getResource("weather.png").toExternalForm()); // Укажите правильный путь
            image.setImage(weatherImage);
        } catch (Exception e) {
            System.err.println("Не удалось загрузить изображение: " + e.getMessage());
        }

    }

}
