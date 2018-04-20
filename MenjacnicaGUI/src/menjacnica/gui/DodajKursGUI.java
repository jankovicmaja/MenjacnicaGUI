package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSkraceniNaziv;
	private JButton odustani;
	private JButton dodaj;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI();
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
	public DodajKursGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("Dodaj kurs");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifra = new JLabel("Sifra");
		lblSifra.setBounds(20, 25, 46, 14);
		contentPane.add(lblSifra);
		
		textFieldSifra = new JTextField();
		textFieldSifra.setBounds(20, 50, 141, 20);
		contentPane.add(textFieldSifra);
		textFieldSifra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prodajni kurs");
		lblNewLabel.setBounds(20, 88, 93, 14);
		contentPane.add(lblNewLabel);
		
		textFieldProdajniKurs = new JTextField();
		textFieldProdajniKurs.setBounds(20, 120, 141, 20);
		contentPane.add(textFieldProdajniKurs);
		textFieldProdajniKurs.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Srednji kurs");
		lblNewLabel_1.setBounds(20, 154, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldSrednjiKurs = new JTextField();
		textFieldSrednjiKurs.setBounds(20, 188, 141, 20);
		contentPane.add(textFieldSrednjiKurs);
		textFieldSrednjiKurs.setColumns(10);
		
		JLabel lblNaziv = new JLabel("Naziv");
		lblNaziv.setBounds(249, 25, 46, 14);
		contentPane.add(lblNaziv);
		
		textFieldNaziv = new JTextField();
		textFieldNaziv.setBounds(249, 50, 132, 20);
		contentPane.add(textFieldNaziv);
		textFieldNaziv.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kupovni kurs");
		lblNewLabel_2.setBounds(249, 88, 106, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldKupovniKurs = new JTextField();
		textFieldKupovniKurs.setBounds(249, 120, 132, 20);
		contentPane.add(textFieldKupovniKurs);
		textFieldKupovniKurs.setColumns(10);
		
		JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
		lblSkraceniNaziv.setBounds(249, 154, 93, 14);
		contentPane.add(lblSkraceniNaziv);
		
		textFieldSkraceniNaziv = new JTextField();
		textFieldSkraceniNaziv.setBounds(249, 188, 132, 20);
		contentPane.add(textFieldSkraceniNaziv);
		textFieldSkraceniNaziv.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tekst = MenjacnicaGUI.textArea.getText();

				if (tekst.isEmpty()) {
					MenjacnicaGUI.textArea.setText("DODAJ: " + "Naziv kursa: " + textFieldNaziv.getText()
							+ ", sifra: " + textFieldSifra.getText() + ", prodajni: " + textFieldProdajniKurs.getText()
							+ ", srednji:" + textFieldSrednjiKurs.getText() + ", kupovni: " + textFieldKupovniKurs.getText()
							+ ", skraceni naziv: " + textFieldNaziv.getText());
				} else {
					MenjacnicaGUI.textArea.setText(tekst + '\n' + "DODAJ: " + "Naziv kursa: "
							+ textFieldNaziv.getText() + ", sifra: " + textFieldSifra.getText() + ", prodajni: "
							+ textFieldProdajniKurs.getText() + ", srednji:" + textFieldSrednjiKurs.getText() + ", kupovni: "
							+ textFieldKupovniKurs.getText() + ", skraceni naziv: " + textFieldNaziv.getText());
				}

				dispose();
			}
			
		});
		btnDodaj.setBounds(40, 238, 89, 23);
		contentPane.add(btnDodaj);
		
		JButton odustani = new JButton("Odustani");
		odustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		odustani.setBounds(266, 238, 89, 23);
		contentPane.add(odustani);

	}
	
	
	
}
