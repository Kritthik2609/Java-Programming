import javax.swing.*;
import java.awt.*;

public class GUIDemo {
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(300,150);
		mainFrame.setTitle("Swing GUI");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2, 10,10));
		
		JLabel userLabel = new JLabel("User Name");
		JTextField userField = new JTextField();
		
		JLabel pwdLabel = new JLabel("Password");
		JPasswordField pwdField = new JPasswordField();
		
		JButton loginbtn = new JButton("Login");
		
		panel.add(userLabel);
		panel.add(userField);
		panel.add(pwdLabel);
		panel.add(pwdField);
		panel.add(new JLabel(""));
		panel.add(loginbtn);
		
		mainFrame.add(panel);
		
		
		
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
}
