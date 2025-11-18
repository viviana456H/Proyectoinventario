/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private final List<Producto> Productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        Productos.add(p);
    }

    public Producto buscarProductoSku(String sku) {
        for (Producto p : Productos) {
            if (p.getSku().equalsIgnoreCase(sku)) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> buscarTodos() {
        return Productos;
    }

    public boolean eliminarProducto(String sku) {
        Producto p = buscarProductoSku(sku);
        if (p != null) {
            Productos.remove(p);
            return true;
        }
        return false;
    }

    public List<Producto> getProductos() {
        return Productos;
    }
}