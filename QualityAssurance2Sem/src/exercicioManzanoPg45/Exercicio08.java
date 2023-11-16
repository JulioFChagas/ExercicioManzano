//Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus e finalizando em 100.
package exercicioManzanoPg45;

public class Exercicio08 {

	public static void main(String[] args) {
		int c = 10;
		int fc = 100;
		int incremento = 10;
		
		System.out.printf("%-15s%-15s%n","Celsius","Fahrenheit");
		
		int celsius = c;
		
		while(celsius<=fc) {
			double fahrenheit = converterFahrenheit(celsius);
			System.out.printf("%-15d%-15.2f%n",celsius,fahrenheit);
			
			celsius+=incremento;
		}

	}
	private static double converterFahrenheit(int celsius) {
		return(celsius *9.0/5.0)+32.0;
	}
}
