package tools;

import java.util.Scanner;

public class Calcula {
	
	public int numero = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public Calcula() {
	}
	
	public void repete() {
		double soma = 0, num = 0, media = 0;
		int x = 0;
		do {
			System.out.println("Digite um número: ");
			x = scan.nextInt();
			
			soma = soma + x;
			num++;
			 
		} while (x != 0);
		
		media = soma/(num - 1);
		System.out.println("Soma: " + soma + "\nM�dia: " + media);
	}
	
}
