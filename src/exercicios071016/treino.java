package exercicios071016;

import java.util.Scanner;

public class treino {

	public treino() {
		exercicio2();
	}

	private void exercicio1() {
		System.out.println("Num 1: ");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Num 2: ");
		int num2 = (new Scanner(System.in)).nextInt();

		if (num1 > num2) {
			System.out.println("Num 1 é o maior");
		} else {
			System.out.println("Num 2 é o maior");
		}

	}

	private void exercicio2() {
		System.out.println("Num 1: ");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Num 2: ");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Num 3: ");
		int num3 = (new Scanner(System.in)).nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("Num 1 é o maior");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("Num 2 é o maior");
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("Num 3 é o maior");
		}

	}
}
