import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

class Task3Test {

    @Test
    void testTask3Integration() {
        // 1. Initialize Task 3 MainFrame
        MainFrame frame = new MainFrame();

        // 2. Unit Test: Check if frame is created
        assertNotNull(frame, "MainFrame should be initialized");

        // 3. Integration Test: Check if ColorPanel is added to the frame
        boolean colorPanelFound = false;
        Component[] components = frame.getContentPane().getComponents();

        for (Component comp : components) {
            if (comp instanceof ColorPanel) {
                colorPanelFound = true;
                break;
            }
        }

        // Verify integration success
        assertTrue(colorPanelFound, "ColorPanel not found inside MainFrame");

        System.out.println("Task 3: Unit and Integration tests passed!");
    }
}
