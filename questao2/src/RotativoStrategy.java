public class RotativoStrategy implements iStrategy {
    @Override
    public double calcularValor(Tiquete t) {
        int horas = t.getTempoPermanencia()/60;
        double valor = 10*horas;
        return valor;
    }
}
