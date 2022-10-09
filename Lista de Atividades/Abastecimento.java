package ListaAtividades;

import java.util.Scanner;

public class Abastecimento {

static int valorRefrigerante = 6;
static double litroGasolina = 2.50;
static double totalGasolina;
static double total;

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe quantos litros você abasteceu? ");
		double litrosAbastecidos = leitor.nextInt();
		
		totalGasolina = litrosAbastecidos * litroGasolina;
		
		total = totalGasolina + valorRefrigerante;
		
		System.out.println("Sua conta final é de R$ " + total);

	}

}
