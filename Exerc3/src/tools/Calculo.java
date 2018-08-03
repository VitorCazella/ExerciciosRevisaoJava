package tools;

import java.util.Scanner;

public class Calculo {
	
	private int num = 0;
	
	public static Scanner scan = new Scanner(System.in);
	
	public Calculo() {
		System.out.println("Número de maçãs: ");
		try {
			this.num = scan.nextInt();
		} catch (Exception e) {
			System.out.println("\n\nDigite um número!\n\n");
		}
	}
	
	public double preco(int num) {
		double preco = 0;
		if(num < 12 && num > 0) {
			preco = 1.30;
		}else {
			preco = 1.00;
		}
		return preco;
	}
	
	public int sair(String opcao) {
		int resp = 0;
		if(opcao == "S" && opcao == "s") {
			resp = 1;
		}
		return resp;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int n) {
		this.num = n;
	}
	
}
