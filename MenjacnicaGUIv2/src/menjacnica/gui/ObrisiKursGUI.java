package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
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
	private JCheckBox chckbxZaistaObrisiKurs;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private MenjacnicaGUI glaviProzor ;;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Obrisi Kurs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
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
		contentPane.add(getChckbxZaistaObrisiKurs());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		btnObrisi.setEnabled(false);
		
		this.glaviProzor = gp;
		
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSifra.setBounds(10, 31, 111, 20);
		}
		return lblSifra;
	}
	private JTextField getSifraTextField() {
		if (SifraTextField == null) {
			SifraTextField = new JTextField();
			SifraTextField.setBounds(10, 62, 111, 20);
			SifraTextField.setColumns(10);
		}
		return SifraTextField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblNaziv.setBounds(131, 36, 111, 14);
		}
		return lblNaziv;
	}
	private JTextField getNazivTextField() {
		if (NazivTextField == null) {
			NazivTextField = new JTextField();
			NazivTextField.setBounds(131, 62, 116, 20);
			NazivTextField.setColumns(10);
		}
		return NazivTextField;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni Kurs");
			lblProdajniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblProdajniKurs.setBounds(10, 93, 111, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getProdajniKursTextField() {
		if (ProdajniKursTextField == null) {
			ProdajniKursTextField = new JTextField();
			ProdajniKursTextField.setBounds(10, 118, 111, 20);
			ProdajniKursTextField.setColumns(10);
		}
		return ProdajniKursTextField;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblKupovniKurs.setBounds(131, 93, 111, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getKupovniKursTextField() {
		if (KupovniKursTextField == null) {
			KupovniKursTextField = new JTextField();
			KupovniKursTextField.setBounds(131, 118, 116, 20);
			KupovniKursTextField.setColumns(10);
		}
		return KupovniKursTextField;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji Kurs");
			lblSrednjiKurs.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSrednjiKurs.setBounds(10, 146, 111, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getSrednjiKursTextField() {
		if (SrednjiKursTextField == null) {
			SrednjiKursTextField = new JTextField();
			SrednjiKursTextField.setBounds(10, 171, 111, 20);
			SrednjiKursTextField.setColumns(10);
		}
		return SrednjiKursTextField;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 14));
			lblSkraceniNaziv.setBounds(131, 149, 111, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getSkraceniNazivTextField() {
		if (SkraceniNazivTextField == null) {
			SkraceniNazivTextField = new JTextField();
			SkraceniNazivTextField.setBounds(131, 171, 116, 20);
			SkraceniNazivTextField.setColumns(10);
		}
		return SkraceniNazivTextField;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox cb = (JCheckBox) e.getSource();
			        if (cb.isSelected()) {
			            btnObrisi.setEnabled(true);
			        } else {
			        	btnObrisi.setEnabled(false);
			        }
				}
			});
			
			
			chckbxZaistaObrisiKurs.setBounds(10, 198, 232, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String sifra = SifraTextField.getText();
					String naziv = NazivTextField.getText();
					String skraceniNaziv = SkraceniNazivTextField.getText();
					Double prodajniKurs = Double.parseDouble(ProdajniKursTextField.getText());
					Double srednjiKurs = Double.parseDouble(SrednjiKursTextField.getText());
					Double kupovniKurs = Double.parseDouble(KupovniKursTextField.getText());
					
					String zaIspis = "OBRISAN KURS: "+"Sifra: " + sifra + " Naziv: " + naziv+ " Skraceni naziv: " +skraceniNaziv + " Prodajni Kurs: "
							+prodajniKurs+ " Srednji Kurs: "+ srednjiKurs + " Kupovni Kurs: "+ kupovniKurs;
					
					
					glaviProzor.getStatusTextPane().setText(glaviProzor.getStatusTextPane().getText()+'\n' + zaIspis);
					
					dispose();
				}
			});
			btnObrisi.setBounds(10, 228, 111, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(131, 228, 116, 23);
		}
		return btnOdustani;
	}
}
