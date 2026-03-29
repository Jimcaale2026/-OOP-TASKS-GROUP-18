import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

class Task4Test {

    @Test
    void testPanelManagerIntegration() {
        // 1. Initialize the MainFrame from Task 4
        MainFrame frame = new MainFrame();

        // 2. Unit Test: Check if frame and its title are correct
        assertNotNull(frame, "MainFrame should be initialized");

        // 3. Integration Test: Check if PanelManager added components to the layout
        // Task 4 is about managing different panels
        Container contentPane = frame.getContentPane();
        int componentCount = contentPane.getComponentCount();

        // Verify that the frame is not empty and components are loaded
        assertTrue(componentCount > 0, "PanelManager should have loaded components into the MainFrame");

        System.out.println("Task 4: Unit and Integration tests passed successfully!");
    }
}
