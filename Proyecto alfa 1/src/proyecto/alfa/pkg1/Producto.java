package proyecto.alfa.pkg1;

/**
 *
 * @author Diego
 */
public class Producto {
    String nombreDeProducto;
    double precio;
    int cantidad;
    int cuentas[];
    public Producto(String nombre, double precio, int cantidad){
        nombreDeProducto = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    static Producto memoriaRAM2Gb = new Producto("Memoria RAM 2Gb", 140.00, 10);
    static Producto[] listaDeProductos = {memoriaRAM2Gb};
}
