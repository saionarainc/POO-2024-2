package Q02;

public class ContaBancaria {

    private String numero, titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
           if (valor <= 0) {
               throw new IllegalArgumentException("O valor a ser depositado não pode ser nulo ou negativo.");               
           }
           this.saldo += valor;
    }

    public void sacar(double valor) {
           if (saldo < valor ) {
               throw new IllegalArgumentException("Saldo insuficiente.");
           } else {
               if (valor < 0) {
                   throw new IllegalArgumentException("O valor a ser sacado não pode ser nulo ou negativo.");
               }
           }
           this.saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
            if (contaDestino == null) {
                throw new IllegalArgumentException("Conta não existe.");
            }
            this.sacar(valor);
            contaDestino.depositar(valor);
    }
}
