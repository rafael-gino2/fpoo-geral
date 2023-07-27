package br.com.classes;

public class cliente extends pessoa {
	
	protected double saldo;


	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
	}

	@Override
	public void depositar(int valor) {
		// TODO Auto-generated method stub
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + (0.1 * valor);
		this.setSaldo(novoSaldo);
	}

}
