import javax.swing.JOptionPane;

public class NameConfirmation {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
    
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to show your name?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; // Exit after showing the name
            } 
            
        }
    }
}
