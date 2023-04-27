/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novedadesjava.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import novedadesjava.dto.Response;
import novedadesjava.interfaces.ICalculoSueldo;
import novedadesjava.interfaces.IServicesNovedades;
import repository.RepositoryNovedades;

/**
 *
 * @author kgalarza
 */
public class ServicesNovedades implements IServicesNovedades {

    RepositoryNovedades repo;

    public ServicesNovedades() {
        repo = new RepositoryNovedades();
    }

    @Override
    public String getRepoData() {
        Optional<Response> respuesta = repo.getDataRepoData();
        Response response = null;
        String json;
        if (respuesta.isPresent()) {
            response = respuesta.get();
            System.out.println("respuesta " + response);
            json = "ok";
        } else {
            json = "error";
            //manejo cuando no existe
            System.out.println("Null manejado");
        }
        return json;
    }

    @Override
    public String getRepoNoData() {
        Optional<Response> respuesta = repo.getDataRepoNoData();
        Response response = null;
        String json;
        if (respuesta.isPresent()) {
            response = respuesta.get();
            System.out.println("respuesta " + response);
            json = "ok";
        } else {
            json = "error";
            //manejo cuando no existe
            System.out.println("Null manejado");
        }
        return json;
    }

    //no forma parte de java 8
    @Deprecated
    public void getDemoProgramacionReactiva() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> flujoNumeros = Stream.of(numeros.toArray(new Integer[0]));
        Stream<Integer> flujoPares = flujoNumeros.filter(numero -> numero % 2 == 0);
        int[] numerosParesMultiplicados = flujoPares.mapToInt(numero -> numero * 2).toArray();

        //metodo de referencia
        Arrays.stream(numerosParesMultiplicados).forEach(System.out::println);
    }

    ICalculoSueldo operacion = (sueldo, desceunto) -> (sueldo - desceunto);

    public double calcular(double a, double b) {
        return operacion.calcular(a, b);
    }
}
