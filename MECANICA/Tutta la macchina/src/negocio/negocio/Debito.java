package negocio;
public class Debito extends MedioDePago {
    private String numeroTarjeta;
    private String vencimiento;
    private String cvvv;

    public Debito(double monto, String numeroTarjeta, String vencimiento,String cvvv) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
        this.cvvv=cvvv;
    }
    public String getCvv() {
        return cvvv;
    }

    public void setCvv(String cvv) {
        this.cvvv = cvv;
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
