package br.com.digitalhouse;

public class Concessionaria {
    //Class methods
    public void registrarVenda(Double valor, Veiculo veiculo, Cliente cliente) {
        Venda venda = new Venda(valor, veiculo, cliente);
        System.out.println(cliente.getNome() + " " + cliente.getSobrenome() + " você acabou de comprar um " + veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getAnoDeFabricacao() + " " + veiculo.getQuilometragem() + "Km\nParabéns!!!!");
    }
}
