package br.com.projeto;

import br.com.classes.diarista;
import br.com.classes.cliente;

public class app {

	public static void main(String[] args) {
		
		diarista diarista = new diarista();
		
		diarista.nome = "João da Silva";
		diarista.telefone = "(11) 99876-2345";
		diarista.endereco = "ruas por ai, Osasco";
		diarista.chavePix = "2000";
		
		System.out.println("Nome do diarista: " + diarista.nome);
		System.out.println("telefone do diarista: " + diarista.telefone);
		System.out.println("endereço do diarista: " + diarista.endereco);
		System.out.println("Chave pix do diarista: " + diarista.chavePix);
		diarista.atender("lucas");
		
		System.out.println("====================================================");
		
		cliente cliente = new cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "121212";
		cliente.endereco = "osasco";
		cliente.saldo = 100.0;
		
		System.out.println("Nome do cliente: " + cliente.nome);
		System.out.println("telefone do cliente: " + cliente.telefone);
		System.out.println("endereço do cliente: " + cliente.endereco);
		System.out.println("saldo do cliente: " + cliente.saldo);
	}

}
