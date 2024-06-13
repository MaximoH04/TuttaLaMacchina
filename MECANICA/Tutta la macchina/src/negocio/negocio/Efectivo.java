package negocio;

public class Efectivo extends MedioDePago {

    public Efectivo(double monto) {
        super(monto);
    }

    @Override
    public double calcularMontoFinal() {
        // Descuento del 10% para pago en efectivo
        return getMonto() * 0.90;
    }
}
    

