//Escreva um programa que apresente a série de Fibonnaci até o décimo quinto termo. 
package exercicioManzanoPg45;

public class Exercicio07 {

	public static void main(String[] args) {
		int primeiroTermo = 1;
		int segundoTermo = 1;
		int i=1;
		
		System.out.println("Série de Fibonacci até o décimo quinto termo:");
		
		while(i<=15) {
			System.out.println(primeiroTermo+" ");
			
			int proximoTermo = primeiroTermo+segundoTermo;
			primeiroTermo=segundoTermo;
			segundoTermo=proximoTermo;
			
			i++;
		}

	}

}
