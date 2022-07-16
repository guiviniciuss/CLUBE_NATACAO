package br.com.senac.nadadores;

import java.util.Scanner;


public class RegistroDeNadadores {

	public static void main(String[] args) {
		
		int idade = 0;
		
		int valorDigitado = 0;
		
		
		
		Scanner leitorDeEntrada = new Scanner(System.in);
		
		
		System.out.println("Digite a idade do nadador:" );
		
		
		valorDigitado = leitorDeEntrada.nextInt();
		
		
		if (valorDigitado >= 18 ) {
			
			System.out.println("Adultos");
			
			

		} else if (valorDigitado >= 14) {
			
			System.out.println("Juvenil B");
			
			

		} else if (valorDigitado >= 12) {
			
			System.out.println("Juvenil A");
			
			
			
		} else if (valorDigitado >= 8) {
			
			System.out.println("Infantil B");
			
			
			
		} else if (valorDigitado >= 5) {
			
			System.out.println("Infantil A");
			
			
			
		} else{ System.out.println("Não pode ser registrado.");
		
		}
		
		
	}

}