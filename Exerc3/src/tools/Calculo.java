package tools;

public class Calculo {
	
	public Calculo() {
	}
	
	public double preco(int num) {
		double preco = 0;
		if(num < 12) {
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
	
}
