	 import javax.swing.*;
	 import java.awt.event.*;
	 import java.awt.*;
public class main  extends JFrame {

	 private JPanel panel; 
	 private JLabel messageLabel; 
	 private JTextField inputTextField; 
	 private JButton convertsButton; 
	 private JTextField answerTextField ; 
	
	 private final int WINDOW_WIDTH = 657; // Window width
	 private final int WINDOW_HEIGHT = 660; // Window height
	
	 public main()
	 {
	
	 setTitle("Word Reverse");
	 setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 Font font1 = new Font("Arial", Font.BOLD, 50);
	 
	 messageLabel = new JLabel("Word Reverse");
	 inputTextField = new JTextField(10);
	 convertsButton = new JButton("Convert word");
	 answerTextField = new JTextField(10);
	 convertsButton.addActionListener(new ButtonListener());	 
	 
	 messageLabel.setFont(font1);
	 inputTextField.setFont(font1);
	 convertsButton.setFont(font1);
	 answerTextField.setFont(font1);
	 
	 
	 
	 panel = new JPanel();
	 panel.add(messageLabel);
	 panel.add(inputTextField);
	 panel.add(convertsButton);
	 panel.add(answerTextField);
	 panel.setBackground(Color.CYAN);

	 add(panel);
	 setVisible(true);
	 }
	 
	 private class ButtonListener implements ActionListener
	 {
	 public void actionPerformed(ActionEvent e)
	 {
	 String input; 
	 input = inputTextField.getText();
	 if (e.getSource() == convertsButton)
	 {
	
	 char[] reverse = input.toCharArray();
	 String tempstr ="";
		// Reverses the word order
		for(int i=reverse.length-1;i > -1 ; i--) 
		{tempstr = tempstr + reverse[i];
	 }
		answerTextField.setText(tempstr);
	 }
	 }
	 }
	
	 public static void main(String[] args)
	 {
	 new main();
	 }
	 }
	

