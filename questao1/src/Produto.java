public class Produto extends AbsObservado {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    } 

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.notificarTodos();
    }

    @Override
    public void inscrever(AbsObservador observador) {
        this.listaObservadores.add(observador);
    }

    @Override
    public void remover(AbsObservador observador) {
        this.listaObservadores.remove(observador);
    }

    private void notificarTodos(){
        for (AbsObservador observador: this.listaObservadores){
            observador.update();
        }
    }

    
    
}
