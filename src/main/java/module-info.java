module org.example.javafxexercise1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxexercise1 to javafx.fxml;
    exports org.example.javafxexercise1;
}