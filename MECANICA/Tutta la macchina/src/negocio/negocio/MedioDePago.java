package negocio;
public abstract class MedioDePago {
    protected double monto;

    public MedioDePago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public abstract double calcularMontoFinal();
}
