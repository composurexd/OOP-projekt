package org.runtimeterror;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.ZoomEvent;
import javafx.scene.layout.HBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    
    // Field is bound in paint.fxml
    @FXML
    public Button testButton;

    @FXML
    public HBox toolbarButtonsView;

    @FXML
    public ScrollPane scrollPane;

    @FXML
    public ImageView imageView;


    List<ToggleButton> toolbarButtonsList = new ArrayList<>();

    // On app init (everything has been bound)
    @FXML
    public void initialize() {
        // Create all tool controllers.
        IToolController[] toolControllers = ToolControllerFactory.createToolControllers();
        // For each tool controller
        Arrays.stream(toolControllers).forEach(tc -> {
            // Add tool controller button to view.
            toolbarButtonsView.getChildren().add(tc.getButton());
            // Add tool controller button to button list.
            toolbarButtonsList.add(tc.getButton());
            // When a button is selected.
            tc.getButton().selectedProperty().addListener(unused -> {
                if(tc.getButton().selectedProperty().get())
                    // Unselect all others.
                    toolbarButtonsList.stream().filter(b -> b != tc.getButton()).forEach(b -> b.setSelected(false));
            });
        });
    }

    // Method bound in paint.fxml
    @FXML
    public void testButtonClick(ActionEvent ev) {
        System.out.println("Button clicked!");
    }

    // Method to zoom in/out the image with ctrl+scroll
    @FXML
    public void zoom(ScrollEvent e) {
        if (e.isControlDown()) {
            double zoomFactor = 1.05;
            double deltaY = e.getDeltaY();
            if (deltaY < 0) {
                zoomFactor = 0.95;
            }
            imageView.setScaleX(imageView.getScaleX() * zoomFactor);
            imageView.setScaleY(imageView.getScaleX() * zoomFactor);
        }
    }
}
