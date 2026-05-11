public class DronLiviano extends Dron {
    private double limiteHoras;

    public DronLiviano() {
        super();
        costoBase = 3.0;
        limiteHoras = 2;
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.50);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 5 &&
                getHorasVuelo() <= 2;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON LIVIANO =====");
        super.mostrarInformacion();
    }
}