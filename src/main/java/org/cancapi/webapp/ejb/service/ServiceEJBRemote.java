package org.cancapi.webapp.ejb.service;

import jakarta.ejb.Remote;
import org.cancapi.webapp.ejb.models.Producto;

import java.util.List;

@Remote
public interface ServiceEJBRemote {
    String saludar(String nombre);
    List<Producto> listar();

    Producto crear(Producto producto);

}
