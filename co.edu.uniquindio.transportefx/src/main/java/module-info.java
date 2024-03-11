module co.edu.uniquindio.transportefx.transporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.transportefx.transporteapp to javafx.fxml;
    exports co.edu.uniquindio.transportefx.transporteapp;
}