package Q02;

public class Pessoa {
    public double peso;
    public double altura;
    
    public double calcularImc() {
        return peso /(altura* altura);
    }
}
