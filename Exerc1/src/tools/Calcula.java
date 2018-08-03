package tools;

import java.util.Scanner;

public class Calcula {
	
	public static Scanner scan = new Scanner(System.in);

	public int a, b, c = 0;
	
	public Calcula(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int calcularX1(int a, int b, int c) {
		int x1 = 0;
		x1 = (0 - b + (int)Math.sqrt(delta(a, b, c))) / 2 * a;
		return x1;
	}

	public int calcularX2(int a, int b, int c) {
		int x2 = 0;
		x2 = (0 - b - (int)Math.sqrt(delta(a, b, c))) / 2 * a;
		return x2;
	}

	public int delta(int a, int b, int c) {
		int d = 0;
		d = (int)Math.pow(b, 2) - 4 * a * c;
		return d;
	}

	@Override
	public String toString() {
		return "A: " + this.a + "\nB: " + this.b + "\nC: " + this.c + "\nResultado de X1: " + calcularX1(a, b, c)
				+ "\nResultado de X2: " + calcularX2(a, b, c);
	}
}
