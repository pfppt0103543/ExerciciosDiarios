package exercicios071016;

import java.util.Random;
import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class treino {

	public treino() {
		exercicio3();
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
	private void exercicio3() {
		int limite = 5;
		int rand = (new Random()).nextInt(limite)+1;
	

		
		for (int i = 0; i < 5; i++) {
			System.out.println("Insere o "+(i+1)+"º");
			int num = (new Scanner(System.in)).nextInt();
			if(num == rand){
				System.out.println("ACERTOU!!");
				System.exit(0);
			}else if(i == 5){
				System.out.println("Falou nas 5 tentativas");
			}
			
		}
	}
	
}
