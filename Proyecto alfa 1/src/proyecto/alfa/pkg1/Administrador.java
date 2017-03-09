package proyecto.alfa.pkg1;

/**
 *
 * @author Diego
 */
public class Administrador {
    String nombreDeUsuario;
    String contraseña;
    public Administrador(String nombre, String contraseña){
        nombreDeUsuario = nombre;
        this.contraseña = contraseña;
    }
    static Administrador administrador = new Administrador("Administrador", "1234");
}
