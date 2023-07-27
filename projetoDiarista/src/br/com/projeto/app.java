package br.com.projeto;

import br.com.classes.diarista;
import br.com.classes.Atendimento;
import br.com.classes.cliente;

public class app {

	public static void main(String[] args) {
		
		diarista diarista = new diarista();
		
		diarista.setNome("João da Silva");
		diarista.setTelefone("(11) 99876-2345");
		diarista.setEndereco("Ruas por ai, Osasco");
		diarista.setChavePix("2000");
		diarista.setSaldo(100.0);
		
		System.out.println("Nome do diarista: " + diarista.getNome());
		System.out.println("Telefone do diarista: " + diarista.getTelefone());
		System.out.println("Endereço do diarista: " + diarista.getEndereco());
		System.out.println("Chave pix do diarista: " + diarista.getChavePix());
		diarista.atender("lucas");
		System.out.println("Saldo cliente: " + diarista.getSaldo());
		diarista.depositar(30);
		diarista.sacar(10);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		
		
		System.out.println("====================================================");
		
		cliente cliente = new cliente();
		
		cliente.setNome("Daniel");
		cliente.setTelefone("121212");
		cliente.setEndereco("Osasco");
		cliente.setSaldo(100.0);
		
		
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Telefone do cliente: " + cliente.getTelefone());
		System.out.println("Endereço do cliente: " + cliente.getEndereco());
		System.out.println("Saldo cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		cliente.sacar(10);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		
		
		System.out.println("====================================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(0);
		System.out.println(atendimento.getHoras());
	}

}
