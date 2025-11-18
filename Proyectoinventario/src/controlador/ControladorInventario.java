/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.BaseDeDatos;
import modelo.Producto;
import vista.InventarioVista;

import java.util.List;

public class ControladorInventario {

    private final BaseDeDatos baseDatos;
    private InventarioVista vista;

    public ControladorInventario(BaseDeDatos baseDatos, InventarioVista vista) {
        this.baseDatos = baseDatos;
        this.vista = vista;
    }

    public ControladorInventario(BaseDeDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    Producto nuevo = vista.pedirDatosUsuario();
                    baseDatos.agregarProducto(nuevo);
                    vista.mostrarMensaje("Producto agregado correctamente.");
                    break;

                case 2:
                    String skuBuscar = vista.pedirSku();
                    Producto encontrado = baseDatos.buscarProductoSku(skuBuscar);
                    vista.mostrarProducto(encontrado);
                    break;

                case 3:
                    List<Producto> lista = baseDatos.buscarTodos();
                    vista.mostrarProductos(lista);
                    break;

                case 4:
                    String skuEliminar = vista.pedirSku();
                    boolean eliminado = baseDatos.eliminarProducto(skuEliminar);
                    if (eliminado)
                        vista.mostrarMensaje("Producto eliminado exitosamente.");
                    else
                        vista.mostrarMensaje("No se encontró el producto.");
                    break;

                case 5:
                    salir = true;
                    break;

                default:
                    vista.mostrarMensaje("Opción invalida.");
            }
        }
    }
}
