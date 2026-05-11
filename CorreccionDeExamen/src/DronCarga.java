public class DronCarga extends Dron {
    private double costoPorKg;

    public DronCarga() {
        super();
        costoBase = 6.0;
        costoPorKg = 1.20;
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase +
                (getDistanciaKm() * 0.70) +
                (getPesoPaquete() * costoPorKg);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 30 &&
                getHorasVuelo() <= 5;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON CARGA =====");
        super.mostrarInformacion();
    }
}