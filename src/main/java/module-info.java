module org.example.weather {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.weather to javafx.fxml;
    exports org.example.weather;
}