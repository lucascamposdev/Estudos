package Factory;

import javax.swing.JOptionPane;

public class MessageSMS implements Message {
    @Override
    public void send(String message) {
        JOptionPane.showMessageDialog(null, "SMS: " + message);
    }
}