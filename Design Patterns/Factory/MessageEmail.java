package Factory;

import javax.swing.*;

public class MessageEmail implements Message{
    @Override
    public void send(String message) {
            JOptionPane.showMessageDialog(null, "Email: " + message);
    }
}
