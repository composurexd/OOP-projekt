package org.runtimeterror;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.Arrays;

public class Controller {
    
    // Field is bound in paint.fxml
    @FXML
    public Button testButton;

    @FXML
    public HBox toolbarButtons;

    // On app init (everything has been bound)
    @FXML
    public void initialize() {
        IToolController[] toolControllers = ToolControllerFactory.createToolControllers();
        Arrays.stream(toolControllers).forEach(c -> toolbarButtons.getChildren().add(c.getButton()));
    }

    // Method bound in paint.fxml
    @FXML
    public void testButtonClick(ActionEvent ev) {
        System.out.println("Button clicked!");
    }

}
