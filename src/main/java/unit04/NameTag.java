package unit04;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NameTag extends Application{
    

    @Override
    public void start(Stage stage) throws Exception{
        Label hello = new Label("HELLO MY NAME IS");
        hello.setTextFill(Color.BLUE);
        hello.setFont(new Font("IMPACT", 30));
        hello.setAlignment(Pos.CENTER);

        Label yourName = new Label("Your Name");
        yourName.setTextFill(Color.RED);
        yourName.setFont(new Font("Comic Sans MS", 80));

        VBox top = new VBox();
        top.getChildren().addAll(hello, yourName);
        top.setBorder(new Border (new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID,
                        new CornerRadii(10), BorderStroke.THICK)));
        
        TextField entry = new TextField();
        entry.setPromptText("Enter Your Name");

        Button update = new Button ("Update Name Tage");
        Button clear = new Button ("Clear");

        VBox box = new VBox();
        box.getChildren().addAll(top, entry, update, clear);

        Scene scene = new Scene(box);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
