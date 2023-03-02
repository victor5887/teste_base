import model.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carroVinicius = new Carro();
        Carro carroVictor = new Carro();

        carroVinicius.setMarca("Volvo");
        carroVinicius.setModelo("xc90");
        carroVinicius.setPotencia(200);
        carroVinicius.setPlaca("KMW3999");

        carroVictor.setMarca("Ferrari");
        carroVictor.setModelo("F10");
        carroVictor.setPotencia(400);
        carroVictor.setPlaca("VictorOCara");


        System.out.println(carroVinicius.toString());

        System.out.println(carroVictor.toString());
    }

}