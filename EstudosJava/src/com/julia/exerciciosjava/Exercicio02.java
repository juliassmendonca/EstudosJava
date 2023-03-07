package com.julia.exerciciosjava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o valor do lado do quadrado ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, lado);
		
		System.out.println(" O dobro da área do quadrado é :" + (area * 2);

	}

}
