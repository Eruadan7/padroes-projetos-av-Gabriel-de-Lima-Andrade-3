public class Compras extends AbsObservador {
    public Compras(AbsObservado Observado) {
        this.observado = Observado;
        this.observado.inscrever(this);
    }

    @Override
    public void update() {
        int quantidade = ((Produto) this.observado).getQuantidade();
        if (quantidade < 5) {
            System.out.println("O estoque está abaixo de 5");
        }
    } 
}
