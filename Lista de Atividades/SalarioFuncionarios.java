package ListaAtividades;

import java.util.Scanner;

public class SalarioFuncionarios {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o seu salário: ");
		double salarioOriginal = leitor.nextDouble();
		
		System.out.println("Informe o juros: ");
		double juros = leitor.nextDouble();
		
		double juros1 = juros / 100;
		
		double salarioLiquido = salarioOriginal * juros1;
		
		double salario = salarioOriginal + salarioLiquido;
		
		System.out.println(salario);

		leitor.close();
	}

}
