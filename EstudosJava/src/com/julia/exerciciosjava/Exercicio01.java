package com.julia.exerciciosjava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Escreva o valor do raio do circulo: ");
		double raio = scan.nextDouble(); 
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println(" o valor da área é: " + area);
		 

	}

}