package org.cancapi.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import org.cancapi.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;

@Stateful
public class ServiceEJB implements ServiceEJBRemote {

    private int contador;

    public String saludar(String nombre){
        System.out.println("imprimiendo dentro del ejb con instancia: " + this);
        contador++;
        System.out.println("valor del contador del metodo saludar: "+ contador);
        return "Hola que tal "+nombre;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("peras"));
        productos.add(new Producto("manzanas"));
        productos.add(new Producto("naranjas"));
        productos.add(new Producto("platanos"));
        productos.add(new Producto("frutillas"));
        return productos;
    }

    @Override
    public Producto crear(Producto producto) {
        System.out.println("guardando producto.... "+producto);
        Producto p = new Producto();
        p.setNombre(producto.getNombre());
        return p;
    }
}
