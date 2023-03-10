package com.julia.exerciciosifelseeswitchcase;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("digite um número");
		double num = scan.next.Double();


			switch (num) {

			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("segunda");
				break;
			case 3:
				System.out.println("terça");
				break;
			case 4:
				System.out.println("quarta");
				break;
			case 5:
				System.out.println("quinta");
				break;
			case 6:
				System.out.println("sexta");
				break;
			case 7:
				System.out.println("sabado");
				break;
			default:
				System.out.println("não é um dia da semana válido");
				break;

			}

	}

}
