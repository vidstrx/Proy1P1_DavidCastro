/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaderopa;

public class Ropa {
    // Atributos de la clase Ropa
    private String nombre;
    private String tipo;
    private int cantidad;
    private String color;
    private int precio;

    public Ropa() {
    }
    // Constructor sobrecargado
    public Ropa(String nombre, String tipo, int cantidad, String color, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.color = color;
        this.precio = precio;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nTipo: " + tipo + "\nCantidad: " + cantidad + "\nColor: " + color +"\nPrecio: " + precio;
    }
    
    // Este metodo simplemente mostrara una matriz de los colores disponibles, que los metera dentro de un String normal para poder mostrarlo en JOptionPane
    public String mostrarColores(){
        String matrizColores [][] = {
            {"1. Negro","2. Rojo","3. Azul"},
            {"4. Blanco","5. Cafe","6. Gris"}
        };
        String colores = "";
        for (int i = 0; i < matrizColores.length; i++) {
            for (int j = 0; j < matrizColores[i].length; j++) {
                colores += "[" + matrizColores[i][j] + "] ";
            }
            colores += "\n";
        }
        return colores;
    }
    
    // Este metodo recibe la posicion en la que esta el color que ingreso la persona y retornara ese mismo color como tipo String
    public String escogerColor(int posicion){
        String colores [][] = {
            {"Negro","Rojo","Azul"},
            {"Blanco","Cafe","Gris"}
        };
        String color = "";
         switch (posicion) {
            case 1:
                color = colores[0][0];
                System.out.println(color);
                break;
            case 2:
                color = colores[0][1];
                System.out.println(color);
                break;
            case 3:
                color = colores[0][2];
                System.out.println(color);
                break;
            case 4:
                color = colores[1][0];
                System.out.println(color);
                break;
            case 5:
                color = colores[1][1];
                System.out.println(color);
                break;
            case 6:
                color = colores[1][2];
                System.out.println(color);
                break;
        }
         return color;
    }
}
