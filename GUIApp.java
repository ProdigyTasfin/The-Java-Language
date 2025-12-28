import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class GUIApp {

    public static void main(String[] args) {
        // Run GUI code on the Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> startApp());
    }

    private static void startApp() {
        // Create a hidden parent frame
        JFrame frame = new JFrame("My First GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Take user input
        String name = JOptionPane.showInputDialog(
                frame,
                "Enter your name:",
                "Input",
                JOptionPane.QUESTION_MESSAGE
        );

        // Handle cancel or empty input safely
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    frame,
                    "No name entered!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    frame,
                    "Hello, " + name + "!",
                    "Welcome",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // Close the frame (since we only needed dialogs)
        frame.dispose();
    }
}
