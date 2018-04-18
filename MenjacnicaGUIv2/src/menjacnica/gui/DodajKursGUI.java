package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private JLabel lblSifra;
	private JTextField SifraTextField;
	private JLabel lblNaziv;
	private JTextField NazivTextField;
	private JLabel lblProdajniKurs;
	private JTextField ProdajniKursTextField;
	private JLabel lblKupovniKurs;
	private JTextField KupovniKursTextField;
	private JLabel lblSrednjiKurs;
	private JTextField SrednjiKursTextField;
	private JLabel lblSkraceniNaziv;
	private JTextField SkraceniNazivTextField;

	private MenjacnicaGUI glavniProzor = new MenjacnicaGUI();;
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
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 282, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblSifra());
		contentPane.add(getSifraTextField());
		contentPane.add(getLblNaziv());
		contentPane.add(getNazivTextField());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getProdajniKursTextField());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getKupovniKursTextField());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getSrednjiKursTextField());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getSkraceniNazivTextField());
		
		
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = SifraTextField.getText();
					String naziv = NazivTextField.getText();
					String skraceniNaziv = SkraceniNazivTextField.getText();
					Double prodajniKurs = Double.parseDouble(ProdajniKursTextField.getText());
					Double srednjiKurs = Double.parseDouble(SrednjiKursTextField.getText());
					Double kupovniKurs = Double.parseDouble(KupovniKursTextField.getText());
					
					String zaIspis = "Sifra: " + sifra + " Naziv: " + naziv+ " Skraceni naziv: " +skraceniNaziv + " Prodajni Kurs: "
							+prodajniKurs+ " Srednji Kurs: "+ srednjiKurs + " Kupovni Kurs: "+ kupovniKurs;
					
					glavniProzor.getStatusTextPane().setText('\n' + zaIspis);
					
				}
			});
			btnDodaj.setBounds(10, 194, 120, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(136, 194, 120, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JTextField getSifraTextField() {
		if (SifraTextField == null) {
			SifraTextField = new JTextField();
			SifraTextField.setBounds(10, 36, 120, 20);
			SifraTextField.setColumns(10);
		}
		return SifraTextField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblNaziv.setBounds(136, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getNazivTextField() {
		if (NazivTextField == null) {
			NazivTextField = new JTextField();
			NazivTextField.setBounds(136, 36, 120, 20);
			NazivTextField.setColumns(10);
		}
		return NazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni Kurs");
			lblProdajniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(10, 67, 120, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (ProdajniKursTextField == null) {
			ProdajniKursTextField = new JTextField();
			ProdajniKursTextField.setBounds(10, 92, 120, 20);
			ProdajniKursTextField.setColumns(10);
		}
		return ProdajniKursTextField;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblKupovniKurs.setBounds(136, 67, 120, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (KupovniKursTextField == null) {
			KupovniKursTextField = new JTextField();
			KupovniKursTextField.setBounds(136, 92, 120, 20);
			KupovniKursTextField.setColumns(10);
		}
		return KupovniKursTextField;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji Kurs");
			lblSrednjiKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSrednjiKurs.setBounds(10, 123, 120, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getSrednjiKursTextField() {
		if (SrednjiKursTextField == null) {
			SrednjiKursTextField = new JTextField();
			SrednjiKursTextField.setBounds(10, 148, 120, 20);
			SrednjiKursTextField.setColumns(10);
		}
		return SrednjiKursTextField;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSkraceniNaziv.setBounds(136, 123, 120, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSkraceniNazivTextField() {
		if (SkraceniNazivTextField == null) {
			SkraceniNazivTextField = new JTextField();
			SkraceniNazivTextField.setBounds(136, 148, 120, 20);
			SkraceniNazivTextField.setColumns(10);
		}
		return SkraceniNazivTextField;
	}
}
