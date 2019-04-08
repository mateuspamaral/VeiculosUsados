package br.com.digitalhouse;

public class Venda {
    private Double valorDaVenda;
    private Veiculo veiculo;
    private Cliente cliente;

    //Constructor
    public Venda(Double valorDaVenda, Veiculo veiculo, Cliente cliente) {
        this.valorDaVenda = valorDaVenda;
        this.veiculo = veiculo;
        this.cliente = cliente;
    }

    //Getters & Setters
    public Double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(Double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
