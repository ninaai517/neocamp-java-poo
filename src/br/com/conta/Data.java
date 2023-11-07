package br.com.conta;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		if(this.mes < 13 && this.mes > 0) {
			this.mes = mes;
		}
		this.ano = ano;
	}
	
	public String dataFormatada() {
		String dataFormatada = this.getDia() + "/" + this.getMes() + "/" + this.getAno();
		
		return dataFormatada;
		
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

}
