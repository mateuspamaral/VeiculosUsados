package br.com.digitalhouse;

public class Veiculo {
    //Attributes
    private String marca;
    private String modelo;
    private Integer anoDeFabricacao;
    private String cor;
    private Integer quilometragem;

    //Constructors
    public Veiculo(String marca, String modelo, Integer anoDeFabricacao, String cor, Integer quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }

    //Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }
}
