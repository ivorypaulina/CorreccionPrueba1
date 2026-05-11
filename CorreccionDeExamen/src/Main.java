import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Poliformismo
        Dron d1 = new DronLiviano();
        Dron d2 = new DronCarga();
        Dron d3 = new DronEmergencia();

        //Dron Liviano
        d1.setCodigo("DL01");
        d1.setModelo("MiniFly");
        d1.setDistanciaKm(10);
        d1.setPesoPaquete(3);
        d1.setHorasVuelo(1.5);

        //Dron carga
        d2.setCodigo("DC01");
        d2.setModelo("CargoMax");
        d2.setDistanciaKm(20);
        d2.setPesoPaquete(15);
        d2.setHorasVuelo(4);

        //Dron emergencia
        d3.setCodigo("DE01");
        d3.setModelo("RescuePro");
        d3.setDistanciaKm(8);
        d3.setPesoPaquete(5);
        d3.setHorasVuelo(2);

        ((DronEmergencia) d3).setNivelPrioridad(2);

        System.out.println("\n========== INFORMACIÓN INICIAL ==========");
        d1.mostrarInformacion();
        d2.mostrarInformacion();
        d3.mostrarInformacion();

        System.out.println("\n========== NUEVOS DATOS ==========");
        System.out.print("Ingrese nuevo código para Dron Liviano: ");
        d1.setCodigo(sc.nextLine());

        System.out.print("Ingrese nueva distancia: ");
        d1.setDistanciaKm(sc.nextDouble());

        System.out.print("Ingrese nuevo peso: ");
        d1.setPesoPaquete(sc.nextDouble());

        System.out.print("Ingrese nuevas horas de vuelo: ");
        d1.setHorasVuelo(sc.nextDouble());

        System.out.println("\n========== VALIDACIONES ==========");
        System.out.println("Dron Liviano válido: " + d1.validarDatos());
        System.out.println("Dron Carga válido: " + d2.validarDatos());
        System.out.println("Dron Emergencia válido: " + d3.validarDatos());


        System.out.println("\n========== POLIMORFISMO ==========");
        Dron[] drones = {d1, d2, d3};

        for (Dron dron : drones) {
            dron.mostrarInformacion();
        }

        sc.close();
    }
}