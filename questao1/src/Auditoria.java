public class Auditoria extends AbsObservador {
    public Auditoria(AbsObservado Observado) {
        this.observado = Observado;
        this.observado.inscrever(this);
    }

    @Override
    public void update() {
        System.out.println("Alteração detectada. Nome do produto: "+
            ((Produto) this.observado).getNome() + " Quantidade: " +
            ((Produto) this.observado).getQuantidade()
        );
    }   
}
