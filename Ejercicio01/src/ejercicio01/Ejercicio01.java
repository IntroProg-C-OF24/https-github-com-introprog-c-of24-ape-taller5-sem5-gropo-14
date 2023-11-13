
package ejercicio01;
/**
 *
 * @author Pablo velez
 */
import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        double edad;
        System.out.println("Ingresa tu edad");
        edad = teclado.nextDouble();
        if (edad >= 18)
            System.out.println("Eres apto para votar");
        else
            System.out.println("No eres apto para votar");
        // TODO code application logic here
    }
    
}
