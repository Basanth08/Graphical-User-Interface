package unit04;

import javafx.event.ActionEvent;
import javafx.event.EventHandler; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Updater implements EventHandler<ActionEvent> { 

    private final Label name;
    private final TextField entry;

    public Updater(Label name, TextField entry) { 
        this.name = name;
        this.entry = entry;
    }

    @Override
    public void handle(ActionEvent arg0) {
        name.setText(entry.getText());
    }

}
