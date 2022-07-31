package Ex15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		numero = scan.nextInt();

		if (numero > 100 && numero < 200) {
			System.out.println("O número " + numero + " está entre 100 e 200!");
		} else {
			System.out.println("O número " + numero + " não esta entre 100 e 200");
		}

	}

}
