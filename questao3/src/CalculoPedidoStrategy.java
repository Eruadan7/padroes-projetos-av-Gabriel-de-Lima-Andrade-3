import java.util.List;

public interface CalculoPedidoStrategy {
    double calcularTotal(Bebida bebida, List<String> complementos);
    String gerarDescricao(Bebida bebida, List<String> complementos);
}
