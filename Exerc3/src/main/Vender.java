package main;

import tools.Calculo;

public class Vender {
		
	
	
	public static void main(String[] args) {
			
		Calculo cal = new Calculo();
		if(cal.getNum() != 0) {
			System.out.println("Valor a pagar: " 
		+ (cal.preco(cal.getNum()) * cal.getNum()) + "\nPreço da unidade: R$" 
					+ cal.preco(cal.getNum()));
		}
	}
}
