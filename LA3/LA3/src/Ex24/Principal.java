package Ex24;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int numero;
		int opcao;
		char desejaContinuar = 'S';

		Scanner leitor = new Scanner(System.in);
		opcao = 0;

		while (desejaContinuar == 'S' || desejaContinuar == 's') {
			System.out.println("Digite um n�mero:");
			numero = leitor.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println("O n�mero � par");
			} else {
				System.out.println("O n�mero � �mpar");
			}

			System.out.println("Deseja continuar (S/N)");
			//Pega a primeira letra
			desejaContinuar = leitor.next().charAt(0);
			
		}

	}

}
