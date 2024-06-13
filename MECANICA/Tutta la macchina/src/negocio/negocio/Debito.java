package negocio;

public class Debito extends MedioDePago {

    public Debito(double monto) {
        super(monto);
    }

    @Override
    public double calcularMontoFinal() {
        // No hay recargo ni descuento para débito
        return getMonto();
    }
}
