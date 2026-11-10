public class ConveniadoStrategy implements iStrategy {
    @Override
    public double calcularValor(Tiquete t) {
        int minutos = t.getTempoPermanencia() - 30;
        if (minutos <= 0) {
            return 0.0;
        }
        int horas = (int) Math.ceil(minutos / 60.0);
        double valor = 10.0 * horas;
        return valor * (1 - 0.05);
    }
}
