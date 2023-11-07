package br.com.teste.conta;

import br.com.conta.Conta;
import br.com.conta.Data;
import br.com.conta.Pessoa;

public class testaConta {
	
	public static void compararContas(Conta conta1, Conta conta2) {
		if(conta1 == conta2) {
			System.out.println("Sao iguais!");
		}else {
			System.out.println("Sao diferentes!");
			System.out.println(conta1);
			System.out.println(conta2);
		}
	}

	public static void main(String[] args) {
		
		Data d1 = new Data(06, 11, 2023);
		Pessoa p1 = new Pessoa("Fernanda", "111.222.333-44", 20, "31/08/1995");
		Conta c1 = new Conta("1234", "123456");		
		
		c1.setTitular(p1);
		System.out.println(c1.getId());
		
		Conta c2 = new Conta("1234", "111222");
		System.out.println(c2.getId());
		
		c1.recuperaDadosDeImpressao(c1.getTitular());
		
		//Conta c2;
		//c2 = c1;
		//compararContas(c1,c2);
		

	
	}		

}
