module com.example.week6_figmatocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week6_figmatocode to javafx.fxml;
    exports com.example.week6_figmatocode;
}