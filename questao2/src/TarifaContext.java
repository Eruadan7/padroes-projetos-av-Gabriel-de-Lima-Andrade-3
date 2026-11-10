public class TarifaContext {
    // atributo para manter a estratégia
    iStrategy strategy;

    // construtor com dependência da estratégia
    public TarifaContext(iStrategy strategy) {
        this.strategy = strategy;
    }

    // método para substituir a estratégia
    public  void setStrategy(iStrategy strategy) {
        this.strategy = strategy;
    }

    // método para invocar a execução da estratégia
    public double executarStrategy(Tiquete t) {
        return this.strategy.calcularValor(t);
    }
}
