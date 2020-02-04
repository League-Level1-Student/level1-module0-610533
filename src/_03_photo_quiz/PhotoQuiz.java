package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String bruh = ("https://i.ytimg.com/vi/s_htF2fKyGs/maxresdefault.jpg");
		// 2. create a variable of type "Component" that will hold your image
		Component f = createImage(bruh);
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		JPanel panel = new JPanel();
		quizWindow.add(panel);
		panel.add(f);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String lol = JOptionPane.showInputDialog("What is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(lol.equalsIgnoreCase("Phrog")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "WRONG!!! HOW COULD YOU NOT GET THAT?! HAHAHAHAHAHAHAHAHHAAAA!!!!!AHAHHAAHAHAHAHAHAA!!!");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(panel);
		// 10. find another image and create it (might take more than one line
		// of code)
		String hmm = ("https://upload.wikimedia.org/wikipedia/commons/a/a3/June_odd-eyed-cat.jpg");
		Component b = createImage(hmm);
		// 11. add the second image to the quiz window
		quizWindow.add(b);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String haha = JOptionPane.showInputDialog("What is this though?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(haha.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONG!!! HOW COULD YOU NOT GET THAT?! HAHAHAHAHAHAHAHAHHAAAA!!!!!AHAHHAAHAHAHAHAHAA!!!");
			
		}
		quizWindow.remove(b);

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
