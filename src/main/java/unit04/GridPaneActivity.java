package unit04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridPaneActivity extends Application {
    private static Label labelFactory(String text, Color foreground) {
        Label label = new Label(text);
        label.setFont(new Font("Comic sans", 48));
        label.setTextFill(foreground);
        label.setPadding(new Insets(10));
        label.setBackground(new Background(
                new BackgroundFill(Color.AQUAMARINE,
                        CornerRadii.EMPTY, Insets.EMPTY)));
        label.setAlignment(Pos.CENTER);

        label.setMaxHeight(Double.POSITIVE_INFINITY);
        label.setMaxWidth(Double.POSITIVE_INFINITY);

        return label;
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane(); // Create a new GridPane
        Label six = labelFactory("6", Color.BLACK);
        Label min = labelFactory("-", Color.BLACK);
        Label fiv = labelFactory("5", Color.BLACK);
        Label sev = labelFactory("7", Color.BLACK);
        Label eig = labelFactory("8", Color.BLACK);
        Label nin = labelFactory("9", Color.BLACK);
        Label mul = labelFactory("*", Color.BLACK);
        Label fou = labelFactory("4", Color.BLACK);
        Label one = labelFactory("1", Color.BLACK);
        Label two = labelFactory("2", Color.BLACK);
        Label thr = labelFactory("3", Color.BLACK);
        Label plu = labelFactory("+", Color.BLACK);
        Label zer = labelFactory("0", Color.BLACK);
        Label dot = labelFactory(".", Color.BLACK);
        Label eq = labelFactory("=", Color.BLACK);
        Label entry = labelFactory("", Color.BLACK); // Placeholder for entry display
        Label ac = labelFactory("AC", Color.BLACK); // Clear button
        Label per = labelFactory("%", Color.BLACK); // Percentage button
        Label div = labelFactory("/", Color.BLACK); // Division operator

        pane.add(entry, 0, 0, 4, 1);
        pane.add(ac, 0, 1, 2, 1);
        pane.add(per, 2, 1);
        pane.add(div, 3, 1);
        pane.add(sev, 0, 2);
        pane.add(eig, 1, 2);
        pane.add(nin, 2, 2);
        pane.add(mul, 3, 2);
        pane.add(fou, 0, 3);
        pane.add(fiv, 1, 3);
        pane.add(six, 2, 3);
        pane.add(min, 3, 3);
        pane.add(one, 0, 4);
        pane.add(two, 1, 4);
        pane.add(thr, 2, 4);
        pane.add(plu, 3, 4);
        pane.add(zer, 0, 5, 2, 1);
        pane.add(dot, 2, 5);
        pane.add(eq, 3, 5);

        Scene scene = new Scene(pane);
        stage.setTitle("Calciiiii");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
