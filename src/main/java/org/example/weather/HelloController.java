/*import javafx.fxml.FXML;
import javafx.scene.control.Label;

@FXML
private Label welcomeText;

@FXML
protected void onHelloButtonClick() {
    welcomeText.setText("Welcome to JavaFX Application!");
}*/

package org.example.weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class HelloController {


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
              String getUserCity = city.getText().trim();
             String output = getUrlContent("https://api.openweathermap.org/data/2.5/weather?q="+ getUserCity + "&appid=18bdb99f32bdecfefd54e6ed2ba61b67&units=metric&lang=ru");
             System.out.println(output);
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

    private  static String getUrlContent(String urlAdress){
        StringBuffer content = new StringBuffer();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while ((line=bufferedReader.readLine()) != null){
                content.append(line+"\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("такой город не был найден");
        }
        return content.toString();
    }

}
