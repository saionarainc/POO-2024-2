package Q03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner tec = new Scanner(System.in);
        int contadorPessoa = 1;

        do {
            System.out.print("Qual sua altura " + contadorPessoa + ": ");
            p.altura = tec.nextDouble();

            System.out.print("Qual seu peso? "+ contadorPessoa + ": ");
            p.peso = tec.nextDouble();
            
            System.out.print("O IMC da pessoa " + contadorPessoa + " é: ");
            
            System.out.print("-------------------");
            contadorPessoa++;
        } while (contadorPessoa <= 3);

    }
}
