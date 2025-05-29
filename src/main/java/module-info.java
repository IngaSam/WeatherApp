module org.example.weather {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    opens org.example.weather to javafx.fxml;
    exports org.example.weather to javafx.graphics;
}