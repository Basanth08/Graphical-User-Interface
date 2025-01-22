package unit04.reversi.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class moveMaker implements EventHandler <ActionEvent> {

    private final int row;
    private final int col;

    private final ReverseGUI gui;

    public moveMaker(int row, int col, ReverseGUI gui){
        this.row = row;
        this.col = col;
        this.gui = gui;
    }
    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
        gui.makeMove(row, col);
        
    }
    
}
