package main;

import java.util.Scanner;

import tools.Calculo;

public class Venda {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calculo cal = new Calculo();
		int num = 0;
		System.out.println("N�mero de ma��s: ");
		try {
			num = scan.nextInt();
		} catch (Exception e) {
			System.out.println("\n\nDigite um n�mero!\n\n");
		}
		
		if(num != 0) {
			System.out.println("Valor a pagar: " + (cal.preco(num) * num) + "\nPre�o da unidade: R$" + cal.preco(num));
		}
	}
}
