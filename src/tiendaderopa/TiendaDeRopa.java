
package tiendaderopa;

import java.util.Random;
import javax.swing.JOptionPane;

public class TiendaDeRopa {
    
    public static Ropa ropa = new Ropa();
    public static Persona persona = new Persona();
    public static Random numrandom = new Random();
    
    public static void main(String[] args) {
        // Se manda a llamar la pantalla de todo el JFrame Form al main
        VentanaMenuTienda interfaz = new VentanaMenuTienda();
        interfaz.setVisible(true); interfaz.setLocationRelativeTo(null); 
    }
    
    //Este metodo recibe los parametros de la ropa que se selecciono de los botones de la interfaz, y retornara variable tipo Ropa
    public static Ropa opcionCant(String nombre, String tipo, int cantidad, String color, int precio){
        int opcion = 0, opcColor = 0;
        do { // Validaciones de lo que ingresa el usuario de la cantidad que hay disponible
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Precio normal -> " + precio + "\nIngresa la cantidad a llevar. Cantidad disponible: " + cantidad));
                if (opcion < 1){
                    JOptionPane.showMessageDialog(null, "No ingresaste una cantidad correcta");
                } else if (opcion>cantidad){
                    JOptionPane.showMessageDialog(null, "No tenemos una cantidad de " + opcion + " en nuestro inventario");
                }
                } catch (NumberFormatException exception){ // Validacion que sea un numero el que se ingrese
                    JOptionPane.showMessageDialog(null, "No ingresaste un valor correcto");
                }
            } while (opcion < 1 || opcion > cantidad); // Repite el ciclo si la cantidad ingresada es incorrectos hasta que ingrese una cantidad dentro del rango
            
        do { // Muestra matriz de colores, y le pide al usuario que ingrese el color a llevar de la ropa escogida
                try{ 
                    opcColor = Integer.parseInt(JOptionPane.showInputDialog(ropa.mostrarColores() +"\nIngresa la posicion del color que llevaras"));
                    if (opcColor < 1 || opcColor > 6){ // Validacion que este dentro del rango mostrado
                        JOptionPane.showMessageDialog(null, "No ingresaste una posicion valida");
                    } else {
                       color = ropa.escogerColor(opcColor);
                    }
                    
                } catch (NumberFormatException exception){ // Validacion que sea un numero el que se ingrese
                    JOptionPane.showMessageDialog(null, "No ingresaste un valor correcto");
                }
            } while (opcColor < 1 || opcColor > 6); // Repite el ciclo si los numeros ingresados son incorrectos hasta que ingrese uno valido
        
        cantidad = cantidad - opcion; // se resta la opcion escogida con la cantidad total para obtener lo que queda de inventario
        precio = precio * opcion; // dependiendo de la opcion escogida, se multiplicara el precio con la opcion para sacar el monto total a pagar 
        ropa = new Ropa(nombre,tipo,opcion,color,precio);
        return ropa;
    }
    
    // Metodo recursivo en el que devuelve el ID de la persona en un numero binario en formato String
    public static String numFacturaRecursivo(int numero){
        if (numero == 0){ // Caso base
            return "";
        }
        return numFacturaRecursivo(numero / 2) + (numero % 2);
    }
}
