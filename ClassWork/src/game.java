import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game window = new game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(3,3));
		
		JPanel p1 = new JPanel();
		frame.getContentPane().add(p1, BorderLayout.NORTH);
		p1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Welcome to the game");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		p1.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER 1 > 0");
		p1.add(lblNewLabel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("PLAYER 2 > 0");
		p1.add(lblNewLabel_2, BorderLayout.EAST);
		
		JPanel p3 = new JPanel();
		frame.getContentPane().add(p3, BorderLayout.SOUTH);
		p3.setLayout(new GridLayout(1, 0, 50, 20));
		
		JButton btnNewButton_9 = new JButton("Forfit");
		p3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Reset");
		p3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Score");
		p3.add(btnNewButton_11);
		
		JPanel p2 = new JPanel();
		frame.getContentPane().add(p2, BorderLayout.CENTER);
		p2.setLayout(new GridLayout(0, 3, 5, 5));
		
		JButton btnNewButton_1 = new JButton("New button");
		p2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		p2.add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("New button");
		p2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("New button");
		p2.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("New button");
		p2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		p2.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("New button");
		p2.add(btnNewButton);
		
		JButton btnNewButton_7 = new JButton("New button");
		p2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		p2.add(btnNewButton_8);
	}

}
