/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import modelo.BaseDeDatos;
import vista.InventarioVista;
import controlador.ControladorInventario;

public class App {
    public static void main(String[] args) {
        BaseDeDatos base = new BaseDeDatos();
        InventarioVista vista = new InventarioVista();
        ControladorInventario controlador = new ControladorInventario(base, vista);
        controlador.iniciar();
    }
}

