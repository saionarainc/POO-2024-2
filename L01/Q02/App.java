package Q02;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Qual sua altura? ");
        double altura = tec.nextDouble();
        
        System.out.print("Qual seu peso? ");
        double peso = tec.nextDouble();
        
        Pessoa pessoa;
        pessoa = new Pessoa();
        
        pessoa.altura = altura;
        pessoa.peso = peso;
        System.out.print("O IMC da pessoa é:  " + pessoa.calcularImc());
        
        tec.close();
    }
}
