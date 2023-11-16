//Elaborar um programa que apresente no final o somatório dos valores pares existente na faixa de 1 até 500.
package exercicioManzanoPg45;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int soma=0;
		int contadora=1;
		while(contadora<501) {
			if(contadora%2==0) {
				soma=soma+contadora;
		}
		contadora++;

			
		}
		System.out.println("A somatória dos números pares entre 1 e 500 é: "+soma);
	}

}
