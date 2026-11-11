import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Bebida bebida;
    private List<String> complementos = new ArrayList<>();
    private CalculoPedidoStrategy strategy = new CalculoSimplesStrategy(); // Padrão

    public Pedido(Bebida bebida) {
        this.bebida = bebida;
    }

    public void addComplemento(String complemento) {
        this.complementos.add(complemento); // Permite repetição (RQ3.5)
    }

    public void setStrategy(CalculoPedidoStrategy strategy) {
        this.strategy = strategy;
    }

    public double getTotal() {
        return strategy.calcularTotal(bebida, complementos);
    }

    public String getDescricao() {
        return strategy.gerarDescricao(bebida, complementos);
    }
}
