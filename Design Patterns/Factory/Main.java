package Factory;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String text = JOptionPane.showInputDialog(null);

        Message msg = MessageFactory.getMessage(0);
        msg.send(text);
    }
}
