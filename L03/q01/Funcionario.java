package q01;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ficar em branco");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
        if (salario <= 0) {
            throw new IllegalArgumentException("O salário do funcionário deve ser maior que zero. ");
        }
        this.salario = salario;
    }

    public double calcularIrpf() {
        double imposto = 0;
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario > 1903.98 && salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
        } else if (salario > 2826.66 && salario <= 3751.05) {
            imposto = (salario - 2826.66) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else if (salario > 3751.06 && salario <= 466.68) {
            imposto = (salario - 3751.06) * 2.25 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else {
            imposto = (salario - 3751.06) * 2.75 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        }
        return imposto;
    }

}
