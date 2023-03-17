module intern_java.intern_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens intern_java.intern_java to javafx.fxml;
    exports intern_java.intern_java;
}