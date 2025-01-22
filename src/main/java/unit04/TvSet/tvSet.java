package unit04.TvSet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class tvSet extends Application {

    private Channel[] channels = new Channel[10];
    private int currentChannel = 0;
    private MediaPlayer mediaPlayer;
    private ImageView display;
    private Text description;
    private Slider volumeSlider;
    private Text volumeDisplay;

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        // Creating the 10 channels 
        for(int i = 0; i < 10; i++) {
            String imagePath = "/Users/varagantibasanthkumar/Desktop/media/images/tv_shows" + i + ".jpg"; 
            String audioPath = "/Users/varagantibasanthkumar/Desktop/media/sounds/tv_shows" + i + ".mp3"; 
            Channel channel = new Channel("Channel " + i, imagePath, audioPath);
            channels[i] = channel;
        }

        // ImageView to display channel content
        display = new ImageView();
        pane.setCenter(display);

        // Text for channel description
        description = new Text();
        description.setWrappingWidth(300);
        description.setText(channels[currentChannel].getDescription());
        pane.setBottom(description);

        // Buttons for changing channels
        HBox channelButtons = new HBox(10); // Container for channel buttons
        for(int i=0; i<10; i++){
            Button button = new Button("" + i);
            int channelNumber = i; 
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    changeChannel(channelNumber);
                }
            });
            channelButtons.getChildren().add(button);
        }
        pane.setTop(channelButtons);

        // Volume control
        volumeSlider = new Slider(0, 10, 5); 
        volumeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            setVolume(newVal.doubleValue() / 10);
        });
        volumeDisplay = new Text("Volume: 5"); 
        HBox volumeBox = new HBox(10, volumeSlider, volumeDisplay);
        pane.setRight(volumeBox);

        // Setting up scene and show
        changeChannel(0);
        Scene scene = new Scene(pane, 600, 400);  
        primaryStage.setScene(scene);
        primaryStage.setTitle("My TV Simulator"); 
        primaryStage.show();
    }

    // Changes to the given channel number
    private void changeChannel(int channelNum){
        if(mediaPlayer != null){
            mediaPlayer.stop(); 
        }

        currentChannel = channelNum;
        mediaPlayer = channels[channelNum].getMediaPlayer(); 
        mediaPlayer.play();

        display.setImage(channels[currentChannel].getImage());
        description.setText(channels[currentChannel].getDescription());
    }

    private void setVolume(double volume) {
        if(mediaPlayer != null) {
            mediaPlayer.setVolume(volume);
            volumeDisplay.setText("Volume: " + Math.round(volume * 10));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
