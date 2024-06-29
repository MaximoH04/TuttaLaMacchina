package negocio;

public class Credito extends MedioDePago {
    private int cuotas;
    private String numeroTarjeta;
    private String vencimiento;
    private String cvv;

    public Credito(double monto, int cuotas, String numeroTarjeta, String vencimiento, String cvv) {
        super(monto);
        this.cuotas = cuotas;
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
        this.cvv = cvv;
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

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public double getMonto() {
        return calcularMontoFinal();
    }

    @Override
    public double calcularMontoFinal() {
        double recargo = 0;
        switch (cuotas) {
            case 2:
                recargo = 0.06;
                break;
            case 3:
                recargo = 0.12;
                break;
            case 6:
                recargo = 0.20;
                break;
            default:
                throw new IllegalArgumentException("Número de cuotas no válido");
        }
        return super.getMonto() * (1 + recargo);
    }
}

