package br.dev.isabelle.tarefas.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FuncionarioFrame {
	
	public FuncionarioFrame() {
		
	}

	
	private void criarTela () {
		
		JFrame tela = new JFrame();
		tela.setSize(400, 400);
		tela.setTitle("Cadastro de Funcionários");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 10, 150, 30);
		JTextField txtNome = new JTextField();
		txtNome.setBounds(10, 40, 200, 30);
		
		JLabel labelCargo = new JLabel("Cargo:");
		labelCargo.setBounds(10, 75, 150, 30);
		JTextField txtCargo = new JTextField();
		txtCargo.setBounds(10, 105, 150, 30);
		
		JLabel labelSetor = new Jlabel("Setor:");
		labelSetor.setBounds(10, 140, 150, 30);
		JTextField txtSetor = new JTextField();
		txtSetor.setBounds();
		
		
		
		
		
		
		
		
	}
}
