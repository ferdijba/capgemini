package Ex15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		numero = scan.nextInt();

		if (numero > 100 && numero < 200) {
			System.out.println("O n�mero " + numero + " est� entre 100 e 200!");
		} else {
			System.out.println("O n�mero " + numero + " n�o esta entre 100 e 200");
		}

	}

}
