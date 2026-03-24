package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaCorrente;

public class bancoProjeto {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        int opcao;

        do {
            System.out.println("=== BANCO JAVA ===");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
                    break;

                case 2:
                    System.out.print("Valor para depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;

                case 4:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 4);

        sc.close();
    }
}