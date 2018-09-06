package cn.glbb.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class View extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        Image image = new Image("image/queen.jpg");
        ImageView imageView = new ImageView(image);
        gridPane.add(imageView,0,0);

        Scene scene = new Scene(gridPane,800,800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
