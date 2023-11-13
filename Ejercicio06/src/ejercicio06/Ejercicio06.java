
package ejercicio06;
/**
 *
 * @author Pablo velez
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        if(edad >= 18)
            System.out.println("eres de la adulto");
        else 
            if(edad >= 12)
                System.out.println("eres adolecente");
            else
                System.out.println("eres un niño");
        // TODO code application logic here
    }
    
}
