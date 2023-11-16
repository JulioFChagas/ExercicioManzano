//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
package exercicioManzanoPg45;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número que deseja saber a tabuada: ");
	
	int numero=sc.nextInt();
	int contadora=1;
	
	while(contadora<11) {
		System.out.println(numero+" X "+contadora+" = "+numero*contadora);
		contadora++;
		
	}
	
	sc.close();
	
	}
}