package main;

import java.util.Scanner;

import tools.Calculo;

public class Menu {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num = 0;
		
		
		Calculo cal = new Calculo();
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		if(cal.antes(num) < 0) {
			System.out.println("Antecessor é negativo!");
		}else {
			System.out.println("O antecessor deste número é: " + cal.antes(num));
		}
	}
}
