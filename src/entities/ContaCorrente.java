package entities;

public class ContaCorrente {

    private double saldo;

    // Construtor
    public ContaCorrente() {
        this.saldo = 2000.00;
    }

    // Ver saldo
    public double getSaldo() {
        return saldo;
    }

    // Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}