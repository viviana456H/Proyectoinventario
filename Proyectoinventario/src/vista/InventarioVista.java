/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;



import java.util.List;
import java.util.Scanner;
import modelo.Producto;

public class InventarioVista {

    private final Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n==== MENU DE INVENTARIO ====");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto por SKU");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");

        return sc.nextInt();
    }

    public Producto pedirDatosUsuario() {
        System.out.print("Nombre del producto: ");
        sc.nextLine();
        String nombre = sc.nextLine();

        System.out.print("SKU: ");
        String sku = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        return new Producto(nombre, sku, cantidad, precio);
    }

    public String pedirSku() {
        System.out.print("Ingrese el SKU: ");
        sc.nextLine();
        return sc.nextLine();
    }

    public void mostrarProducto(Producto p) {
        if (p == null) {
            System.out.println("Producto no encontrado.");
        } else {
            System.out.println(p);
        }
    }

    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
