
package tiendaderopa;

/**
 *
 * @author Samuel-Josue
 */
public class Persona {
    private String nombre;
    private int edad;
    private int id;
    private int dineroDisp;
    
    public Persona() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    @Override
    public String toString() {
        return "-----Persona-----" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nID: " + id + "\nDinero disponible: " + dineroDisp;
    }
    
    
}
