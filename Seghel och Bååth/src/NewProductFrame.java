import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.xml.bind.ParseConversionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class NewProductFrame extends JFrame {
	
	private Controller controller = new Controller ();

	private JPanel contentPane;
	private JTextField Produktnamn;
	private JTextField Produktnummer;
	private JTextField Pris;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewProductFrame frame = new NewProductFrame();
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
	public NewProductFrame() {
		setTitle("Ny Vara");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 582, 401);
		contentPane.add(panel);
		
		Produktnamn = new JTextField();
		Produktnamn.setBounds(103, 25, 114, 20);
		panel.add(Produktnamn);
		
		JLabel lblProduktnamn = new JLabel("Produktnamn:");
		lblProduktnamn.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduktnamn.setBounds(5, 25, 67, 14);
		panel.add(lblProduktnamn);
		
		Produktnummer = new JTextField();
		Produktnummer.setBounds(103, 52, 114, 20);
		panel.add(Produktnummer);
		
		JLabel lblProduktnummer = new JLabel("Produktnummer:");
		lblProduktnummer.setHorizontalAlignment(SwingConstants.LEFT);
		lblProduktnummer.setBounds(5, 54, 79, 14);
		panel.add(lblProduktnummer);
		
		Pris = new JTextField();
		Pris.setBounds(103, 83, 114, 20);
		panel.add(Pris);
		
		textField_3 = new JTextField();
		textField_3.setBounds(436, 104, 121, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(436, 136, 121, 20);
		panel.add(textField_4);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setHorizontalAlignment(SwingConstants.LEFT);
		lblPris.setBounds(5, 85, 92, 16);
		panel.add(lblPris);
		
		JLabel label_3 = new JLabel("Telefonnummer:");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setBounds(338, 106, 78, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Emailadress:");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setBounds(338, 138, 60, 14);
		panel.add(label_4);
		
		JButton btnAvbryt = new JButton("Avbryt");
		btnAvbryt.setBackground(new Color(255, 99, 71));
		btnAvbryt.setBounds(338, 339, 98, 26);
		panel.add(btnAvbryt);
		
		JButton btnLaggTillProdukt = new JButton("Lagg till produkt");
		btnLaggTillProdukt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//controller.addProduct(Produktnamn.getText(),Produktnummer.getText(),Double.parseDouble(Pris.getText()));
			}
		});
		btnLaggTillProdukt.setBackground(new Color(173, 255, 47));
		btnLaggTillProdukt.setBounds(448, 339, 109, 26);
		panel.add(btnLaggTillProdukt);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("kundnummer");
		textField_5.setColumns(10);
		textField_5.setBounds(436, 168, 121, 20);
		panel.add(textField_5);
		
		JLabel lblOrgnummer = new JLabel("Orgnummer:");
		lblOrgnummer.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrgnummer.setBounds(338, 171, 60, 14);
		panel.add(lblOrgnummer);
		
		JLabel lblForetagsnamn = new JLabel("Foretagsnamn:");
		lblForetagsnamn.setHorizontalAlignment(SwingConstants.LEFT);
		lblForetagsnamn.setBounds(338, 39, 78, 14);
		panel.add(lblForetagsnamn);
		
		textField_7 = new JTextField();
		textField_7.setBounds(436, 36, 121, 20);
		panel.add(textField_7);
		
		JLabel lblKontaktperson = new JLabel("Kontaktperson:");
		lblKontaktperson.setHorizontalAlignment(SwingConstants.LEFT);
		lblKontaktperson.setBounds(338, 70, 78, 14);
		panel.add(lblKontaktperson);
		
		textField_8 = new JTextField();
		textField_8.setBounds(436, 67, 121, 20);
		panel.add(textField_8);
		
		JLabel lblLeverantor = new JLabel("Leverantor");
		lblLeverantor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLeverantor.setBounds(406, 11, 63, 14);
		panel.add(lblLeverantor);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(51, 171, 166, 140);
		panel.add(editorPane);
		
		JLabel lblProduktbeskrivning = new JLabel("Produktbeskrivning");
		lblProduktbeskrivning.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProduktbeskrivning.setBounds(51, 139, 111, 14);
		panel.add(lblProduktbeskrivning);
	}
}
