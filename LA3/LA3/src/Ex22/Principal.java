package Ex22;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String produto;
		float preco;
		float precoVenda;
		float totalCusto = 0;
		float totalVenda = 0;

		Scanner leitor = new Scanner(System.in);

		int i = 0;
		for (; i < 2; i++) {
			System.out.println("Digite o nome do produto: ");
			produto = leitor.nextLine();

			System.out.println("Digite o preco de custo");
			preco = leitor.nextFloat();

			System.out.println("Digite o preco de venda");
			precoVenda = leitor.nextFloat();

			totalCusto = totalCusto + preco;
			totalVenda = totalVenda + precoVenda;

			if (preco == precoVenda) {
				System.out.println("Houve um empate entre preco de custo e preco de venda");

			} else {
				if (preco > precoVenda) {
					System.out.println("Houve um prejuizo entre preco de custo e preco de venda");
				} else {
					System.out.println("Houve lucro!!");
				}
			}

			System.out.println(produto + " , preco de custo = " + preco + ", preco de Venda " + precoVenda);

			System.out.println("O m�dia do preco de custo � de:" + (totalCusto / i));
			System.out.println("O m�dia do preco de venda � de:" + (totalVenda / i));
		}

	}

}
