import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class BorderLayoutDemoTest {

    @Test
    void testIntegrationAndUnit() {
        // 1. Initialize and run the original code
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.method();

        // 2. Integration: Find the created window in the system memory
        Window[] windows = Window.getWindows();
        JFrame foundFrame = null;
        for (Window w : windows) {
            if (w instanceof JFrame && "BorderLayout Demo".equals(((JFrame) w).getTitle())) {
                foundFrame = (JFrame) w;
            }
        }

        // 3. Testing assertions (Unit & Integration)
        assertNotNull(foundFrame, "Test Failed: Window not found!");

        // Check Frame size
        assertEquals(600, foundFrame.getWidth(), "Width should be 600");
        assertEquals(400, foundFrame.getHeight(), "Height should be 400");

        // Check Layout type
        assertTrue(foundFrame.getLayout() instanceof BorderLayout, "Layout must be BorderLayout");

        // Success message in console
        System.out.println("Testing Status: PASSED");

        // Close the window after test
        foundFrame.dispose();
    }
}
