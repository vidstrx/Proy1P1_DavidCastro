
package tiendaderopa;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class TiendaDeRopa {
    
    public static Ropa ropa = new Ropa();
    /*public static ArrayList <Ropa> camisas = new ArrayList();
    public static ArrayList <Ropa> pantalones = new ArrayList();
    public static ArrayList <Ropa> gorras = new ArrayList();
    public static ArrayList <Ropa> sueteres = new ArrayList();
    public static ArrayList <Ropa> zapatos = new ArrayList();
    public static ArrayList <Ropa> calzonetas = new ArrayList();*/
    public static Persona persona = new Persona();
    public static Random numrandom = new Random();
    
    public static void main(String[] args) {
        VentanaMenuTienda interfaz = new VentanaMenuTienda();
        interfaz.setVisible(true); interfaz.setLocationRelativeTo(null);
    }
    
    //Este metodo recibe los parametros de la ropa que se selecciono de los botones de la interfaz, y retornara variable tipo Ropa
    public static Ropa opcionCant(String nombre, String tipo, int cantidad, String color, int precio){
        int opcion = 0, opcColor = 0;
        do { // Validaciones de lo que ingresa el usuario de la cantidad que hay disponible
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Precio normal -> " + precio + "\nIngresa la cantidad a llevar. Cantidad disponible: " + cantidad));
            if (opcion < 0){
                JOptionPane.showMessageDialog(null, "No ingresaste una cantidad correcta");
            } else if (opcion>cantidad){
                JOptionPane.showMessageDialog(null, "No tenemos una cantidad de " + opcion + " en nuestro inventario");
            }
        } while (opcion < 0 || opcion > cantidad);
        do{
            opcColor = Integer.parseInt(JOptionPane.showInputDialog(ropa.mostrarColores() +"\nIngresa la posicion del color que llevaras"));
            if (opcColor < 1 || opcColor > 6){
                JOptionPane.showMessageDialog(null, "No ingresaste una posicion valida");
            } else {
               color = ropa.escogerColor(opcColor);
            }
        } while (opcColor < 1 || opcColor > 6);
        cantidad = cantidad - opcion; // se resta la opcion escogida con la cantidad total para obtener lo que queda de inventario
        precio = precio * opcion; // dependiendo de la opcion escogida, se multiplicara el precio con la opcion para sacar el monto total a pagar 
        ropa = new Ropa(nombre,tipo,opcion,color,precio);
        return ropa;
    }
}
