module org.example.propuestaproyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.propuestaproyecto to javafx.fxml;
    exports org.example.propuestaproyecto;
}