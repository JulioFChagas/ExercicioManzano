//Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.
package exercicioManzanoPg45;

public class Exercicio10 {

	public static void main(String[] args) {
		
	int numero=50;
	while(numero<=70) {
		if(numero%2==0) {
			System.out.println(numero);
		}
	numero++;
	}
	}

}
