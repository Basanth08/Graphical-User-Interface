package unit04;

import unit04.*;

import java.io.File;
import java.io.FilePermission;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class PacMan extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{

        String pathBuzz = "media/sounds/buzzer.wav";
        String pathEat = "media/sounds/eat.wav";
        String pathChomp = "media/sounds/chomp.wav";
        // String pathEnd = "media/sounds/buzzer.wav";
        String uriB = new File(pathBuzz).toURI().toString();
        Media mediaB = new Media(uriB);
        MediaPlayer playerB = new MediaPlayer(mediaB);
        Button buzzer = new Button("buzzer");
        buzzer.setOnAction(new StartHandler(playerB));

        String uriE = new File(pathEat).toURI().toString();
        Media mediaE = new Media(uriE);
        MediaPlayer playerE = new MediaPlayer(mediaE);
       

        Button eat = new Button("eat");
        eat.setOnAction(new StartHandler(playerE));
        String uriC = new File(pathChomp).toURI().toString();
        Media mediaC = new Media(uriC);
        MediaPlayer playerC = new MediaPlayer(mediaC);       

        Button chomp = new Button("chomp");
        eat.setOnAction(new StartHandler(playerC));
        // String uriB = new File(pathBuzz).toURI().toString();
        // Media mediaB = new Media(uriB);
        // MediaPlayer playerB = new MediaPlayer(mediaB);
        // Button buzzer = new Button("buzzer");
        // buzzer.setOnAction(new StartHandler(playerB));

        VBox buzz = new VBox();
        buzz.getChildren().addAll(buzzer,eat,chomp);




        Scene scene = new Scene(buzz);
        primaryStage.setTitle("My first JavaFx GUI ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
