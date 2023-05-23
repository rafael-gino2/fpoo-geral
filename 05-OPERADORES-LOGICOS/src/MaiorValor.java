
public class MaiorValor {

	int n1 = 500;
	int n2 = 3000;
	int n3 = 8;
	
	/* SEM OPERADORES LÓGICOS */
	public void verificarMaior1() {
	
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("N1 É O MAIOR VALOR");
			}
		}
		
		if(n2 > n1) {
			if(n2 > n3) {
				System.out.println("N2 É O MAIOR VALOR");
			}
		}
		
		if(n3 > n1) {
			if(n3 > n2) {
				System.out.println("N3 É O MAIOR VALOR");
				
			}
		}
		
	}//FIM DO METODO verificarMaior1//
	
	public void verificarMaior2() {
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("N1 É O MAIOR VALOR");
		}
		
		if ((n2 > n1) && (n2 > n3)) {
			System.out.println("N2 É O MAIOR VALOR");
		}
		
		if ((n3 > n1) && (n3 > n2)) {
			System.out.println("N3 É O MAIOR VALOR");
		}
	}
}//FIM DA CLASSE MaiorValor//
