
package tiendaderopa;

import java.util.ArrayList;

public class TiendaDeRopa {
    
    public static ArrayList <Ropa> camisas = new ArrayList();
    public static ArrayList <Ropa> pantalones = new ArrayList();
    public static ArrayList <Ropa> gorras = new ArrayList();
    public static ArrayList <Ropa> sueteres = new ArrayList();
    public static ArrayList <Ropa> zapatos = new ArrayList();
    public static ArrayList <Ropa> calzonetas = new ArrayList();
    public static Persona persona = new Persona();
    
    public static void main(String[] args) {
        VentanaMenuTienda interfaz = new VentanaMenuTienda();
        interfaz.setVisible(true); interfaz.setLocationRelativeTo(null);
    }
    
}
