package Ex20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int anoFabricacao = 0;
		float valorCarro = 0.0f;
		float valorDesconto = 0.0f;
		float porcentagemDesconto = 0.0f;
		float valorPagar = 0.0f;

		int totalCarrosSemiNovos = 0;
		int totalCarros = 0;

		char desejaRepetir = 'S';
		while (desejaRepetir == 'S' || desejaRepetir == 's') {

			// Entrada de Dados
			System.out.println("Digite o ano fabrica��o:");
			anoFabricacao = leitor.nextInt();
			System.out.println("Digite o valor do carro:");
			valorCarro = leitor.nextFloat();

			if (anoFabricacao <= 2000) {
				// 12%
				porcentagemDesconto = 0.12f;
			} else {
				// 7%
				porcentagemDesconto = 0.07f;
				totalCarrosSemiNovos++;
			}
			totalCarros++;

			valorDesconto = valorCarro * porcentagemDesconto;
			valorPagar = valorCarro - valorDesconto;

			System.out.println("O valor do desconto foi de: " + valorDesconto);
			System.out.println("O valor que deve ser pago �:" + valorPagar);

			System.out.println("Deseja fazer mais cadastros:  (S/N)");

			desejaRepetir = leitor.next().charAt(0);
		}
		System.out.println("Total de carros semi-novos: " + totalCarrosSemiNovos);
		System.out.println("Total de carros: " + totalCarros);

	}

}
