//Apresentar todos os valores numéricos inteiros impares na faixa de 0 a 20.
package exercicioManzanoPg45;

public class Exercicio04 {

	public static void main(String[] args) {
	
	int numero=0;
	
	while(numero<=20) {
		if (numero%2!=0) {
			System.out.println(numero);
		}
		numero++;
	}
	}

}
