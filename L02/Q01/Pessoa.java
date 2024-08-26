package Q01;

public class Pessoa {
    private double peso;
    private double altura;
    private String nome;
    
    
    public void setPeso(double p) {
        this.peso = p;
    }
    
    public double getPeso () {
        return peso;
    }
    
    public void setAltura(double a) {
        this.altura = a;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return nome;
    }
    
    public double calcularImc() {
        return getPeso() /(getAltura() * getAltura());
    }
}
