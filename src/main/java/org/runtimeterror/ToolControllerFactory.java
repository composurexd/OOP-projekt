package org.runtimeterror;

import org.runtimeterror.toolcontrollers.TestToolController;

public class ToolControllerFactory {

    public static IToolController[] createToolControllers() {
        return new IToolController[] {
                new TestToolController(),
                new TestToolController(),
                new TestToolController()
        };
    }

}
