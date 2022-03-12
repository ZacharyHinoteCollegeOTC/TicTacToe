/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Zachary Hinote
 */
public class TicTacToe extends Application {
    
    
    public void start(Stage primaryStage) {
        Image imageX = new Image("image/x.gif");
        Image imageO = new Image("image/o.gif");
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int status = (int) (Math.random() * 3);
                if (status == 0) {
                    pane.add(new ImageView(imageX), j, i);
                }
                else if (status == 1) {
                    pane.add(new ImageView(imageO), j, i);
                }
            }
        }
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Display Tick Tack Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
