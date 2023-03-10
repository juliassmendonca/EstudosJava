package com.julia.exerciciosifelseeswitchcase;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado 1");
		double lado1 = scan.nextDouble()
				
        
	    System.out.println("Digite o valor do lado 2");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o valor do lado 3");
		double lado3 = scan.nextDouble();
		
		
		if(((lado1 + lado2) > lado3)) &&
		       
		        ((lado2 + lado3) > lado1)) &&

                     ((lado1 + lado3) > lado2) {
		        	
		        	System.out.println(" é um triângulo");
		        	
		        	
		}  else {
			
			System.out.println("Não é um trinângulo");
			
		}
		
		
		
		

	}

}
