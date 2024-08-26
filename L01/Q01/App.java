package Q01;

public class App {
    public static void main(String[] args) {

    Pessoa p1 = new Pessoa();
    
    p1.altura = 1.75;
    p1.peso = 78;
    
    System.out.println("O IMC da pessoa é: " + p1.calcularImc());
    }
  }
