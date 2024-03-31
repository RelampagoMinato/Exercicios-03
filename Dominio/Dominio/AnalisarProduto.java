package Dominio;
public class AnalisarProduto {
    private Produto2[] produtos;

    public AnalisarProduto(Produto2[] produtos) {
        this.produtos = produtos;
    }

    public void processar() {
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (Produto2 produto : produtos) {
            somaPrecoCusto += produto.getPrecoCusto();
            somaPrecoVenda += produto.getPrecoVenda();

            String resultado = produto.calcularResultado();
            System.out.println("Resultado: " + resultado);
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos.length;
        double mediaPrecoVenda = somaPrecoVenda / produtos.length;

        System.out.println("Média de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);
    }
}
