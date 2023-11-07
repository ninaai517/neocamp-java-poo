package br.com.conta;

public class Conta{
	
	private static int id;
	private Pessoa titular;
	private String numAgencia;
	private String numConta;
	private double saldo;
	private Data dataAbertura;	

	public Conta(String numAgencia, String numConta) {
		id++;
		this.numAgencia = numAgencia;
		this.numConta = numConta;
	}
	
	public double sacar(double valor) {
		if(valor <= this.saldo) {
			
			this.saldo = this.saldo - valor;
		
		}else {
			System.out.println("Saldo indisponível para saque!");
		}
		
		return this.getSaldo();		
	}
	
	public double depositar(double valor) {
		
		if(valor > 0) {
			this.saldo = this.saldo + valor;
		}
		return this.getSaldo();
	}
	
	public void getRendimentoMensal() {
		double percentualRendimento = 0.1;
		double rendimento;
		
		if(this.getSaldo() > 0) {
			rendimento = this.saldo * percentualRendimento;
			System.out.println("Rendimento mensal: R$" + rendimento);
		}else {
			System.out.println("Saldo zerado! Sem rendimentos esse mês.");
		}
	}
	

	public String recuperaDadosDeImpressao(Pessoa titular) {
		String dados = "\nTitular: " + titular.getNome();
		dados += "\nCPF: " + titular.getCpf();
		dados += "\nAgencia: " + this.getNumAgencia();
		dados += "\nNumero da Conta: " + this.getNumConta();
		dados += "\nData de Abertura: " + dataAbertura.dataFormatada();
		dados += "\nSaldo da conta:R$ " + this.getSaldo();		
		return dados;
	}
	
	public int getId() {
		return this.id;
	}
	public String getTitular(Pessoa titular) {
		return titular.getNome();
	}
	
	public Pessoa setTitular(Pessoa titular) {
		return titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

}
