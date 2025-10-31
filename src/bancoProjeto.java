import java.util.Locale;
import java.util.Scanner;

public class bancoProjeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // SALDO
        double saldo = 2000.00;

        // OPÇÃO DESEJADA
        System.out.println("=== BANCO JAVA ===");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
        System.out.println(); // QUEBRA DE LINHA
        System.out.printf("Escolha uma das opções: ");
        int opcao = sc.nextInt();
        System.out.println(); // QUEBRA DE LINHA

        // Switch Case - Opções
        switch (opcao) {
            // SALDO BANCÁRIO
            case 1:
                System.out.printf("Saldo atual: R$ %.2f\n ", saldo);
                break;

            // DEPOSITO BANCÁRIO
            case 2:
                System.out.print("Qual valor você deseja de depositar: ");
                double valor = sc.nextDouble();
                if (valor > 0.0) {
                    saldo += valor;
                    System.out.println(); // QUEBRA DE LINHA
                    System.out.println("Deposito realizado com sucesso");
                    System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);
                } else {
                    System.out.println("Valor para deposito inválido");
                }
                break;

            // SAQUE BANCÁRIO
            case 3:
                System.out.print("Qual valor você deseja sacar: ");
                double saque = sc.nextDouble();
                System.out.println(); // QUEBRA DE LINHA
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso");
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                }
                break;

            // SAÍDA DO SISTEMA
            case 4:
                System.out.println("Saindo do sistema");
                break;

            // OPÇÃO INVÁLIDA DE ENTRADA
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println(); // QUEBRA DE LINHA

        sc.close();
    }
}
