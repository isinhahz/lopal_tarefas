package br.dev.isabelle.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

import br.dev.isabelle.tarefas.dao.FuncionarioDAO;
import br.dev.isabelle.tarefas.model.Funcionario;
import br.dev.isabelle.tarefas.model.Tarefas;
import br.dev.isabelle.tarefas.ui.FuncionarioFrame;

public class Main {
	
    static String caminho = "/Users/25132976/tarefasDS1TA/tarefas";
    
	public static void main(String[] args) {
		
		new FuncionarioFrame();
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		
		String uuid8 = uuid.toString().substring(0, 8);
		System.out.println(uuid8);
		
		Funcionario f = new Funcionario("Pedro", "Programador"); 
		f.setSetor("TI");
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Carlos Augusto");
		f2.setCargo("Analista de Sistemas");
		f2.setSetor("TI");
		
		FuncionarioDAO dao = new FuncionarioDAO(f2);
		dao.salvar();
		
	}
	
	private static void escreverArquivo() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			// adicionando conteúdo ao arquivo
//			bw.append("Senai Jandira");
//			bw.append("Isabelle");
			bw.append("Lógica de Programação\n");
			bw.append("Senai\n");
			bw.append("Programação\n");
			
			
			
			// Mandando escrever no arquivo
			bw.flush();
		
		} catch (Exception e) {
			
		}
	}

	private static void lerArquivo() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String retorno = br.readLine();
			
			while (retorno != null) {
				System.out.println(retorno);
				retorno = br.readLine();
			}
			
		} catch (FileNotFoundException erro) {
			System.out.println("O arquivo não foi encontrado!");
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro!");
			
		}
		
		System.out.println("fim");
	}

}
