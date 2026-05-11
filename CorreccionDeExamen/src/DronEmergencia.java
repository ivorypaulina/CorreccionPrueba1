public class DronEmergencia extends Dron {
    private double recargoUrgencia;
    private int nivelPrioridad;

    public DronEmergencia() {
        super();
        costoBase = 8.0;
        recargoUrgencia = 5.0;
    }


    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }


    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 1.0) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 10 &&
                getHorasVuelo() <= 3 &&
                nivelPrioridad >= 1 &&
                nivelPrioridad <= 3;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n===== DRON EMERGENCIA =====");
        super.mostrarInformacion();
        System.out.println("Nivel prioridad: " + nivelPrioridad);
    }
}