package negocio;
public class Debito extends MedioDePago {
    private String numeroTarjeta;
    private String vencimiento;

    public Debito(double monto, String numeroTarjeta, String vencimiento) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    @Override
    public double calcularMontoFinal() {
        // No hay recargo ni descuento para débito
        return getMonto();
    }
}
