import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import java.util.ArrayList;

public class NewCustomerFrame extends JFrame {


	/*ActionListener act1 = new ActionListener();
	String input;
	public Customer CreateCustomer(ActionEvent e){
		input=fornamn.getText();
		input=Efternamn.getText();
	}*/
	/****************
	 * 
	 */
	private JPanel contentPane;
	private JTextField fornamn;
	private JTextField Efternamn;
	private JTextField Personnummer;
	private JTextField Telefonnummer;
	private JTextField Emailadress;


	/**
	 * Launch the application.
	 */
	private ButtonGroup group = new ButtonGroup(); // Radioknappar måste grupperas!
	private Controller controller=new Controller(); //Koppling till klassen Controller
	private JTextField Kundnummer;
	private JTextField Orgnummer;
	/*public void setController(Controller controller){
		this.controller = controller;
	}*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCustomerFrame frame = new NewCustomerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//group.add(rdbtnPrivatkund); //Radioknapparna grupperas
				//group.add(rdbtnForetagskund); //Radioknapparna grupperas
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewCustomerFrame() {
		setTitle("Ny Kund");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		fornamn = new JTextField();
		fornamn.setBounds(103, 25, 114, 20);
		contentPane.add(fornamn);

		JLabel lblFrnamn = new JLabel("F\u00F6rnamn:");
		lblFrnamn.setLabelFor(fornamn);
		lblFrnamn.setBounds(5, 25, 53, 16);
		lblFrnamn.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblFrnamn);

		Efternamn = new JTextField();
		Efternamn.setBounds(103, 52, 114, 20);
		contentPane.add(Efternamn);

		JLabel lblEfternamn = new JLabel("Efternamn:");
		lblEfternamn.setLabelFor(Efternamn);
		lblEfternamn.setHorizontalAlignment(SwingConstants.LEFT);
		lblEfternamn.setBounds(5, 54, 62, 16);
		contentPane.add(lblEfternamn);

		Personnummer = new JTextField();
		Personnummer.setBounds(103, 84, 114, 20);
		contentPane.add(Personnummer);

		Telefonnummer = new JTextField();
		Telefonnummer.setBounds(103, 116, 114, 20);
		contentPane.add(Telefonnummer);

		Emailadress = new JTextField();
		Emailadress.setBounds(103, 148, 114, 20);
		contentPane.add(Emailadress);

		JLabel lblPersonnummer = new JLabel("Personnummer:");
		lblPersonnummer.setLabelFor(Personnummer);
		lblPersonnummer.setHorizontalAlignment(SwingConstants.LEFT);
		lblPersonnummer.setBounds(5, 86, 92, 16);
		contentPane.add(lblPersonnummer);

		JLabel lblTelefonnummer = new JLabel("Telefonnummer:");
		lblTelefonnummer.setLabelFor(Telefonnummer);
		lblTelefonnummer.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefonnummer.setBounds(5, 118, 93, 16);
		contentPane.add(lblTelefonnummer);

		JLabel lblEmailadress = new JLabel("Emailadress:");
		lblEmailadress.setLabelFor(Emailadress);
		lblEmailadress.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailadress.setBounds(5, 150, 74, 16);
		contentPane.add(lblEmailadress);

		JRadioButton rdbtnPrivatkund = new JRadioButton("Privatkund");
		rdbtnPrivatkund.setBounds(103, 207, 121, 24);
		contentPane.add(rdbtnPrivatkund);

		JRadioButton rdbtnForetagskund = new JRadioButton("Foretagskund");
		rdbtnForetagskund.setBounds(228, 207, 121, 24);
		contentPane.add(rdbtnForetagskund);

		group.add(rdbtnPrivatkund); //Radioknapparna grupperas
		group.add(rdbtnForetagskund); //Radioknapparna grupperas

		JButton btnAvbryt = new JButton("Avbryt");
		btnAvbryt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int reply = JOptionPane.showConfirmDialog(null, "Avbryt", "Avbryt", JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION);
				{
					System.exit(0);
				}
				if (reply == JOptionPane.NO_OPTION);
				{
					//JOptionPane.CLOSED_OPTION;
				}
			}
		});
		btnAvbryt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//NewCustomerFrame.EXIT_ON_CLOSE;
				ConfirmationFrame.getFrames();
				ConfirmationFrame.getWindows();
			}
		});
		btnAvbryt.setBackground(new Color(255, 99, 71));
		btnAvbryt.setBounds(338, 339, 98, 26);
		contentPane.add(btnAvbryt);

		JButton btnLaggTillKund = new JButton("Lagg till kund");
		btnLaggTillKund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Customer tmpCustomer = null;

				/*tmpCustomer.setForName(fornamn.getText());
				tmpCustomer.setSurName(Efternamn.getText());
				tmpCustomer.setCivicnumber(Personnummer.getText());
				tmpCustomer.setPhoneNumber(Telefonnummer.getText());
				tmpCustomer.setEmail(Emailadress.getText());
				tmpCustomer.setCustomerNumber(Integer.parseInt(Kundnummer.getText()));*/
				if (fornamn.getText().equals("")||Efternamn.getText().equals("")||Personnummer.getText().equals("")){
					System.out.println("Error");
				}
				controller.addCustomer(fornamn.getText(),Efternamn.getText(),Personnummer.getText(),Telefonnummer.getText(),Emailadress.getText(),Integer.parseInt(Kundnummer.getText()));


			}

		});
		btnLaggTillKund.setBackground(new Color(173, 255, 47));
		btnLaggTillKund.setBounds(448, 339, 109, 26);
		contentPane.add(btnLaggTillKund);
		while (Emailadress.getText() == ""){
			btnLaggTillKund.setEnabled(isFocusable());
		}

		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setBounds(399, 0, 37, 16);
		contentPane.add(lblDatum);

		Label Year = new Label("Year");
		Year.setBounds(263, 25, 39, 23);
		contentPane.add(Year);

		Label Month = new Label("Month");
		Month.setBounds(367, 25, 36, 23);
		contentPane.add(Month);

		Label Day = new Label("Day");
		Day.setBounds(473, 25, 36, 23);
		contentPane.add(Day);

		JComboBox YearBox = new JComboBox();
		YearBox.setToolTipText("Year");
		YearBox.setModel(new DefaultComboBoxModel(new String[] {"2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"}));
		YearBox.setBounds(308, 23, 56, 25);
		contentPane.add(YearBox);

		JComboBox MonthBox = new JComboBox();
		MonthBox.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Oct", "Nov", "Dec"}));
		MonthBox.setToolTipText("Month");
		MonthBox.setBounds(409, 23, 56, 25);
		contentPane.add(MonthBox);

		JComboBox DayBox = new JComboBox();
		DayBox.setMaximumRowCount(12);
		DayBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		DayBox.setToolTipText("Year");
		DayBox.setBounds(515, 23, 56, 25);
		contentPane.add(DayBox);

		Kundnummer = new JTextField();
		Kundnummer.setToolTipText("kundnummer");
		Kundnummer.setBounds(103, 180, 114, 20);
		contentPane.add(Kundnummer);
		Kundnummer.setColumns(10);

		JLabel lblKundnummer = new JLabel("Kundnummer:");
		lblKundnummer.setLabelFor(Kundnummer);
		lblKundnummer.setBounds(5, 181, 80, 16);
		contentPane.add(lblKundnummer);

		Orgnummer = new JTextField();
		Orgnummer.setEditable(false);
		Orgnummer.setToolTipText("");
		Orgnummer.setColumns(10);
		Orgnummer.setBounds(154, 239, 114, 20);
		contentPane.add(Orgnummer);
		if (rdbtnForetagskund.isContentAreaFilled()){
			Orgnummer.setEnabled(true);
		}

		JLabel lblOrganisationsnummer = new JLabel("Organisationsnummer:");
		lblOrganisationsnummer.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrganisationsnummer.setBounds(5, 241, 131, 16);
		contentPane.add(lblOrganisationsnummer);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, fornamn, lblFrnamn, Efternamn, lblEfternamn, Personnummer, Telefonnummer, Emailadress, lblPersonnummer, lblTelefonnummer, lblEmailadress, rdbtnPrivatkund, rdbtnForetagskund, btnAvbryt, btnLaggTillKund}));
	}
}
