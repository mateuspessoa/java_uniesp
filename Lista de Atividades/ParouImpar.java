package ListaAtividades;

import java.util.Scanner;

public class ParouImpar {
	
	static int i = 0;

	public static void main(String[] args) {
		
		while(i < 10) {
			
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite um número: ");
			int valorCreditos = leitor.nextInt();
			i++;
			
			if(valorCreditos % 2 == 0) {
				System.out.println("O número " + valorCreditos + " é par." );
			} else {
				System.out.println("O número " + valorCreditos + " é ímpar" );
			}
		}
		
	}

}
