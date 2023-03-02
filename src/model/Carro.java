package model;

public class Carro {

    private String modelo;
    private String marca;
    private Integer potencia;
    private String placa;
    private Integer velocidade;

    public String getModelo() {
        return modelo.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getVelocidade() {
        return velocidade;

    }

    public void setIncrementoVelocidade(Integer incrementoVelocidade) {
        int velocidadeMaxima = 250;
        int velocidadeAtual = this.velocidade;

        if (velocidadeAtual > 0) {
            if ((velocidadeAtual + incrementoVelocidade) < velocidadeMaxima ) {
                velocidade = velocidadeAtual + incrementoVelocidade;
            } else {
                velocidade = velocidadeMaxima;
            }
        } else {
            velocidade = 1;
        }

    }

    public String toString () {
        String retorno = "modelo: " + this.getModelo();
        retorno += "\n marca: " + this.getMarca();
        retorno += "\n potencia: " + potencia.toString() + "cv";
        retorno += "\n placa: " + placa;

        return retorno;
    }



}
