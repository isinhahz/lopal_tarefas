package br.dev.isabelle.tarefas.model;

import java.util.UUID;

public class Funcionario {

	private String nome;
	private String setor;
	private String matricula;
	private String cargo;
	
	public Funcionario(String nome) {
		this.nome = nome;
		UUID uuid = UUID.randomUUID();
		String uuid8 = uuid.toString().substring(0, 8);
		this.matricula = uuid8;
	}
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = uuid8;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getMatricula() {
		return matricula;
	}



	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return matricula + "," + nome + "," + cargo + "," + setor + "\n";
	}
	
	
}
