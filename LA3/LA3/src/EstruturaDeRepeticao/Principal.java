package EstruturaDeRepeticao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("------------------------------------------");

		int totalAluno = 10;

		while (totalAluno > 0) {

			System.out.println("Nome do aluno");
			
			String nome = scan.nextLine();
			System.out.println("Idade:");
			int idade = scan.nextInt();

			System.out.println("Aluno " + nome + " sua idade: " + idade);
			
			totalAluno = totalAluno - 1;
		

		}

	}

}
