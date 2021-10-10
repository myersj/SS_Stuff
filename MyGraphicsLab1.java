import javafx.application.Application; import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.input.*;
import javafx.beans.binding.DoubleBinding; import javafx.beans.property.DoubleProperty;
public class MyGraphicsLab1
{
    private static final int SCENE_WIDTH = 640;
    private static final int SCENE_HEIGHT = 480;
    private static final int CIRC_RADIUS = 35;
    private static final int CIRC_DIAMETER = 2 * CIRC_RADIUS;
    public static void main(String[] args){
        Application.launch(args);
    }

    public void start(Stage primaryStage) { 
        Circle circle = new Circle();
        circle.setRadius(CIRC_RADIUS);
        circle.setCenterX(0);
        circle.setCenterY(0);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.rgb(new java.util.Random().nextInt(256),
        new java.util.Random().nextInt(256),
        new java.util.Random().nextInt(256)));
    }
}
