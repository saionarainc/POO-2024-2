package q01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        funcionario.setNome(tec.nextLine());
        System.out.println("Informe o valor do seu salário: ");
        funcionario.setSalario(tec.nextDouble());
        
        System.out.println("O imposto de IRPF a ser pago é R$" + funcionario.calcularIrpf());
    }
}
