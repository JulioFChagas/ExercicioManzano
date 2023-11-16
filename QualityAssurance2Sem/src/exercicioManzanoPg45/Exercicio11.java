/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.)
 * O programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo, em seguida deve apresentar a área.
 */
package exercicioManzanoPg45;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numeroComodos;
	double areaTotal = 0;
	

	System.out.println("Quantos comodos tem a residência? ");
	numeroComodos = sc.nextInt();
	
	int contador = 1;
	while(contador<=numeroComodos) {
		System.out.println("\nCômodo: "+contador);
		
		System.out.print("Nome do cômodo");
		String nomeComodo = sc.next();
		
		System.out.println("Largura do cômodo em metros: ");
		double largura = sc.nextDouble();
		
		System.out.println("Comprimento do cômodo em metros: ");
		double comprimento = sc.nextDouble();
		
		double areaComodo = largura*comprimento;
		System.out.println("Área do cômodo "+areaComodo+ " metros quadrados");
		areaTotal += areaComodo;
		contador++;
	}
	
	System.out.println("\nÁrea total da residência "+areaTotal+ " metros quadrados");
	
	sc.close();
	}

}
