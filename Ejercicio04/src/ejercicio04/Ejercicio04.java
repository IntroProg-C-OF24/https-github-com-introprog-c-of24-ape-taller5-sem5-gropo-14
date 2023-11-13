
package ejercicio04;
/**
 *
 * @author Pablo velez
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double descuento, precio;
        System.out.println("Ingresa el precio del producto");
        descuento = teclado.nextDouble();
        if (descuento > 100){
            precio = descuento * 0.1;
            descuento = descuento - precio;
        } 
        System.out.println("El precio final del producto es: " + descuento); 
        // TODO code application logic here
    }
    
}
