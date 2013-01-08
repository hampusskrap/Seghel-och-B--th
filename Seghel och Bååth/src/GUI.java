import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class GUI extends JFrame {

private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_9;
private JTextField textField_8;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_14;
private JTextField textField_15;
private JTextField textField_16;
private JTextField textField_17;
private JTextField textField_18;
private JTextField textField_19;
private JTextField textField_20;
private JTextField textField_21;
private JTextField textField_22;
private JTextField textField_23;
private JTextField textField_24;
private JTextField textField_26;
private JTextField textField_28;
private JTextField textField_30;
private JTextField textField_32;
private JTextField textField_34;
private JTextField textField_27;
private JTextField textField_29;
private JTextField textField_31;
private JTextField textField_33;
private JTextField textField_35;
private JTextField textField_36;
private JTextField textField_25;
private JTextField textField_37;


//Launch the application.

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
GUI frame = new GUI();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

//create the frame

public GUI() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 500, 500);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
contentPane.setLayout(new BorderLayout(0, 0));
setContentPane(contentPane);

JTabbedPane Övernavigation = new JTabbedPane(JTabbedPane.TOP);
Övernavigation.setBounds(5, 5, 509, 496);
contentPane.add(Övernavigation);

JPanel Kund = new JPanel();
Övernavigation.addTab("Kund", null, Kund, null);
Kund.setLayout(new CardLayout(0, 0));

JPanel nyKund = new JPanel();
Kund.add(nyKund, "name_1357556287147340000");
nyKund.setLayout(null);

JButton abortActionbtn = new JButton("Rensa");
abortActionbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
abortActionbtn.setBounds(221, 333, 117, 29);
nyKund.add(abortActionbtn);

JLabel lblNewLabel = new JLabel("L\u00E4gg till ny kund");
lblNewLabel.setBounds(179, 6, 120, 19);
lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
nyKund.add(lblNewLabel);

JButton btnSkKund = new JButton("S\u00F6k kund");
btnSkKund.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
/*if(e==btnSkKund){
panelLayout.show(panel,"Card hej");

}*/
}
});
btnSkKund.setBounds(6, 374, 215, 42);
nyKund.add(btnSkKund);

JButton btnNyKund = new JButton("L\u00E4gg till kund");
btnNyKund.setBounds(252, 374, 203, 42);
nyKund.add(btnNyKund);

JButton saveCustomerbtn = new JButton("Spara");
saveCustomerbtn.setBounds(338, 333, 117, 29);
nyKund.add(saveCustomerbtn);

JLabel lblNewLabel_1 = new JLabel("F\u00F6rnamn\n");
lblNewLabel_1.setForeground(SystemColor.textInactiveText);
lblNewLabel_1.setBounds(6, 36, 61, 16);
nyKund.add(lblNewLabel_1);

textField = new JTextField();
textField.setBounds(79, 30, 134, 28);
nyKund.add(textField);
textField.setColumns(10);

JLabel lblEfternamn = new JLabel("Efternamn\n");
lblEfternamn.setForeground(SystemColor.textInactiveText);
lblEfternamn.setBounds(226, 36, 73, 16);
nyKund.add(lblEfternamn);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(299, 30, 134, 28);
nyKund.add(textField_1);

JLabel lblAdress = new JLabel("Adress");
lblAdress.setForeground(SystemColor.textInactiveText);
lblAdress.setBounds(6, 70, 73, 16);
nyKund.add(lblAdress);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(79, 64, 134, 28);
nyKund.add(textField_2);

JLabel lblPostnummer = new JLabel("Postnummer");
lblPostnummer.setForeground(SystemColor.textInactiveText);
lblPostnummer.setBounds(226, 70, 73, 16);
nyKund.add(lblPostnummer);

textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(299, 64, 134, 28);
nyKund.add(textField_3);

JLabel lblTelefonnummer = new JLabel("Telefonnummer");
lblTelefonnummer.setForeground(SystemColor.textInactiveText);
lblTelefonnummer.setBounds(6, 104, 61, 16);
nyKund.add(lblTelefonnummer);

textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(79, 98, 134, 28);
nyKund.add(textField_4);

JLabel lblEpost = new JLabel("E-post\n");
lblEpost.setForeground(SystemColor.textInactiveText);
lblEpost.setBounds(226, 104, 61, 16);
nyKund.add(lblEpost);

textField_5 = new JTextField();
textField_5.setColumns(10);
textField_5.setBounds(299, 98, 134, 28);
nyKund.add(textField_5);

JLabel lblKundnummer = new JLabel("Kundnummer");
lblKundnummer.setForeground(SystemColor.textInactiveText);
lblKundnummer.setBounds(6, 138, 73, 16);
nyKund.add(lblKundnummer);

textField_6 = new JTextField();
textField_6.setColumns(10);
textField_6.setBounds(79, 132, 134, 28);
nyKund.add(textField_6);

JLabel lblOrgnummer = new JLabel("Org.nummer");
lblOrgnummer.setForeground(SystemColor.textInactiveText);
lblOrgnummer.setBounds(226, 138, 73, 16);
nyKund.add(lblOrgnummer);

textField_7 = new JTextField();
textField_7.setColumns(10);
textField_7.setBounds(299, 132, 134, 28);
nyKund.add(textField_7);

JLabel lblSljare = new JLabel("S\u00E4ljare");
lblSljare.setForeground(SystemColor.textInactiveText);
lblSljare.setBounds(6, 339, 61, 16);
nyKund.add(lblSljare);

textField_9 = new JTextField();
textField_9.setColumns(10);
textField_9.setBounds(75, 334, 134, 28);
nyKund.add(textField_9);

JRadioButton rdbtnPrivatkund = new JRadioButton("Privatkund");
rdbtnPrivatkund.setBounds(6, 180, 141, 23);
nyKund.add(rdbtnPrivatkund);

JRadioButton rdbtnFretagskund = new JRadioButton("F\u00F6retagskund");
rdbtnFretagskund.setBounds(299, 180, 141, 23);
nyKund.add(rdbtnFretagskund);

JPanel sokKund = new JPanel();
Kund.add(sokKund, "name_1357556294424741000");
sokKund.setLayout(null);

JButton btnSkKund2 = new JButton("S\u00F6k kund");
btnSkKund2.setBounds(6, 374, 215, 42);
sokKund.add(btnSkKund2);

JButton btnNyKund2 = new JButton("L\u00E4gg till kund");
btnNyKund2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
btnNyKund2.setBounds(252, 374, 203, 42);
sokKund.add(btnNyKund2);

JLabel lblSkKund = new JLabel("S\u00F6k kund\n");
lblSkKund.setHorizontalAlignment(SwingConstants.CENTER);
lblSkKund.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
lblSkKund.setBounds(179, 6, 120, 19);
sokKund.add(lblSkKund);

JLabel label_2 = new JLabel("F\u00F6rnamn\n");
label_2.setForeground(SystemColor.textInactiveText);
label_2.setBounds(6, 36, 61, 16);
sokKund.add(label_2);

textField_8 = new JTextField();
textField_8.setColumns(10);
textField_8.setBounds(79, 30, 134, 28);
sokKund.add(textField_8);

JLabel label_3 = new JLabel("Efternamn\n");
label_3.setForeground(SystemColor.textInactiveText);
label_3.setBounds(226, 36, 73, 16);
sokKund.add(label_3);

textField_10 = new JTextField();
textField_10.setColumns(10);
textField_10.setBounds(299, 30, 134, 28);
sokKund.add(textField_10);

JLabel label_4 = new JLabel("Adress");
label_4.setForeground(SystemColor.textInactiveText);
label_4.setBounds(6, 70, 73, 16);
sokKund.add(label_4);

textField_11 = new JTextField();
textField_11.setColumns(10);
textField_11.setBounds(79, 64, 134, 28);
sokKund.add(textField_11);

JLabel label_5 = new JLabel("Postnummer");
label_5.setForeground(SystemColor.textInactiveText);
label_5.setBounds(226, 70, 73, 16);
sokKund.add(label_5);

textField_12 = new JTextField();
textField_12.setColumns(10);
textField_12.setBounds(299, 64, 134, 28);
sokKund.add(textField_12);

JLabel label_6 = new JLabel("Telefonnummer");
label_6.setForeground(SystemColor.textInactiveText);
label_6.setBounds(6, 104, 61, 16);
sokKund.add(label_6);

textField_13 = new JTextField();
textField_13.setColumns(10);
textField_13.setBounds(79, 98, 134, 28);
sokKund.add(textField_13);

JLabel label_7 = new JLabel("E-post\n");
label_7.setForeground(SystemColor.textInactiveText);
label_7.setBounds(226, 104, 61, 16);
sokKund.add(label_7);

textField_14 = new JTextField();
textField_14.setColumns(10);
textField_14.setBounds(299, 98, 134, 28);
sokKund.add(textField_14);

JLabel label_8 = new JLabel("Kundnummer");
label_8.setForeground(SystemColor.textInactiveText);
label_8.setBounds(6, 138, 73, 16);
sokKund.add(label_8);

textField_15 = new JTextField();
textField_15.setColumns(10);
textField_15.setBounds(79, 132, 134, 28);
sokKund.add(textField_15);

JLabel label_9 = new JLabel("Org.nummer");
label_9.setForeground(SystemColor.textInactiveText);
label_9.setBounds(226, 138, 73, 16);
sokKund.add(label_9);

textField_16 = new JTextField();
textField_16.setColumns(10);
textField_16.setBounds(299, 132, 134, 28);
sokKund.add(textField_16);

JList list = new JList();
list.setBounds(6, 166, 457, 153);
sokKund.add(list);

JLabel label = new JLabel("S\u00E4ljare");
label.setForeground(SystemColor.textInactiveText);
label.setBounds(6, 338, 61, 16);
sokKund.add(label);

textField_35 = new JTextField();
textField_35.setColumns(10);
textField_35.setBounds(75, 334, 134, 28);
sokKund.add(textField_35);

JButton button_4 = new JButton("Rensa");
button_4.setBounds(221, 333, 117, 29);
sokKund.add(button_4);

JButton button_5 = new JButton("Spara");
button_5.setBounds(338, 333, 117, 29);
sokKund.add(button_5);

JPanel redigeraKund = new JPanel();
Kund.add(redigeraKund, "name_1357556297598169000");
redigeraKund.setLayout(null);

JButton btnSkKund3 = new JButton("S\u00F6k kund");
btnSkKund3.setBounds(6, 374, 215, 42);
redigeraKund.add(btnSkKund3);

JButton btnNyKund3 = new JButton("L\u00E4gg till kund");
btnNyKund3.setBounds(252, 374, 203, 42);
redigeraKund.add(btnNyKund3);

JLabel lblRedigeraKund = new JLabel("Redigera kund");
lblRedigeraKund.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
lblRedigeraKund.setBounds(179, 6, 120, 19);
redigeraKund.add(lblRedigeraKund);

JLabel label_10 = new JLabel("F\u00F6rnamn\n");
label_10.setForeground(SystemColor.textInactiveText);
label_10.setBounds(6, 36, 61, 16);
redigeraKund.add(label_10);

textField_17 = new JTextField();
textField_17.setColumns(10);
textField_17.setBounds(79, 30, 134, 28);
redigeraKund.add(textField_17);

JLabel label_11 = new JLabel("Efternamn\n");
label_11.setForeground(SystemColor.textInactiveText);
label_11.setBounds(226, 36, 73, 16);
redigeraKund.add(label_11);

textField_18 = new JTextField();
textField_18.setColumns(10);
textField_18.setBounds(299, 30, 134, 28);
redigeraKund.add(textField_18);

JLabel label_12 = new JLabel("Adress");
label_12.setForeground(SystemColor.textInactiveText);
label_12.setBounds(6, 70, 73, 16);
redigeraKund.add(label_12);

textField_19 = new JTextField();
textField_19.setColumns(10);
textField_19.setBounds(79, 64, 134, 28);
redigeraKund.add(textField_19);

JLabel label_13 = new JLabel("Postnummer");
label_13.setForeground(SystemColor.textInactiveText);
label_13.setBounds(226, 70, 73, 16);
redigeraKund.add(label_13);

textField_20 = new JTextField();
textField_20.setColumns(10);
textField_20.setBounds(299, 64, 134, 28);
redigeraKund.add(textField_20);

JLabel label_14 = new JLabel("Telefonnummer");
label_14.setForeground(SystemColor.textInactiveText);
label_14.setBounds(6, 104, 61, 16);
redigeraKund.add(label_14);

textField_21 = new JTextField();
textField_21.setColumns(10);
textField_21.setBounds(79, 98, 134, 28);
redigeraKund.add(textField_21);

JLabel label_15 = new JLabel("E-post\n");
label_15.setForeground(SystemColor.textInactiveText);
label_15.setBounds(226, 104, 61, 16);
redigeraKund.add(label_15);

textField_22 = new JTextField();
textField_22.setColumns(10);
textField_22.setBounds(299, 98, 134, 28);
redigeraKund.add(textField_22);

JLabel label_16 = new JLabel("Kundnummer");
label_16.setForeground(SystemColor.textInactiveText);
label_16.setBounds(6, 138, 73, 16);
redigeraKund.add(label_16);

textField_23 = new JTextField();
textField_23.setColumns(10);
textField_23.setBounds(79, 132, 134, 28);
redigeraKund.add(textField_23);

JLabel label_17 = new JLabel("Org.nummer");
label_17.setForeground(SystemColor.textInactiveText);
label_17.setBounds(226, 138, 73, 16);
redigeraKund.add(label_17);

textField_24 = new JTextField();
textField_24.setColumns(10);
textField_24.setBounds(299, 132, 134, 28);
redigeraKund.add(textField_24);

JRadioButton radioButton = new JRadioButton("Privatkund");
radioButton.setBounds(16, 172, 141, 23);
redigeraKund.add(radioButton);

JRadioButton radioButton_1 = new JRadioButton("F\u00F6retagskund");
radioButton_1.setBounds(299, 172, 141, 23);
redigeraKund.add(radioButton_1);

JLabel label_19 = new JLabel("S\u00E4ljare");
label_19.setForeground(SystemColor.textInactiveText);
label_19.setBounds(6, 338, 61, 16);
redigeraKund.add(label_19);

textField_36 = new JTextField();
textField_36.setColumns(10);
textField_36.setBounds(75, 334, 134, 28);
redigeraKund.add(textField_36);

JButton button = new JButton("Rensa");
button.setBounds(221, 333, 117, 29);
redigeraKund.add(button);

JButton button_7 = new JButton("Spara");
button_7.setBounds(338, 333, 117, 29);
redigeraKund.add(button_7);

JPanel Order = new JPanel();
Övernavigation.addTab("Order", null, Order, null);
Order.setLayout(new CardLayout(0, 0));

JPanel nyOrder = new JPanel();
nyOrder.setLayout(null);
Order.add(nyOrder, "name_1357594012268437000");

JButton button_3 = new JButton("Rensa");
button_3.setBounds(221, 333, 117, 29);
nyOrder.add(button_3);

JLabel lblNyOrder = new JLabel("Ny order\n");
lblNyOrder.setHorizontalAlignment(SwingConstants.CENTER);
lblNyOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
lblNyOrder.setBounds(179, 6, 120, 19);
nyOrder.add(lblNyOrder);

JButton btnSkOrder = new JButton("S\u00F6k order");
btnSkOrder.setBounds(6, 374, 215, 42);
nyOrder.add(btnSkOrder);

JButton btnNyOrder = new JButton("Ny order");
btnNyOrder.setBounds(252, 374, 203, 42);
nyOrder.add(btnNyOrder);

JButton button_6 = new JButton("Spara");
button_6.setBounds(338, 333, 117, 29);
nyOrder.add(button_6);

JLabel label_1 = new JLabel("F\u00F6rnamn\n");
label_1.setForeground(SystemColor.textInactiveText);
label_1.setBounds(6, 36, 61, 16);
nyOrder.add(label_1);

textField_26 = new JTextField();
textField_26.setColumns(10);
textField_26.setBounds(79, 30, 134, 28);
nyOrder.add(textField_26);

JLabel label_20 = new JLabel("Adress");
label_20.setForeground(SystemColor.textInactiveText);
label_20.setBounds(6, 70, 73, 16);
nyOrder.add(label_20);

textField_28 = new JTextField();
textField_28.setColumns(10);
textField_28.setBounds(79, 64, 134, 28);
nyOrder.add(textField_28);

JLabel label_22 = new JLabel("Telefonnummer");
label_22.setForeground(SystemColor.textInactiveText);
label_22.setBounds(6, 104, 61, 16);
nyOrder.add(label_22);

textField_30 = new JTextField();
textField_30.setColumns(10);
textField_30.setBounds(79, 98, 134, 28);
nyOrder.add(textField_30);

JLabel label_24 = new JLabel("Kundnummer");
label_24.setForeground(SystemColor.textInactiveText);
label_24.setBounds(6, 138, 73, 16);
nyOrder.add(label_24);

textField_32 = new JTextField();
textField_32.setColumns(10);
textField_32.setBounds(79, 132, 134, 28);
nyOrder.add(textField_32);

JLabel label_26 = new JLabel("S\u00E4ljare");
label_26.setForeground(SystemColor.textInactiveText);
label_26.setBounds(6, 338, 61, 16);
nyOrder.add(label_26);

textField_34 = new JTextField();
textField_34.setColumns(10);
textField_34.setBounds(75, 334, 134, 28);
nyOrder.add(textField_34);

JLabel lblArtikel = new JLabel("Artikelnamn\n");
lblArtikel.setForeground(SystemColor.textInactiveText);
lblArtikel.setBounds(221, 36, 73, 16);
nyOrder.add(lblArtikel);

textField_27 = new JTextField();
textField_27.setColumns(10);
textField_27.setBounds(321, 30, 134, 28);
nyOrder.add(textField_27);

JLabel lblOrdernummer = new JLabel("Ordernummer");
lblOrdernummer.setForeground(SystemColor.textInactiveText);
lblOrdernummer.setBounds(248, 70, 73, 16);
nyOrder.add(lblOrdernummer);

textField_29 = new JTextField();
textField_29.setColumns(10);
textField_29.setBounds(321, 64, 134, 28);
nyOrder.add(textField_29);

JLabel lblAntal = new JLabel("Antal");
lblAntal.setForeground(SystemColor.textInactiveText);
lblAntal.setBounds(248, 104, 61, 16);
nyOrder.add(lblAntal);

textField_31 = new JTextField();
textField_31.setColumns(10);
textField_31.setBounds(321, 98, 134, 28);
nyOrder.add(textField_31);

JLabel lblRabatt = new JLabel("Rabatt");
lblRabatt.setForeground(SystemColor.textInactiveText);
lblRabatt.setBounds(248, 138, 73, 16);
nyOrder.add(lblRabatt);

textField_33 = new JTextField();
textField_33.setColumns(10);
textField_33.setBounds(321, 132, 134, 28);
nyOrder.add(textField_33);

JList list_1 = new JList();
list_1.setBounds(6, 166, 457, 153);
nyOrder.add(list_1);

JPanel sokOrder = new JPanel();
Order.add(sokOrder, "name_1357595811766133000");
sokOrder.setLayout(null);

JButton btnNyOrder2 = new JButton("Ny order");
btnNyOrder2.setBounds(252, 374, 203, 42);
sokOrder.add(btnNyOrder2);

JButton btnSkOrder2 = new JButton("S\u00F6k order");
btnSkOrder2.setBounds(6, 374, 215, 42);
sokOrder.add(btnSkOrder2);

JLabel label_18 = new JLabel("S\u00E4ljare");
label_18.setForeground(SystemColor.textInactiveText);
label_18.setBounds(6, 338, 61, 16);
sokOrder.add(label_18);

textField_25 = new JTextField();
textField_25.setColumns(10);
textField_25.setBounds(75, 334, 134, 28);
sokOrder.add(textField_25);

JButton button_8 = new JButton("Rensa");
button_8.setBounds(221, 333, 117, 29);
sokOrder.add(button_8);

JButton button_9 = new JButton("Spara");
button_9.setBounds(338, 333, 117, 29);
sokOrder.add(button_9);

JPanel redigeraOrder = new JPanel();
Order.add(redigeraOrder, "name_1357595844079571000");
redigeraOrder.setLayout(null);

JButton btnNyOrder3 = new JButton("Ny order");
btnNyOrder3.setBounds(252, 374, 203, 42);
redigeraOrder.add(btnNyOrder3);

JButton btnSkOrder3 = new JButton("S\u00F6k order");
btnSkOrder3.setBounds(6, 374, 215, 42);
redigeraOrder.add(btnSkOrder3);

JLabel label_21 = new JLabel("S\u00E4ljare");
label_21.setForeground(SystemColor.textInactiveText);
label_21.setBounds(6, 338, 61, 16);
redigeraOrder.add(label_21);

textField_37 = new JTextField();
textField_37.setColumns(10);
textField_37.setBounds(75, 334, 134, 28);
redigeraOrder.add(textField_37);

JButton button_12 = new JButton("Rensa");
button_12.setBounds(221, 333, 117, 29);
redigeraOrder.add(button_12);

JButton button_13 = new JButton("Spara");
button_13.setBounds(338, 333, 117, 29);
redigeraOrder.add(button_13);

JPanel Produkt = new JPanel();
Övernavigation.addTab("Produkt", null, Produkt, null);
}
}