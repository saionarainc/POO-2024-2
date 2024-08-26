package Q02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String conta1, conta2, titular1, titular2;
        
        ContaBancaria c1 = new ContaBancaria();
        System.out.println("Informe o número da conta 1: ");
        c1.setNumero(tec.nextLine());
        System.out.println("Informe o titular da conta 1: ");
        c1.setTitular(tec.nextLine());
        
        ContaBancaria c2 = new ContaBancaria();
        System.out.println("Informe o número da conta 2: ");
        c2.setNumero(tec.nextLine());
        System.out.println("Informe o titular da conta 2: ");
        c2.setTitular(tec.nextLine());
        
        c1.depositar(1000);
        c1.depositar(700);
        
        c2.depositar(5000);
        c2.sacar(3000);
        c2.transferir(c1, 1800);
        
        System.out.println(c1.getTitular() + "possui em seu saldo R$" + c1.getSaldo() + " e " + c2.getTitular() + " possui " + c2.getSaldo() + " de saldo.");
        
    }
}
