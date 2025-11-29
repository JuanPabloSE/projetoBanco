import java.util.Locale;
import java.util.Scanner;

public class bancoProjeto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS DO SISTEMA (SALDO, LIMITE DE EMPRÉSTIMO)
        double saldo = 2000.00;
        double limite, valorTotalJuros, valorParcelas;
        int opcao;
        char resposta;

        // OPÇÃO DESEJADA
        do {
        System.out.println("=== BANCO JAVA ===");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Solicitar Empréstimo");
        System.out.println("5 - Sair");
        System.out.println(); // QUEBRA DE LINHA
        System.out.print("Escolha uma das opções: ");
        opcao = sc.nextInt();
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

            // SOLICITAR EMPRÉSTIMO
            case 4:
                System.out.print("Qual o valor desejado para empréstimo: ");
                double emprestimo = sc.nextDouble();
                System.out.print("Quantidade de parcelas desejada: ");
                int parcelas = sc.nextInt();
                System.out.println();                                                  // QUEBRA DE LINHA
                if (saldo >= 1000.00) {                                                // Se o saldo atual for maior que R$ 1.000, ele pode pegar até 3x o saldo.
                    limite = saldo * 3;
                }
                else {                                                                 // Se o saldo for menor, pode pegar até 2x o saldo.
                    limite = saldo * 2;
                }
                if (emprestimo <= limite) {
                    int juros = 10;                                                    // 10% DE JUROS.
                    valorTotalJuros = emprestimo + ((emprestimo * juros) / 100);       // Calcula o valor total com juros.
                    valorParcelas = valorTotalJuros / parcelas;                        // Divide pelo número de parcelas e mostra o valor de cada uma.
                    saldo +=emprestimo;                                                // Acrescenta o valor do empréstimo ao saldo.
                    System.out.println("___________________________________________________________________");
                    System.out.println("PARABÉNS, SEU EMPRÉSTIMO FOI APROVADO COM SUCESSO EM NOSSO BANCO!");
                    System.out.println("___________________________________________________________________");
                    System.out.printf("Valor do empréstimo: R$ %.2f\n", emprestimo);
                    System.out.printf("Número de parcelas do emprestimo: %d\n", parcelas);
                    System.out.printf("Juros do empréstimo: %d%%\n", juros);
                    System.out.printf("Valor total do empréstimo com Juros: R$ %.2f\n", valorTotalJuros);
                    System.out.printf("Valor das parcelas: R$ %.2f\n",valorParcelas);
                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
                }
                else {
                    System.out.println("EMPRÉSTIMO NEGADO - LIMITE PARA EMPRÉSTIMO INSUFICIENTE");
                }

                break;

            // SAÍDA DO SISTEMA
            case 5:
                System.out.println("SAINDO DO SISTEMA, VOLTE SEMPRE !");
                break;

            // OPÇÃO INVÁLIDA DE ENTRADA
            default:
                System.out.println("Opção inválida");
                break;

        }
            System.out.println(); // QUEBRA DE LINHA

            // PERGUNTA DE CONTINUAÇÃO DE UTILIZAÇÃO DO SISTEMA.

            if (opcao == 5){
                break;
            }

            else {
            System.out.print("Deseja continuar utilizando o sistema (s/n)? ");
            resposta = sc.next().charAt(0);
            System.out.println(); // QUEBRA DE LINHA
            if (resposta == 'n'){
                System.out.println("SISTEMA ENCERRADO, VOLTE SEMPRE !");
            }

            }} while (resposta != 'n');

        sc.close();
    }
}
