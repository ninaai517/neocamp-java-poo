package br.com.conta;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private int idade;
	protected String dataNasc;
	
	public Pessoa(String nome, String cpf, int idade, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void getDadosCadastrais() {
		getNome();
		getCpf();
	}
	

}
