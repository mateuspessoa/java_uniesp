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
		System.out.println("Informe o seu sal�rio bruto: ");
		salarioBruto = leitor.nextInt();
		
		System.out.println("Informe o valor do empr�stimo: ");
		valorEmprestimo = leitor.nextInt();
		
		System.out.println("Informe em quantos meses voc� quer pagar: ");
		parcelas = leitor.nextInt();
		
		prestacoes = valorEmprestimo / parcelas;
		
		valorMaximo = 30 / 100.0;
		valorMaximoFinal = salarioBruto * valorMaximo;
		
		if(prestacoes < valorMaximoFinal) {
			System.out.println("Empr�stimo Aprovado!");
		} else {
			System.out.println("Empr�stimo n�o aprovado!");
		}
		
	
		
	}

}
