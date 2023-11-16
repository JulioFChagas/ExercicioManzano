//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4...+98+99+100)
package exercicioManzanoPg45;

public class Exercicio02 {

	public static void main(String[]args) {
	
	int contadora=1;
	int soma=0;
	while(contadora<101) {
		soma=soma+contadora;
		contadora++;
		}
	System.out.println("A soma dos cem primeiros números positivos é : "+soma);
	}
}	
