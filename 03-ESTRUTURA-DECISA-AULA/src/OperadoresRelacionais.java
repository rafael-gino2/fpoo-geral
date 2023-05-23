
public class OperadoresRelacionais {

	int valor1, valor2;
	
	public void testelogicos() {
	/*
	 < - MENOR
	 < = - MENOOR IGUAL
	 > - MAIOR
	 > = MAIOR IGUAL	
	  = = - IGUALDADE
	  != - DIFERENTE
	  */
	
	this.valor1 = 10;
	this.valor2 = 100;
	boolean resultado;
	
	System.out.println("TESTE LÓGICO: " + this.valor1 + " < " + this.valor2);
	resultado = valor1 < valor2;	
	System.out.println("RESULTADO: " + resultado);
	

	System.out.println("TESTE LÓGICO: " + this.valor1 + " <= "  + this.valor2);
	resultado = valor1 <= valor2;	
	System.out.println("RESULTADO: " + resultado);
	

	System.out.println("TESTE LÓGICO: " + this.valor1 + " = " + this.valor2);
	resultado = valor1 == valor2;	 
	System.out.println("RESULTADO: " + resultado);
		
	System.out.println("TESTE LÓGICO: " + this.valor1 + " != " + this.valor2);
	resultado = valor1 != valor2;	 
	System.out.println("RESULTADO: " + resultado);	
	
	
	
	
}
	}


