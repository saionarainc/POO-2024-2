package Q01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        Scanner tec = new Scanner(System.in);
        int contadorPessoa = 1;

        do {
            Pessoa p = new Pessoa(); // Instanciar o objeto Pessoa
            System.out.print("Informe seu nome: ");
            p.setNome(tec.nextLine());
            System.out.print("Qual sua altura " + contadorPessoa + ": ");
            p.setAltura(tec.nextDouble());
            tec.nextLine(); // Consumir a nova linha

            System.out.print("Qual seu peso? " + contadorPessoa + ": ");
            p.setPeso(tec.nextDouble());
            tec.nextLine(); // Consumir a nova linha

            System.out.println("O IMC da pessoa " + contadorPessoa + " é: " + p.calcularImc());
            pessoas[contadorPessoa - 1] = p;
            contadorPessoa++;
        } while (contadorPessoa <= 3);

        for (int i = 2; i >= 0; i--) {
            Pessoa p = pessoas[i];
            System.out.println("O nome da pessoa " + (i + 1) + " é " + p.getNome() + ", sua altura é " + p.getAltura() + " e seu peso é " + p.getPeso() + ". Logo, seu IMC é " + p.calcularImc());
        }
        tec.close();
    }
}