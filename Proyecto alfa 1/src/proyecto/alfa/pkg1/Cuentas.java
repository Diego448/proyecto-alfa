package proyecto.alfa.pkg1;

/**
 *
 * @author Diego
 */
public class Cuentas {
    int numeroCuenta;
    double saldo;
    public Cuentas(){
        
    }
    public Cuentas(double saldo, int numeroCuenta){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    static Cuentas cuenta000 = new Cuentas();
    static Cuentas cuenta001 = new Cuentas(10000, 1);
    static Cuentas cuenta002 = new Cuentas(10000, 2);
    static Cuentas cuenta003 = new Cuentas();
    static Cuentas cuenta004 = new Cuentas();
    static Cuentas[] listaDeCuentas = {cuenta000, cuenta001, cuenta002, cuenta003, cuenta004};
}
