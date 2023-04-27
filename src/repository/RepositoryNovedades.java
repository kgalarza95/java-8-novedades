/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.Optional;
import novedadesjava.dto.Response;

/**
 *
 * @author kgalarza
 */
public class RepositoryNovedades {

    public Optional<Response> getDataRepoData() {
        Response Rrsponse = new Response();
        return Optional.ofNullable(Rrsponse);
    }

    public Optional<Response> getDataRepoNoData() {
        Response RrsponseNull = null;
        return Optional.ofNullable(RrsponseNull);
    }
}
