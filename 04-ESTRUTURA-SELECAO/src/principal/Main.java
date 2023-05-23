package principal;


import operacional.EstruturaSelacao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String genero;
		
		EstruturaSelacao objEstruturaSelecao =  new EstruturaSelacao();
		
		Scanner objScanner = new Scanner(System.in);
		
		System.out.println("INFORME UM VALOR PARA GENERO");
		genero = objScanner.next();
		
		objEstruturaSelecao.setGenero(genero.toLowerCase());
	}

}
