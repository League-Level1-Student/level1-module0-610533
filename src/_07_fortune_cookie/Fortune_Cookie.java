package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
		  public void showButton() {
		    System.out.println("Button Clicked");
		    //new frames
		    JFrame frame = new JFrame();
		    frame.setVisible(true);
		    JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);	 
		    		
		  }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int rand = new Random().nextInt(5);
		    System.out.println(rand);
		    if (rand == 0) {
		    	System.out.println("You  will be lucky tonight");
		    }
		    if (rand == 1) {
		    	System.out.println("You will eat good in your life");
		    }
		    if (rand == 2) {
		    	System.out.println("You will have better luck in your future");
		    }
		    if (rand == 3) {
		    	System.out.println("You will find someone who will teach you");
		    }
		    if (rand == 4) {
		    	System.out.println("You will find your future soon");
		    }
			JOptionPane.showMessageDialog(null, "woohoo");
			// TODO Auto-generated method stub
			
		}
	}
