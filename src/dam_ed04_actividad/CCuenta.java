/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Tarea para ED04 José Ignacio Navarro Arranz
 */

/**
 * @author  José Ignacio Navarro
 */

package dam_ed04_actividad;

/**
 *
 * @author Nacho
 */
public class CCuenta {

/**
 * Atributos de la clase CCuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Constructor
 */
    public CCuenta()
    {
    }
    
/**
 * Incliuimos el siguiente comentario para realizar un nuevo commit
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Método para asignar nombre
 * @param nom 
 */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
/**
 * Método para obtener nombre
 * @return 
 */
    public String obtenerNombre()
    {
        return getNombre();
    }
/**
 * Método para obtener el estado de la cuenta
 * @return 
 */

    public double estado()
    {
        return getSaldo();
    }

/**
 * Método para ingrear una cantidad
 * @param cantidad
 * @throws Exception 
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar una cantidad
     * @param cantidad
     * @throws Exception 
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método para obtener número cuenta
     * @return 
     */


    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método para obtener el nombre
     * @return 
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Método para asignar nombre
     * @param nombre 
     */


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener tipo de interes
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método paraasignar tipo de interes
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Método para obtener cuenta
     * @return 
     */

    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Método para asignar cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener saldo
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método para asignar saldo
     * @param saldo 
     */

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
