module com.main.javacompiler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.javacompiler to javafx.fxml;
    exports com.main.javacompiler;
}