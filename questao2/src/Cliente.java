public class Cliente {
    public static void main(String[] args) {
        TarifaContext t = new TarifaContext(new RotativoStrategy());
         
        // tíquete
        Tiquete t1 = new Tiquete("101010", 60);

        //Valor conveniado
        double valor = t.executarStrategy(t1);
        System.out.println("Valor Conveniado: " + valor);

        // valor mensal
        t.setStrategy(new MensalistaStrategy());
        valor = t.executarStrategy(t1);
        System.out.println("Valor mensal: " + valor);

        // valor conveniado
        t.setStrategy(new ConveniadoStrategy());
        valor = t.executarStrategy(t1);
        System.out.println("Valor conveniado: " + valor);
    }
}
