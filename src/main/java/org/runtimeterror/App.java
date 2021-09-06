package org.runtimeterror;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("paint.fxml"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}