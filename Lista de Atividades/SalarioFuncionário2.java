package ListaAtividades;

import java.util.Scanner;

public class SalarioFuncionário2 {
	
static double salarioAtual;
static double juros;
static double salaioMultiplicado;
static double salarioFInal;
static String finalizar = ""; 
static int i = 0;

	public static void main(String[] args) {
		
		while(i != -1) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe o seu salário: ");
			double salarioAtual = leitor.nextDouble();
			
			if(salarioAtual > 500) {
				juros = 20 / 100.0;
				salaioMultiplicado = salarioAtual * juros;
				salarioFInal = salarioAtual + salaioMultiplicado;
				System.out.println("Seu novo salário será de: R$ " + salarioFInal);
			}else {
				System.out.println("Você não poderá receber aumento");
			}
			
			System.out.println("Deseja sair? Digite sair.");
			String s = leitor.next();
			if (s.equals("fim") || s.equalsIgnoreCase("fim")) {
				i = -1;
			}
			
		}
		
	}

}
