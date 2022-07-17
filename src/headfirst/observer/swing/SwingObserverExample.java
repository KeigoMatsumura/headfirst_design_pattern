package headfirst.observer.swing;
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
	
public class SwingObserverExample {
	private JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("これをするべきですか?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("してはいけません、後悔するかもしれませんよ!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("さあ、やってしまいなさい!");
		}
	}
}
