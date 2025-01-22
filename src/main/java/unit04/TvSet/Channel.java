package unit04.TvSet;

import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Channel {
    private String description;
    private Image image;
    private Media media;
    private MediaPlayer mediaPlayer;

    public Channel(String description, String imagePath, String audioPath){
        this.description = description;
        this.image = new Image(imagePath);
        this.media = new Media(audioPath);
        this.mediaPlayer = new MediaPlayer(media);
    }
    
    public String getDescription(){
        return description;
    }

    public Image getImage(){
        return image;
    }

    public void play(){
        mediaPlayer.play();
    }

    public void stop(){
        mediaPlayer.stop();
    }

    public double getVolume() {
        return mediaPlayer.getVolume();
    }

    public void setVolume(double volume) {
        mediaPlayer.setVolume(volume);
    }

    public void increaseVolume() {
        double currentVolume = mediaPlayer.getVolume();
        mediaPlayer.setVolume(Math.min(currentVolume + 0.1, 1.0));  
    }

    public void decreaseVolume() {
        double currentVolume = mediaPlayer.getVolume();
        mediaPlayer.setVolume(Math.max(currentVolume - 0.1, 0.0));  
    }
    
    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

}
