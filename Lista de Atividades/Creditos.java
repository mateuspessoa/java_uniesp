package ListaAtividades;

import java.util.Scanner;

public class Creditos {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor dos cr�ditos: ");
		double valorCreditos = leitor.nextFloat();
		
		System.out.println("Informe percentual de aumento: ");
		double percentualAumento = leitor.nextFloat();
		
		var juros =  percentualAumento / 100;
		
		var valorParaSomar = valorCreditos * juros;
		
		var valorFinal = valorCreditos + valorParaSomar;
		
		System.out.println("O valor final dos cr�ditos com aumento � de: " + valorFinal);
		
	}

}
