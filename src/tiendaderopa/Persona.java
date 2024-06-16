
package tiendaderopa;

/**
 *
 * @author Samuel-Josue
 */
public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String numFactura;
    private int dineroDisp;
    private int dineroPagado;
    private int dineroDevuelto;
    
    public Persona() {
    }
    // Constructor sobrecargado
    public Persona(String nombre, int edad, String numFactura, int dineroDisp, int dineroPagado, int dineroDevuelto) {
        this.nombre = nombre;
        this.edad = edad;
        this.numFactura = numFactura;
        this.dineroDisp = dineroDisp;
        this.dineroPagado = dineroPagado;
        this.dineroDevuelto = dineroDevuelto;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumFactura() {
        return this.numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    public int getDineroPagado() {
        return dineroPagado;
    }

    public void setDineroPagado(int dineroPagado) {
        this.dineroPagado = dineroPagado;
    }

    public int getDineroDevuelto() {
        return dineroDevuelto;
    }

    public void setDineroDevuelto(int dineroDevuelto) {
        this.dineroDevuelto = dineroDevuelto;
    }

    @Override
    public String toString() {
        return "--------------------Persona--------------------" + "\nNombre: " + nombre + "\n\nEdad: " + edad + "\n\nNumero de factura: " + numFactura + "\n\nDinero disponible: " + dineroDisp + "\n\nPrecio pagado: " + dineroPagado + "\n\nDinero Devuelto: " + dineroDevuelto + "\n--------------------------------------------------";
    }
}
