package main;

import java.util.Scanner;

import tools.Calcula;

public class Baskara {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int a = 0, b = 0, c = 0;
		int exit = 0;
		
		Calcula cal = new Calcula(a, b, c);
		
		while (exit != 1) {
			System.out.println("A: ");
			cal.a = scan.nextInt();
			System.out.println("\nB: ");
			cal.b = scan.nextInt();
			System.out.println("\nC: ");
			cal.c = scan.nextInt();
			scan.nextLine();
			System.out.println(cal.toString());
			
			String sn = "";
			System.out.println("Deseja fazer outro calculo? (S/N)");
			sn = scan.nextLine();
			if(sn == "N" || sn == "n") {
				exit = 1;
				System.out.println("TCHAU");
			}
			System.out.println(sn == "n");
			System.out.println(exit);
		}
	}
}
