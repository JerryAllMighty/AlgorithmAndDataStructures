module com.main.javacompile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.javacompile to javafx.fxml;
    exports com.main.javacompile;
}