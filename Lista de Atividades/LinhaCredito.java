package ListaAtividades;

import java.util.Scanner;

public class LinhaCredito {

static double salarioBruto;
static double valorEmprestimo;
static double parcelas;
static double valorMaximo;
static double valorMaximoFinal;
static double prestacoes;
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o seu salário bruto: ");
		salarioBruto = leitor.nextInt();
		
		System.out.println("Informe o valor do empréstimo: ");
		valorEmprestimo = leitor.nextInt();
		
		System.out.println("Informe em quantos meses você quer pagar: ");
		parcelas = leitor.nextInt();
		
		prestacoes = valorEmprestimo / parcelas;
		
		valorMaximo = 30 / 100.0;
		valorMaximoFinal = salarioBruto * valorMaximo;
		
		if(prestacoes < valorMaximoFinal) {
			System.out.println("Empréstimo Aprovado!");
		} else {
			System.out.println("Empréstimo não aprovado!");
		}
		
	
		
	}

}
