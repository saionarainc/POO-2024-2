package q02;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner tec = new Scanner(System.in);
        int i = 0;
        
        do {
            Funcionario funcionario = new Funcionario();
            System.out.println("Informe seu nome: ");
            funcionario.setNome(tec.nextLine());
            System.out.println("Informe o valor do seu salário: ");
            funcionario.setSalario(tec.nextDouble());
            tec.nextLine();

            funcionarios[i] = funcionario;
            i++;
        } while (i < 5);

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", salário de R$" + f.getSalario() + " e contribuição de R$" + f.calcularIrpf() + " anuais.");
        } 
    }
}
