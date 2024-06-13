package negocio;

public class Credito extends MedioDePago {
    private int cuotas;

    public Credito(double monto, int cuotas) {
        super(monto);
        this.cuotas = cuotas;
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

