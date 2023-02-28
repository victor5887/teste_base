package model;

public class Carro {

    public String modelo;
    public String marca;
    public Integer potencia;
    public String placa;


    public String toString () {
        String retorno = "modelo: " + modelo;
        retorno += "\n marca: " + marca;
        retorno += "\n potencia: " + potencia.toString() + "cv";
        retorno += "\n placa: " + placa;

        return retorno;
    }


}
