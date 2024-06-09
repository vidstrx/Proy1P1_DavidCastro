
package tiendaderopa;

/**
 *
 * @author Samuel-Josue
 */
public class Persona {
    private String nombre;
    private int dineroDisp;
    private String colorPref;
    private int talla;

    public Persona() {
    }

    public Persona(String nombre, int dineroDisp, String colorPref, int talla) {
        this.nombre = nombre;
        this.dineroDisp = dineroDisp;
        this.colorPref = colorPref;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDineroDisp() {
        return dineroDisp;
    }

    public String getColorPref() {
        return colorPref;
    }

    public int getTalla() {
        return talla;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDineroDisp(int dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    public void setColorPref(String colorPref) {
        this.colorPref = colorPref;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "-----Persona-----" + "\nNombre: " + nombre + "\nDinero disponible: " + dineroDisp + "\nColor preferido: " + colorPref + "\nTalla: " + talla;
    }
    
    
}
