package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSkraceniNaziv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
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
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(35, 29, 46, 14);
		contentPane.add(lblSifra);
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(35, 58, 115, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prodajni kurs");
		lblNewLabel.setBounds(35, 98, 115, 14);
		contentPane.add(lblNewLabel);
		
		textFieldProdajniKurs = new JTextField();
		textFieldProdajniKurs.setBounds(35, 131, 115, 20);
		contentPane.add(textFieldProdajniKurs);
		textFieldProdajniKurs.setColumns(10);
		
		JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
		lblSrednjiKurs.setBounds(35, 169, 87, 14);
		contentPane.add(lblSrednjiKurs);
		
		textFieldSrednjiKurs = new JTextField();
		textFieldSrednjiKurs.setBounds(35, 194, 86, 20);
		contentPane.add(textFieldSrednjiKurs);
		textFieldSrednjiKurs.setColumns(10);
		
		JLabel lblKupovniKurs = new JLabel("Naziv");
		lblKupovniKurs.setBounds(230, 29, 115, 14);
		contentPane.add(lblKupovniKurs);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(230, 58, 125, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblSrednjiKurs_1 = new JLabel("Kupovni kurs");
		lblSrednjiKurs_1.setBounds(230, 98, 98, 14);
		contentPane.add(lblSrednjiKurs_1);
		
		textFieldKupovniKurs = new JTextField();
		textFieldKupovniKurs.setBounds(230, 131, 125, 20);
		contentPane.add(textFieldKupovniKurs);
		textFieldKupovniKurs.setColumns(10);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(230, 169, 98, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSkraceniNaziv = new JTextField();
		textFieldSkraceniNaziv.setBounds(230, 194, 125, 20);
		contentPane.add(textFieldSkraceniNaziv);
		textFieldSkraceniNaziv.setColumns(10);
		
		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tekst = MenjacnicaGUI.textArea.getText();

				if (tekst.isEmpty()) {
					MenjacnicaGUI.textArea.setText("OBRISI: " + "Naziv kursa: " + textFieldNaziv.getText()
							+ ", sifra: " + textFieldSifra.getText() + ", prodajni: " + textFieldProdajniKurs.getText()
							+ ", srednji:" + textFieldSrednjiKurs.getText() + ", kupovni: " + textFieldKupovniKurs.getText()
							+ ", skraceni naziv: " + textFieldNaziv.getText());
				} else {
					MenjacnicaGUI.textArea.setText(tekst + '\n' + "OBRISI: " + "Naziv kursa: "
							+ textFieldNaziv.getText() + ", sifra: " + textFieldSifra.getText() + ", prodajni: "
							+ textFieldProdajniKurs.getText() + ", srednji:" + textFieldSrednjiKurs.getText() + ", kupovni: "
							+ textFieldKupovniKurs.getText() + ", skraceni naziv: " + textFieldNaziv.getText());
				}

				dispose();
				}
		});
		btnObrisi.setEnabled(false);
		btnObrisi.setBounds(35, 249, 89, 23);
		contentPane.add(btnObrisi);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(230, 249, 89, 23);
		contentPane.add(btnOdustani);
		
		JCheckBox checkZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
		checkZaistaObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkZaistaObrisi.isSelected()) {
					btnObrisi.setEnabled(true);
				} else {
					btnObrisi.setEnabled(false);
				}
			}
		});
		checkZaistaObrisi.setBounds(35, 221, 125, 23);
		contentPane.add(checkZaistaObrisi);
	}
}
