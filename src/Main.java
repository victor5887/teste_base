import model.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carroVinicius = new Carro();

        carroVinicius.marca = "Volvo";
        carroVinicius.modelo = "xc90";
        carroVinicius.potencia = 200;
        carroVinicius.placa = "KMW3999";

        System.out.println(carroVinicius.toString());
    }
}