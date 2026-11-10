public class Tiquete {
    private String placa;
    private int tempoPermanenciaMinutos;
    
    public Tiquete(String placa, int tempoPermanencia) {
        this.placa = placa;
        this.tempoPermanenciaMinutos = tempoPermanencia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoPermanencia() {
        return tempoPermanenciaMinutos;
    } 
}
