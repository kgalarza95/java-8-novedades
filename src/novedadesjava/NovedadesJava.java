package novedadesjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    }

}
