package com.julia.estudosjava;

import java.util.Scanner;

public class LeituraScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
        
		System.out.println("Digite seu nome completo:");   
		String nomeCompleto = scan.nextLine();
		System.out.println(" seu nome completo é " + nomeCompleto);
		
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é " + primeiroNome);
		
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt(); 
		System.out.println("Sua idade é " + idade);
		
		System.out.println("Digite a sua altura");
        Double altura = scan.nextDouble();
        System.out.println("A sua altura é " + altura);
			
	}
	

	

}
