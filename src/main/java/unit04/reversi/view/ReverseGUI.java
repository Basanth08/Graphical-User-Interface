package unit04.reversi.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import unit04.reversi.model.Color;
import unit04.reversi.model.Reversi;
import unit04.reversi.model.ReversiException;
import unit04.reversi.model.Square;

public class ReverseGUI extends Application{


    public static Image SQUARE = new Image( "file:media/image/reversi/square.png");
    public static Image WHITE = new Image( "file:media/image/reversi/wihtepiece.png");
    public static Image BLACK = new Image( "file:media/image/reversi/blackpiece.png");
    public static Image BLANK = new Image( "file:media/image/reversi/blank.png");

    private Reversi game;
    private Label status;
    private Label p1Score;
    private Label p2Score;
    
    
    public Button makeReversiButton(int col, int row){

        
        Image image = SQUARE;

        if(game.getSquare(row, col).getOccupyingColor() == Color.WHITE){
            image = WHITE;
        }

        if(game.getSquare(row, col).getOccupyingColor() == Color.BLACK){
            image = BLACK;
        }

        ImageView view = new ImageView(image);
        Button button = new Button("");
        Square square = game.getSquare(row, col);
        square.setOnChange(new SquareChanger(view));
        button.setBackground(new Background(new BackgroundImage(SQUARE,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
        button.setOnAction(new moveMaker(row, col, this));
        return button;
    }
    

    public void makeMove(int row, int col){
        try{
            game.move(row,col);
        } catch (ReversiException re){
            System.out.println(re.getMessage());
        }
    }
    


    @Override
    public void start(Stage primaryStage) throws Exception{
        
        game = new Reversi();

        GridPane pane = new GridPane();

        for(int i = 0; i < Reversi.COLS; i++){
            for(int j = 0;j < Reversi.ROWS; i++){
                pane.add(makeReversiButton(i, j), i, j);
            }
        }


        Scene scene = new Scene(pane);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Reversi");primaryStage.show();
        primaryStage.show();

        // game.move(3, 4);
        // makeMove(2, 3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
