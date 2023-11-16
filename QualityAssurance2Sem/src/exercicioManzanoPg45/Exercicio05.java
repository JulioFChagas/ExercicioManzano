//Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15.
package exercicioManzanoPg45;

public class Exercicio05 {

	public static void main(String[] args) {
	
	int expoente=0;
	
	while(expoente<=15) {
		double resultado = Math.pow(3, expoente);
		System.out.println("3^" + expoente + " = "+resultado);
		expoente++;
	}
	
		
	}

}
