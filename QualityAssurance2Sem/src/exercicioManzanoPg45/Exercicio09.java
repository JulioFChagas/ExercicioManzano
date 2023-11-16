//Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente o total do somatório e a média aritmética dos valores lidos.
package exercicioManzanoPg45;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contador=1;
		double somatorio=0;
		
		while(contador<=10) {
			System.out.println("Digite o valor "+contador+": ");
			double valor = sc.nextDouble();
			
			somatorio += valor;
			
			contador++;
		}
		double media = somatorio/10;
		
		System.out.println("\nTotal do somatório: "+somatorio);
		System.out.println("Média aritmética: "+media);
		sc.close();
	}

}
