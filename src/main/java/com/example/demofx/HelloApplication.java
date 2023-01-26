package com.example.demofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane borderPane=new BorderPane();

        // установка надписи
        Text text = new Text("Play music!!!!!!!");
        text.setLayoutX(600);   // установка положения надписи по оси X
        text.setLayoutY(340);    // установка положения надписи по оси Y
        Media media=new Media("https://github.com/istrebitelantox/photo/blob/main/e.mp3");
        MediaPlayer mediaPlayer=new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnReady(stage::sizeToScene);
        MediaView mediaView=new MediaView(mediaPlayer);
        mediaView.setLayoutX(1000);
        mediaView.setLayoutY(200);
        Button button=new Button("PLAY MUSIC!!!");
        button.setLayoutX(600);   // установка положения надписи по оси X
        button.setLayoutY(360);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText("cat");
            }
        });
        Group group = new Group(text,borderPane,mediaView);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Cat Music");

        stage.setWidth(1280);
        stage.setHeight(720);
        stage.show();
    }
}