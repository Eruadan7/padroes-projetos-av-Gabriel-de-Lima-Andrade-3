public class Cafeteria {
    public static void main(String[] args) {
        // Pedido 1: Espresso puro
        Pedido p1 = new Pedido(new Espresso());
        
        // Pedido 2: Chá com Leite e Chantilly
        Pedido p2 = new Pedido(new Cha());
        p2.addComplemento("Leite");
        p2.addComplemento("Chantilly");

        // Pedido 3: Espresso com Leite, Leite (repetido) e Calda
        Pedido p3 = new Pedido(new Espresso());
        p3.addComplemento("Leite");
        p3.addComplemento("Leite");
        p3.addComplemento("Calda");

        imprimir("Pedido 1", p1);
        imprimir("Pedido 2", p2);
        imprimir("Pedido 3", p3);
    }

    public static void imprimir(String nome, Pedido p) {
        System.out.println(nome);
        System.out.println("Descrição: " + p.getDescricao());
        System.out.println("Preço Total: R$ " + String.format("%.2f", p.getTotal()));
    }
}
