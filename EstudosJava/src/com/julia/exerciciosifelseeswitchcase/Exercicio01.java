package com.julia.exerciciosifelseeswitchcase;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String letra = scan.next();
		
		
		
		if (letra.length() > 1){
			
			System.out.println("não é uma letra válida");	
			
		} else {
		
		Switch(letra){
			
		case 1  "a":
		case 2  "e":
		case 3  "i":
		case 4  "o":
		case 5  "u":
		case 6  "A":
		case 7  "E":
		case 8  "I":
		case 9  "O":
		case 10  "U":System.out.println("vogal"); break;
		default: System.out.println("Consoante");
			
		
		}
		
	  }
		

	}

}