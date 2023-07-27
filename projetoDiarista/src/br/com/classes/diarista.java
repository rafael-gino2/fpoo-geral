package br.com.classes;

public class diarista extends pessoa {

	
	private String chavePix;
	
	public void atender(String nomeCliente) {
		
		System.out.println("realizando atendimento para cliente: " + nomeCliente);
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public void sacar(int valor) {
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(int valor) {
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + (0.1 * valor);
		this.setSaldo(novoSaldo);
		
	}
}
