package br.com.teste.conta;

import java.text.DateFormat;
import java.time.LocalDate;

public class TestaData {
	
	LocalDate data;
	
	static void definirUmaData(int dia, int mes, int ano) {
		if(mes == 2) {
			if(dia < 29) {
				String dataCompleta = dia + "/" + mes + "/"+ ano;
				System.out.println(dataCompleta);
			}else {
				System.out.println("Dia "+ dia + " nao faz parte do mes de fevereiro!");
			}
		}
	}
	

	public static void main(String[] args) {
		
		definirUmaData(28,02,2023);
	}

}
