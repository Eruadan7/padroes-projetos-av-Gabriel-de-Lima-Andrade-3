public class teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Livro", 5);
        Compras c1 = new Compras(p1);

        // testando se Compras exibe alerta com quantidade < 5
        p1.setQuantidade(4);

        // removendo Compras
        p1.remover(c1);

        // testando se, após zerar o estoque e adicionar produtos, Vendas alerta de volta de estoque
        Vendas v1 = new Vendas(p1);
        p1.setQuantidade(0);
        p1.setQuantidade(1);
        p1.setQuantidade(0);
        p1.setQuantidade(1);
        
        // removendo Vendas

        p1.remover(v1);

        // testando Auditoria
        Auditoria a1 = new Auditoria(p1);
        p1.setQuantidade(0);
        p1.setQuantidade(6);
        p1.setQuantidade(10);

        // adicionando novamente Compras
        p1.inscrever(c1);
        p1.setQuantidade(1);
    }
}
