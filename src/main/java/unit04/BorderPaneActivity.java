package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BorderPaneActivity extends Application {

    private static Label labelFactory(String text, String font, Color fill, Color background,
                                      BorderStrokeStyle bStyle, double bRadii, BorderWidths width) {
        Label label = new Label(text);
        label.setFont(new Font(font, 45));
        label.setTextFill(fill);
        label.setBackground(new Background(new BackgroundFill(background, null, null)));
        label.setAlignment(Pos.CENTER);
        label.setPadding(new Insets(20));
        label.setMaxHeight(Double.POSITIVE_INFINITY);
        label.setMaxWidth(Double.POSITIVE_INFINITY);
        
        // Set the border of the label
        label.setBorder(new Border(new BorderStroke(Color.BLACK, bStyle, new CornerRadii(bRadii), width)));
        
        return label;
    }

    @Override
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();
        BorderStrokeStyle borderStyle = BorderStrokeStyle.SOLID;
        double cornerRadius = 5.0;
        BorderWidths borderWidth = new BorderWidths(2);

        pane.setTop(labelFactory("TOP", "Consolas", Color.WHITE, Color.DARKGOLDENROD, borderStyle, cornerRadius, borderWidth));
        pane.setBottom(labelFactory("BOTTOM", "Consolas", Color.WHITE, Color.CYAN, borderStyle, cornerRadius, borderWidth));
        pane.setLeft(labelFactory("LEFT", "Consolas", Color.WHITE, Color.BLACK, borderStyle, cornerRadius, borderWidth));
        pane.setRight(labelFactory("RIGHT", "Consolas", Color.WHITE, Color.CHOCOLATE, borderStyle, cornerRadius, borderWidth));
        pane.setCenter(labelFactory("CENTER", "Consolas", Color.WHITE, Color.LIGHTSEAGREEN, borderStyle, cornerRadius, borderWidth));

        Scene scene = new Scene(pane, 600, 400);
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
