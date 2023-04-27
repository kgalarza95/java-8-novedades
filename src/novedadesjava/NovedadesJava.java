package novedadesjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import novedadesjava.interfaces.IDefaultMetodo;
import novedadesjava.services.ServicesApiFecha;
import novedadesjava.services.ServicesNovedades;

/**
 *
 * @author kgalarza
 */
public class NovedadesJava {

    public static void main(String[] args) {

//        List<String> lista = new ArrayList<>();
//        lista.add("");
//        lista.stream()
        System.out.println("Api de fecha");
        ServicesApiFecha apiFecha = new ServicesApiFecha();
        System.out.println(apiFecha.getFechaActual());
        System.out.println(apiFecha.getDiaSemanaActual());

        System.out.println("Manejo con optional");
        ServicesNovedades serviceNo = new ServicesNovedades();
        System.out.println("resp data " + serviceNo.getRepoData());
        System.out.println("resp no data" + serviceNo.getRepoNoData());
        System.out.println("==================================================");
        System.out.println("motor de js:");
        serviceNo.useNashorn();
        System.out.println("==================================================");
        serviceNo.getDemoProgramacionReactiva();
        System.out.println("==================================================");
        System.out.println("Interfaz funcional " + serviceNo.calcular(550, 15));
        serviceNo.getUseStream();

        IDefaultMetodo service = new ServicesNovedades();
        service.defResultado("S", 10, 15);
        service.defResultado("R", 20, 15);

        // Crear un CompletableFuture para ejecutar longRunningOperation()
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> longRunningOperation());

        // Continuar haciendo otras tareas mientras esperamos el resultado de longRunningOperation()
        System.out.println("Continuando con otras tareas...");

        // Obtener el resultado de longRunningOperation() cuando esté listo
        try {
            String resultado = future.get();
            System.out.println("El resultado es: " + resultado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Una función que tarda un tiempo considerable para ejecutarse
    public static String longRunningOperation() {
        try {
            // Simular una operación que toma tiempo
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Operación terminada";
    }
}
