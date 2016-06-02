package fxPackage;

/**
 * 6-1-16
 * @author htha9587
 * Version 0.1
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
public class FXMain extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Pane root = new Pane();
        Button btn = new Button();
        Canvas canvas = new Canvas(300, 250);
        StackPane holder = new StackPane();
        holder.getChildren().add(canvas);
        root.getChildren().add(holder);
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello World!");
			}
        });
        
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        holder.setStyle("-fx-background-color: gold");
        primaryStage.show();
    }
}
