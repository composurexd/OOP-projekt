package org.runtimeterror;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
    
    // Field is bound in paint.fxml
    @FXML
    public Button testButton;

    @FXML
    public VBox vbox;
    public Stage stage;

    @FXML
    public Button exit;

    // On app init (everything has been bound)
    @FXML
    public void initialize() {
        System.out.println(testButton);
    }

    // Method bound in paint.fxml
    @FXML
    public void testButtonClick(ActionEvent ev) {
        System.out.println("Button clicked!");
    }

    @FXML
    public void exitAction(ActionEvent event) {
        stage = (Stage) vbox.getScene().getWindow();
        stage.close();

    }

}
