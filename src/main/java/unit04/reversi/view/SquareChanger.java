package unit04.reversi.view;

import javafx.scene.image.ImageView;
import unit04.reversi.model.Square;
import unit04.reversi.model.SquareObsersver;

public class SquareChanger implements SquareObsersver {
    private final ImageView imageView;

    public SquareChanger(ImageView imageView){
        this.imageView = imageView;
    }

    @Override
    public void squareChanged(Square s) {
        // TODO Auto-generated method stub
        if (s.getOccupyingColor() = Color.WHITE){
            imageView.setImage(ReverseGUI.WHITE);
        }
        else if (s.getOccupyingColor() = Color.BLACK){
            imageView.setImage(ReverseGUI.BLACK);
        }
        else{
            imageView.setImage(ReverseGUI.BLANK);
        }
    }
    
}
