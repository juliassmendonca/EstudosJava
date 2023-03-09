package com.julia.exerciciosifelseeswitchcase;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main (String[] args);
	
	Scanner scan = new Scanner(System.in);

	System.out.println("Entre com o primeiro número");
	int num1 = scan.nextInt();
	
	System.out.println("Entre com o segundo número");
	int num2 = scan.nextInt();
	
	System.out.println("Entre com o terceiro número");
	int num3 = scan.nextInt();
	
	
	if (num1 > num2 && num1 > num3) {
		 
		System.out.println("o número 1 é maior");
		
	    }     else if (num2 > num1 && num2 > num3) {
			
	        System.out.println("o número 2 é maior");
			
		} else if (num3 > num2 && num3 > num1) {
			
	        System.out.println("o número 3 é maior");

			
		}
			
			
		
		
		
		
		
	} 
}

   
        
