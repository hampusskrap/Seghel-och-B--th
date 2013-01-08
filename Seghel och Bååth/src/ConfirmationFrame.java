import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;


public class ConfirmationFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmationFrame frame = new ConfirmationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfirmationFrame() {
		setAlwaysOnTop(true);
		setTitle("Exit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNej = new JButton("Abort");
		btnNej.setBounds(290, 208, 98, 26);
		contentPane.add(btnNej);
		
		JButton btnJa = new JButton("Yes");
		btnJa.setBounds(103, 208, 98, 26);
		contentPane.add(btnJa);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to exit?");
		lblAreYouSure.setFont(new Font("Dialog", Font.BOLD, 32));
		lblAreYouSure.setBounds(16, 82, 466, 42);
		contentPane.add(lblAreYouSure);
	}
}
