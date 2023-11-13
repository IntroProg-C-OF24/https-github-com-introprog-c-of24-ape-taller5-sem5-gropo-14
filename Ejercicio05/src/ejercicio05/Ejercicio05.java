
package ejercicio05;
/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int anio;
        System.out.println("Ingresa un anio");
        anio = teclado.nextInt();
       if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
           System.out.println("El anio es bisiesto");
       else
           System.out.println("El anio no es bisiesto");
        // TODO code application logic here
    }
    
}
