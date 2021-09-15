package org.runtimeterror.toolcontrollers;

import javafx.scene.control.ToggleButton;
import org.runtimeterror.IToolController;

public class TestToolController implements IToolController {

    private final ToggleButton toggleButton = new ToggleButton("Test");

    @Override
    public ToggleButton getButton() {
        return toggleButton;
    }

}
