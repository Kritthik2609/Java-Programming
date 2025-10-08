import javax.swing.*;
import java.awt.*;

public class GUISignUpForm {
	public static void main(String[] args) {
		JFrame mainFrame= new JFrame();
		mainFrame.setSize(300, 300);
		mainFrame.setTitle("SignUpForm");
		
		JPanel mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(6, 2, 10,10));
		
		JLabel nameLabel = new JLabel("Name"); 
		JTextField nameField = new JTextField();
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		
		JLabel genderLabel = new JLabel("Gender");
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		ButtonGroup genButtonGroup = new ButtonGroup();
		genButtonGroup.add(male);
		genButtonGroup.add(female);
		
		JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel = new JLabel("Country");
		String[] countries = {"India", "USA", "Russia", "Canada", "Germany"};
		JComboBox<String> countryBox = new JComboBox<>(countries);
		
		JLabel addressLabel = new JLabel("Address");
		JTextArea addressArea = new JTextArea(3, 4);
		
		JButton submitbtn = new JButton("Submit");
		
		mainpanel.add(nameLabel); mainpanel.add(nameField);
		mainpanel.add(emailLabel); mainpanel.add(emailField);
		mainpanel.add(genderLabel); mainpanel.add(genderPanel);
		mainpanel.add(countryLabel); mainpanel.add(countryBox);
		mainpanel.add(addressLabel); mainpanel.add(addressArea);
		mainpanel.add(new JLabel("")); mainpanel.add(submitbtn);
		
		mainFrame.add(mainpanel);
		
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
}
