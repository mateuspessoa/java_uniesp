package ListaAtividades;

import java.util.Scanner;

public class SalarioFuncion�rio2 {
	
static double salarioAtual;
static double juros;
static double salaioMultiplicado;
static double salarioFInal;
static String finalizar = ""; 
static int i = 0;

	public static void main(String[] args) {
		
		while(i != -1) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe o seu sal�rio: ");
			double salarioAtual = leitor.nextDouble();
			
			if(salarioAtual > 500) {
				juros = 20 / 100.0;
				salaioMultiplicado = salarioAtual * juros;
				salarioFInal = salarioAtual + salaioMultiplicado;
				System.out.println("Seu novo sal�rio ser� de: R$ " + salarioFInal);
			}else {
				System.out.println("Voc� n�o poder� receber aumento");
			}
			
			System.out.println("Deseja sair? Digite sair.");
			String s = leitor.next();
			if (s.equals("fim") || s.equalsIgnoreCase("fim")) {
				i = -1;
			}
			
		}
		
	}

}
