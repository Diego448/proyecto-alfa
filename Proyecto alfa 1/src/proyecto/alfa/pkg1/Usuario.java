package proyecto.alfa.pkg1;

/**
 *
 * @author Diego
 */
public class Usuario {
    String nombreDeUsuario;
    String nombre;
    String apellido;
    int edad;
    String contraseña;
    int cuentas[] = new int[2];
    boolean estadoDeCuenta;
    public Usuario(){
    }
    public Usuario(String nombreDeUsuario, String nombre, String apellido, int edad, String contraseña, int[] cuentas, boolean estado){
        this.nombreDeUsuario = nombreDeUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.contraseña = contraseña;
        this.cuentas = cuentas;
        estadoDeCuenta = estado;
    }
    static Usuario Diego = new Usuario("Diego", "Diego", "Serrano", 19, "123" , new int[] {1, 2}, true);
    static Usuario Carlos = new Usuario("Carlos", "Carlos Andrés", "Padilla", 20, "123", new int[] {3, 4}, true);
    static Usuario Aaron = new Usuario("Aaron", "Aaron", "De Alba", 19, "123", new int[] {5, 6}, true);
    static Usuario Gerardo = new Usuario();
    static Usuario Caro = new Usuario();
    static Usuario Gama = new Usuario();
    static Usuario Usuario6 = new Usuario();
    static Usuario Usuario7 = new Usuario();
    static Usuario Usuario8 = new Usuario();
    static Usuario Usuario9 = new Usuario();
    static Usuario Usuario10 = new Usuario();
    static Usuario[] listaDeUsuarios = {Diego, Carlos, Aaron, Gerardo, Caro, Gama, Usuario6, Usuario7, Usuario8, Usuario9, Usuario10};
}
