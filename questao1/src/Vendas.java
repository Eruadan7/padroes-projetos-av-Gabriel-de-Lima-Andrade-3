public class Vendas extends AbsObservador {
    private boolean zero = false;

    public Vendas(AbsObservado Observado) {
        this.observado = Observado;
        this.observado.inscrever(this);
    }

    @Override
    public void update() {
        int quantidade = ((Produto) this.observado).getQuantidade();
        if (zero && quantidade > 0) {
            System.out.println("O produto voltou a ter estoque");
            zero = false;
        }
        if (quantidade == 0) {
            zero = true;
        }
    }
    
}
