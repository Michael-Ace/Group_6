import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloWorld {
	 public static void main(String[] args) {
		 	JFrame frame = new JFrame("Hello World");
		 	
		 	JPanel panel = new JPanel(); 
		 	panel.setLayout(new GridLayout(3, 1));
		 	
		 	JLabel label1 = new JLabel("Michael Acebedo - 3005265952", SwingConstants.CENTER);
		 	JLabel label2 = new JLabel("This is a label!", SwingConstants.CENTER);
		 	
		 	JButton button = new JButton("Close");
		 	button.addActionListener(e -> System.exit(0));
	        
	        panel.add(label1);
	        panel.add(label2);
	        panel.add(button);
		 	
	        frame.add(panel);
	        frame.setSize(300, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
		 
	        //System.out.println("Hello, World");
	        
	        //Michael Acebedo
	        //Steven Orpilla
	    }
	 
	 private class CloseListener implements ActionListener{
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        System.exit(0);
		    }
		}
}
