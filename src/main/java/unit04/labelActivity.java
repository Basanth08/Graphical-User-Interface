package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class labelActivity extends Application{

    private static Label labelFactory(String text, String font, Color fill, Color background,
                                    Color bColor, BorderStrokeStyle bStyle, int bRadii, BorderWidths width){
        Label label = new Label(text);
        label.setFont(new Font(font,45));
        label.setTextFill(fill);
        label.setPadding(new Insets(20));
        label.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, Insets.EMPTY)));
        label.setAlignment(Pos.BASELINE_RIGHT);
        label.setMaxHeight(Double.POSITIVE_INFINITY);
        label.setMaxWidth(Double.POSITIVE_INFINITY);
        label.setPadding(new Insets(10));
        label.setBorder(new Border(
                        new BorderStroke (bColor, bStyle, 
                                        new CornerRadii(bRadii), width)));

        return label;
    }

    @Override
    public void start(Stage stage) throws Exception{
        Label label = labelActivity.labelFactory("Varaganti", STYLESHEET_CASPIAN, Color.BEIGE, Color.AQUAMARINE,Color.ANTIQUEWHITE, BorderStrokeStyle.DASHED,10,BorderStroke.THICK);

        Label label2 = labelActivity.labelFactory("Basanth", STYLESHEET_CASPIAN, Color.BLUE, Color.AQUAMARINE,Color.ANTIQUEWHITE, BorderStrokeStyle.DASHED,10,BorderStroke.THICK);

        Label label3 = labelActivity.labelFactory("kumar", STYLESHEET_CASPIAN, Color.BLUE, Color.AQUAMARINE,Color.ANTIQUEWHITE, BorderStrokeStyle.DASHED,10,BorderStroke.THICK);
        // Label label2 = new Label("varaganti");
        // label2.setFont(new Font("Arial",50));
        // label2.setTextFill(Color.ALICEBLUE);
        // label2.setPadding(new Insets(12));
        // label2.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        // label2.setAlignment(Pos.BASELINE_RIGHT);
        // label2.setMaxHeight(Double.POSITIVE_INFINITY);
        // label2.setMaxWidth(Double.POSITIVE_INFINITY);

        // Label label3 = new Label("Kumar");
        // label3.setFont(new Font("Ms Comic Sans",45));
        // label3.setTextFill(Color.BEIGE);
        // label3.setPadding(new Insets(20));
        // label3.setBackground(new Background(new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY)));
        // label3.setAlignment(Pos.BASELINE_RIGHT);
        // label3.setMaxHeight(Double.POSITIVE_INFINITY);
        // label3.setMaxWidth(Double.POSITIVE_INFINITY);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(label, label2, label3);

        Scene scene = new Scene(hbox);
        stage.setTitle("Activity 4.1");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
     
}
