package br.com.digitalhouse;

public class Exercicio5 {
    public static void main(String[] args) {
        Veiculo carroTop = new Veiculo("Nissan", "GTR", 2019, "Cinza", 0);
        Cliente mateus = new Cliente("Mateus", "Amaral", "(31) 98704-9498");

        Concessionaria venda1 = new Concessionaria();
        venda1.registrarVenda(400000.00,carroTop,mateus);
    }
}
