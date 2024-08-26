package Q04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        Pessoa p;
        Scanner tec = new Scanner(System.in);
        int contadorPessoa = 1;

        do {
            p = new Pessoa(); //!!instanciar 3x o obj pessoa para criar e armazenar 3 vezes os valores
            System.out.print("Informe seu nome: ");
            p.nome = tec.nextLine();
            System.out.print("Qual sua altura " + contadorPessoa + ": ");
            p.altura = tec.nextDouble();

            System.out.print("Qual seu peso? "+ contadorPessoa + ": ");
            p.peso = tec.nextDouble();
            
            System.out.print("O IMC da pessoa " + contadorPessoa + " é: ");
            
            System.out.print("-------------------");
            pessoas[contadorPessoa-1] = p;
            contadorPessoa++;
        } while (contadorPessoa <= 3);
        
        for (int i=2; i >= 0; i--) {
            p = pessoas[i];
            System.out.print("O nome da pessoa " + (i+1) + " é " + p.nome + " seu peso é " + p.altura + " e seu peso" + p.peso + ". Logo, seu IMC é " 
                    + p.calcularImc());
        }
        tec.close();
    }
}
