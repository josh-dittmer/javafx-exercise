package org.example.javafxexercise1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        pane.setHgap(10.0);
        pane.setVgap(10.0);

        addStudents(pane);

        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 1024, 768);

        stage.setTitle("Exercise 1");
        stage.setScene(scene);
        stage.show();
    }

    public void addStudents(GridPane pane) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("1234", "Test #1"));
        students.add(new Student("5678", "Test #2"));

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);

            VBox card = new VBox(10.0);

            Text text = new Text("ID: " + s.getId() + "\n\nName: " + s.getName());
            text.setFill(Color.WHITE);
            text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

            //card.getChildren().addAll(bg);
            card.getChildren().addAll(text);
            card.setPadding(new Insets(10));
            card.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, null, null)));
            card.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

            //pane.getChildren().addAll(card);
            pane.add(card, 1, i);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}