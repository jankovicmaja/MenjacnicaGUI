package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldIznos;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kupovni kurs");
		lblNewLabel.setBounds(30, 29, 85, 14);
		contentPane.add(lblNewLabel);
		
		textFieldKupovniKurs = new JTextField();
		textFieldKupovniKurs.setEditable(false);
		textFieldKupovniKurs.setBounds(30, 54, 86, 20);
		contentPane.add(textFieldKupovniKurs);
		textFieldKupovniKurs.setColumns(10);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(157, 29, 46, 14);
		contentPane.add(lblValuta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
		comboBox.setBounds(157, 54, 62, 20);
		contentPane.add(comboBox);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(262, 29, 70, 14);
		contentPane.add(lblProdajniKurs);
		
		textFieldProdajniKurs = new JTextField();
		textFieldProdajniKurs.setEditable(false);
		textFieldProdajniKurs.setBounds(262, 54, 86, 20);
		contentPane.add(textFieldProdajniKurs);
		textFieldProdajniKurs.setColumns(10);
		
		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setBounds(30, 124, 46, 14);
		contentPane.add(lblIznos);
		
		textFieldIznos = new JTextField();
		textFieldIznos.setBounds(30, 149, 127, 20);
		contentPane.add(textFieldIznos);
		textFieldIznos.setColumns(10);
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(225, 124, 93, 14);
		contentPane.add(lblVrstaTransakcije);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kupovina");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(223, 148, 109, 23);
		
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnProdaja = new JRadioButton("Prodaja");
		buttonGroup.add(rdbtnProdaja);
		rdbtnProdaja.setBounds(223, 175, 109, 23);
		contentPane.add(rdbtnProdaja);
		
		JSlider slider = new JSlider();
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textFieldIznos.setText(""+slider.getValue());
				
			}
		});
		slider.setBounds(30, 194, 339, 44);
		contentPane.add(slider);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tekst = MenjacnicaGUI.textArea.getText();

				
				
				
				if (tekst.isEmpty()) {
					MenjacnicaGUI.textArea.setText(
							"IZVRSI ZAMENU: " + "Valuta: " + comboBox.getSelectedItem().toString() + ", iznos: "
									+ textFieldIznos.getText() + ", " + buttonGroup.getSelection().getActionCommand());
				} else {
					MenjacnicaGUI.textArea.setText(tekst + '\n' + "IZVRSI ZAMENU: " + "Valuta: "
							+ comboBox.getSelectedItem().toString() + ", iznos: " + textFieldIznos.getText() + ", "
							+ buttonGroup.getSelection().getActionCommand());
				}

				dispose();
			}
		});
		btnIzvrsiZamenu.setBounds(52, 249, 115, 23);
		contentPane.add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(243, 249, 126, 23);
		contentPane.add(btnOdustani);
	}
	
}
