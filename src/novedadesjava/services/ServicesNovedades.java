/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novedadesjava.services;

import java.util.Optional;
import novedadesjava.dto.Response;
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

}
