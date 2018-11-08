package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextArea;
import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;

public class TelaReembolso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaReembolso frame = new TelaReembolso();
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
	public void configuracoesTela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public TelaReembolso() {
		configuracoesTela();
		
		JPanel background = new JPanel();
		background.setLayout(null);
		background.setBackground(Color.DARK_GRAY);
		background.setBounds(0, 0, 694, 421);
		contentPane.add(background);
		
		JLabel label = new JLabel("Data:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(235, 78, 43, 14);
		background.add(label);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setModel(new DefaultComboBoxModel(new String[] {"Refei\u00E7\u00E3o", "Taxi", "Estacionamento", "Brinde", "Passagens", "Hospedagem"}));
		comboCategoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboCategoria.setBackground(Color.WHITE);
		comboCategoria.setBounds(60, 186, 130, 23);
		background.add(comboCategoria);
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setToolTipText("Fa\u00E7a uma descri\u00E7\u00E3o sucinta.");
		txtDescricao.setTabSize(6);
		txtDescricao.setLineWrap(true);
		txtDescricao.setForeground(Color.DARK_GRAY);
		txtDescricao.setBackground(Color.WHITE);
		txtDescricao.setBounds(410, 103, 152, 59);
		background.add(txtDescricao);
		
		
		
		JTextArea txtContas = new JTextArea();
		txtContas.setRows(100);
		txtContas.setForeground(Color.DARK_GRAY);
		txtContas.setEditable(false);
		txtContas.setBackground(Color.WHITE);
		txtContas.setBounds(60, 289, 502, 112);
		background.add(txtContas);
		
		JLabel enviar = new JLabel("");
		enviar.setIcon(new ImageIcon(TelaReembolso.class.getResource("/icons 1/page_add.png")));
		enviar.setToolTipText("Enviar");
		enviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enviar.setBounds(300, 228, 23, 16);
		background.add(enviar);
		
		JLabel limpar = new JLabel("");
		limpar.setIcon(new ImageIcon(TelaReembolso.class.getResource("/icons 1/cancel.png")));
		limpar.setToolTipText("Limpar Campos");
		limpar.setBounds(333, 230, 23, 14);
		background.add(limpar);
		
		JLabel label_3 = new JLabel("M\u00EAs de Refer\u00EAncia:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(50, 78, 120, 14);
		background.add(label_3);
		
		JComboBox comboMesReferencia = new JComboBox();
		comboMesReferencia.setModel(new DefaultComboBoxModel(new String[] {"Janeiro", "Fevereiro", "Mar\u00E7o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"}));
		comboMesReferencia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboMesReferencia.setBackground(Color.WHITE);
		comboMesReferencia.setBounds(60, 103, 130, 23);
		background.add(comboMesReferencia);
		
		JLabel label_5 = new JLabel("Cadastrar Conta");
		label_5.setIcon(new ImageIcon(TelaReembolso.class.getResource("/icons 1/layout_add.png")));
		label_5.setToolTipText("Cadastrar Conta");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(267, 255, 120, 23);
		background.add(label_5);
		
		JLabel label_6 = new JLabel("Valor Pago:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(230, 159, 76, 17);
		background.add(label_6);
		
		JLabel label_7 = new JLabel("Categoria:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(65, 158, 76, 17);
		background.add(label_7);
		
		JLabel label_8 = new JLabel("Descri\u00E7\u00E3o:");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(410, 78, 76, 17);
		background.add(label_8);
		
		JLabel icone_sair = new JLabel("");
		icone_sair.setIcon(new ImageIcon(TelaReembolso.class.getResource("/Icones/sair-menu-2.png")));
		icone_sair.setBounds(20, 22, 22, 21);
		background.add(icone_sair);
		
		JLabel icone_usuario = new JLabel("");
		icone_usuario.setIcon(new ImageIcon(TelaReembolso.class.getResource("/Icones/user.png")));
		icone_usuario.setBounds(300, 11, 93, 71);
		background.add(icone_usuario);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(230, 103, 130, 23);
		background.add(dateChooser);
		
		JFormattedTextField txtValorPago = new JFormattedTextField();
		txtValorPago.setBounds(235, 186, 125, 23);
		try {
            txtValorPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###R$")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		int valorPago = Integer.parseInt(txtValorPago.getText().replace(".","").replace("R$",""));
		background.add(txtValorPago);
		
	}
}