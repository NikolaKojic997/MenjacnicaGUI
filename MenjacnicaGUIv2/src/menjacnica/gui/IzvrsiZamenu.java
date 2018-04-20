package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenu extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField KupovniKursTextField;
	private JLabel lblValuta;
	private JComboBox ValutaComboBox;
	private JLabel lblProdajniKurs;
	private JTextField ProdajniKursTextField;
	private JLabel lblIznos;
	private JTextField IznosTextField_1;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider IznosSlider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	
	private MenjacnicaGUI glavniProzor = new MenjacnicaGUI();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenu(MenjacnicaGUI gp) {
		setTitle("Izvrsi Zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 377, 317);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblValuta());
		contentPane.add(getValutaComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajniKursTextField());
		
		ValutaComboBox.addItem("EUR");
		ValutaComboBox.addItem("USD");
		ValutaComboBox.addItem("CHF");
		contentPane.add(getLblIznos());
		contentPane.add(getIznosTextField_1());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		
		rdbtnKupovina.setSelected(true);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnKupovina);
		bg.add(rdbtnProdaja);
		contentPane.add(getIznosSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		
		IznosTextField_1.setText(""+IznosSlider.getValue());
		
		this.glavniProzor = gp;
		
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblKupovniKurs.setBounds(10, 11, 94, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (KupovniKursTextField == null) {
			KupovniKursTextField = new JTextField();
			KupovniKursTextField.setEditable(false);
			KupovniKursTextField.setBounds(10, 36, 130, 20);
			KupovniKursTextField.setColumns(10);
		}
		return KupovniKursTextField;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblValuta.setBounds(148, 13, 60, 14);
		}
		return lblValuta;
	}
	private JComboBox getValutaComboBox() {
		if (ValutaComboBox == null) {
			ValutaComboBox = new JComboBox();
			ValutaComboBox.setBounds(150, 36, 60, 20);
		}
		return ValutaComboBox;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni Kurs");
			lblProdajniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(218, 13, 94, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (ProdajniKursTextField == null) {
			ProdajniKursTextField = new JTextField();
			ProdajniKursTextField.setEditable(false);
			ProdajniKursTextField.setBounds(220, 36, 130, 20);
			ProdajniKursTextField.setColumns(10);
		}
		return ProdajniKursTextField;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblIznos.setBounds(10, 106, 94, 14);
		}
		return lblIznos;
	}
	private JTextField getIznosTextField_1() {
		if (IznosTextField_1 == null) {
			IznosTextField_1 = new JTextField();
			IznosTextField_1.setBounds(10, 131, 170, 20);
			IznosTextField_1.setColumns(10);
		}
		return IznosTextField_1;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta Transakcije");
			lblVrstaTransakcije.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblVrstaTransakcije.setBounds(190, 108, 122, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setBounds(186, 130, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(186, 158, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getIznosSlider() {
		if (IznosSlider == null) {
			IznosSlider = new JSlider();
			IznosSlider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					IznosTextField_1.setText(""+IznosSlider.getValue());
				}
			});
			IznosSlider.setMajorTickSpacing(10);
			IznosSlider.setPaintLabels(true);
			IznosSlider.setToolTipText("");
			IznosSlider.setPaintTicks(true);
			IznosSlider.setMinorTickSpacing(10);
			IznosSlider.setBounds(8, 181, 342, 45);
		}
		return IznosSlider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double iznos = IznosSlider.getValue();
					String skraceniNaziv = ValutaComboBox.getSelectedItem().toString();
					String vrsta;
					if (rdbtnKupovina.isSelected())
						vrsta = "Kupovni";
					else vrsta = "Prodajni";
					
					String zaStampu = "IZMENJEN KURS : "+"Valuta: " + skraceniNaziv + " Iznos: "+ iznos +" Vrsta kursa: "+ vrsta;
					
					glavniProzor.getStatusTextPane().setText(glavniProzor.getStatusTextPane().getText()+'\n'+ zaStampu);
					
					dispose();
					
				}
			});
			btnIzvrsiZamenu.setBounds(15, 237, 125, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(218, 237, 132, 23);
		}
		return btnOdustani;
	}
}
