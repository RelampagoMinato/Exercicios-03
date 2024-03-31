package Dominio;
public class Loja {
  
        private double valorCompra;
        private double valorPrestacao;
      public Loja(double valorCompra) {
            this.valorCompra = valorCompra;
            this.valorPrestacao = calcularValorPrestacao();
        }
    
        private double calcularValorPrestacao() {
            return valorCompra / 5; 
        }
        public void exibirPrestacoes() {
            System.out.println("A Loja Mamão com Açúcar está vendendo seus produtos em 5 prestações sem juros.");
            System.out.println("Valor de cada prestação: R$" + valorPrestacao);
        }
    }

