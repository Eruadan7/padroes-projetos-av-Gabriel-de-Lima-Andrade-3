import java.util.List;

public class CalculoSimplesStrategy implements CalculoPedidoStrategy {
    @Override
    public double calcularTotal(Bebida bebida, List<String> complementos) {
        double total = bebida.getPreco();
        for (String c : complementos) {
            if (c.equalsIgnoreCase("Leite")) total += 1.50;
            else if (c.equalsIgnoreCase("Chantilly")) total += 2.00;
            else if (c.equalsIgnoreCase("Calda")) total += 1.00;
        }
        return total;
    }

    @Override
    public String gerarDescricao(Bebida bebida, List<String> complementos) {
        String desc = bebida.getDescricao();
        for (String c : complementos) {
            desc += ", com " + c;
        }
        return desc;
    }
}
