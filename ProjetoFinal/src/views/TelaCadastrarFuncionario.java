package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexao.Conexao;
import DAO.funcionarioDAO;
import SistemaCorporativo.Funcionario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;

public class TelaCadastrarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private funcionarioDAO funcionarioD;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarFuncionario frame = new TelaCadastrarFuncionario();
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
		setTitle("Cadastro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null); /*CENTRALIZA O CONTAINER*/
	}
	
	public TelaCadastrarFuncionario() {
		
		configuracoesTela();
		
		JLabel lblLogin = new JLabel("Nome:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblLogin.setBounds(20, 11, 55, 14);
		contentPane.add(lblLogin);
		
		txtNome = new JTextField();
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(30, 28, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JFormattedTextField txtRg = new JFormattedTextField();
		txtRg.setBounds(30, 123, 100, 20);
		try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		int rg = Integer.parseInt(txtRg.getText().replace(".","").replace("-",""));
		contentPane.add(txtRg);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Arial", Font.BOLD, 12));
		lblIdade.setBounds(140, 298, 55, 14);
		contentPane.add(lblIdade);
		
		JFormattedTextField txtCpf = new JFormattedTextField();
		try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		txtCpf.setBounds(30, 75, 100, 20);
		contentPane.add(txtCpf);
		int cpf = Integer.parseInt(txtCpf.getText().replace(".","").replace("-",""));
		
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(150, 315, 30, 20);
		contentPane.add(txtIdade);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 12));
		lblCpf.setBounds(20, 58, 55, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setFont(new Font("Arial", Font.BOLD, 12));
		lblRg.setBounds(20, 103, 55, 14);
		contentPane.add(lblRg);
		
		JLabel lblPerfilFuncionrio = new JLabel("Perfil Funcion\u00E1rio:");
		lblPerfilFuncionrio.setFont(new Font("Arial", Font.BOLD, 12));
		lblPerfilFuncionrio.setBounds(20, 154, 110, 14);
		contentPane.add(lblPerfilFuncionrio);
		
		JLabel lblResponsavel = new JLabel("Responsavel:");
		lblResponsavel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblResponsavel.setBounds(20, 202, 86, 14);
		contentPane.add(lblResponsavel);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(20, 250, 55, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(30, 267, 150, 20);
		contentPane.add(txtEmail);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 12));
		lblSenha.setBounds(20, 298, 55, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(30, 315, 100, 20);
		contentPane.add(txtSenha);
		
		JComboBox comboBoxPerfil = new JComboBox();
		comboBoxPerfil.setBackground(Color.WHITE);
		comboBoxPerfil.setModel(new DefaultComboBoxModel(new String[] {"Gerente Chefe", "Gestor", "Funcion\u00E1rio"}));
		comboBoxPerfil.setBounds(30, 171, 150, 20);
		contentPane.add(comboBoxPerfil);
		
		JComboBox comboBoxResponsavel = new JComboBox();
		comboBoxResponsavel.setBackground(Color.WHITE);
		comboBoxResponsavel.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBoxResponsavel.setBounds(30, 219, 150, 20);
		contentPane.add(comboBoxResponsavel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(205, 0, 289, 371);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel icone_usuario = new JLabel("");
		icone_usuario.setHorizontalAlignment(SwingConstants.CENTER);
		icone_usuario.setIcon(new ImageIcon(TelaCadastrarFuncionario.class.getResource("/Icones/user.png")));
		icone_usuario.setBounds(99, 132, 97, 72);
		panel.add(icone_usuario);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 18));
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setBounds(88, 204, 127, 33);
		panel.add(lblCadastro);
		
		JLabel lblFuncionarios = new JLabel("DE FUNCION\u00C1RIOS");
		lblFuncionarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuncionarios.setForeground(Color.WHITE);
		lblFuncionarios.setFont(new Font("Arial", Font.BOLD, 18));
		lblFuncionarios.setBounds(32, 230, 233, 27);
		panel.add(lblFuncionarios);
		
		JLabel sair = new JLabel("");
		sair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		sair.setIcon(new ImageIcon(TelaCadastrarFuncionario.class.getResource("/Icones/sair-menu-2.png")));
		sair.setBounds(243, 11, 22, 21);
		panel.add(sair);
		
		JButton btnLimparCampos = new JButton("Limpar \r\nCampos");
		btnLimparCampos.setForeground(Color.WHITE);
		btnLimparCampos.setBackground(Color.DARK_GRAY);
		btnLimparCampos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimparCampos.setBounds(147, 327, 132, 33);
		panel.add(btnLimparCampos);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(TelaCadastrarFuncionario.class.getResource("/Icones/login.png")));
		
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBackground(Color.DARK_GRAY);
		btnRegistrar.setBounds(10, 327, 127, 33);
		panel.add(btnRegistrar);
		btnRegistrar.grabFocus();
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String senha = txtSenha.getText();
				String login = nome;
				String rg = txtRg.getText();
				String cpf = txtCpf.getText();
				int perfil = comboBoxPerfil.getSelectedIndex();
				int responsavel = comboBoxResponsavel.getSelectedIndex() + 1;
				String email = txtEmail.getText();
				
				Funcionario funcionario = new Funcionario(nome, senha, email, login, rg, cpf, perfil, responsavel);
				funcionarioD = new funcionarioDAO();
				funcionarioD.insertFuncionario(funcionario);
				
			}
		});
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(TelaCadastrarFuncionario.class.getResource("/bg2.jpg")));
		background.setBounds(0, 0, 206, 371);
		contentPane.add(background);
	}
}
