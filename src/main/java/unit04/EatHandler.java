package unit04;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.MediaPlayer;

public class EatHandler implements EventHandler <ActionEvent> {

    private final MediaPlayer player;

    public EatHandler (MediaPlayer player){
        this.player = player;
    }

    @Override
    public void handle(ActionEvent arg0){
        player.stop();
        player.play();
    }
    
}
