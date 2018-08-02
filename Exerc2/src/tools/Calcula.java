package tools;

import java.util.Scanner;

public class Calcula {
	
	public int numero = 0;
	
	Scanner scan = new Scanner(System.in);
	
	public Calcula() {
	}
	
	public void repete() {
		System.out.println("Digite um número para repetir: ");
		int x = scan.nextInt();
		double soma = 0, num = 0, media = 0; 
		for(int i = x; i > -1; i = i - 1) {
			soma = soma + i;
			num++;
			System.out.println(i);
		}
		media = soma/(num - 1);
		System.out.println("Soma: " + soma + "\nMédia: " + media);
	}
	
}
