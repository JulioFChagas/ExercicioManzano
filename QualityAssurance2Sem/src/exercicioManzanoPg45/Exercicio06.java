//Apresentar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer.
package exercicioManzanoPg45;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, base, expoente, resultado=1;
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextInt();

		System.out.println("Digite o vlaor do expoente: ");
		expoente = sc.nextInt();
	
		for(i=1;i<=expoente;i++) {
			resultado *= base;
		}
		
		System.out.println("\n"+base+ " Elevado a "+expoente+" é igual a "+resultado);
	
		sc.close();
	}
}
