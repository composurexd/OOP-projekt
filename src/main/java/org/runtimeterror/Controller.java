package org.runtimeterror;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    
    // Field is bound in paint.fxml
    @FXML
    public Button testButton;

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

}
