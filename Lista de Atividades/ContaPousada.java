package ListaAtividades;

import java.util.Scanner;
public class ContaPousada {
    public static void main(String[] args) {
        double valorDiaria = 40, taxaServicoMaisDias = 8, taxaServicoMenosDias = 15, totalConta = 0, dias = 0,
                valorArrecado = 0, clientes = 0;
        String nome;

        while (clientes <= 2){
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            nome = leitor.nextLine();
            System.out.println("Digite quantos dias você deseja ficar: ");
            dias = leitor.nextInt();
            clientes++;

            if (dias <= 9){
                totalConta = valorDiaria + (taxaServicoMenosDias * dias) * dias ;
                System.out.println("Olá, " + nome);
                System.out.println("Sua conta foi: " + totalConta);
            } else {
                totalConta = valorDiaria + (taxaServicoMaisDias * dias) * dias;
                System.out.println("Olá, " + nome);
                System.out.println("Sua conta foi: " + totalConta);
            }
            valorArrecado = totalConta + valorArrecado;
        }
        System.out.println("O valor arrecado pela pousada foi: " + valorArrecado);
    }
}