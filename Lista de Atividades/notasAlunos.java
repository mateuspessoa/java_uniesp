package ListaAtividades;

import java.util.Scanner;

public class notasAlunos {

static int i;
static double nota1;
static double nota2;
static double nota3;
static double media;

	public static void main(String[] args) {
		
		for(i = 0; i < 2; i++) {
			
			Scanner leitor = new Scanner(System.in);
			System.out.println("Informe a primeira nota: ");
			nota1 = leitor.nextDouble();
			
			System.out.println("Informe a segunda nota: ");
			nota2 = leitor.nextDouble();
			
			System.out.println("Informe a terceira nota: ");
			nota3 = leitor.nextDouble();
			
			media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("");
			System.out.format("%.2f", media);
			System.out.println("");
			
			if(media < 3) {
				System.out.println("Reprovado!");
			}else if (media < 7) {
				System.out.println("Exame Final");
			}else {
				System.out.println("Aprovado!");
			}
			
			System.out.println("");
			System.out.println("");
		}
		
	}

}
