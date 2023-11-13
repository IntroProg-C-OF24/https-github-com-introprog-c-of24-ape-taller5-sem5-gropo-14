
package ejercicio07;
/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion ;
        System.out.println("Ingresa tu nota");
        calificacion = teclado.nextInt();
        if (calificacion >= 90 && calificacion <= 100) 
            System.out.println("TIENES A"); 
        else 
            if (calificacion >= 80 && calificacion <= 89) 
                System.out.println("TIENES B"); 
            else
                if (calificacion >= 70 && calificacion <= 79) 
                    System.out.println("TIENES C");
                else
                    if (calificacion >= 60 && calificacion <= 69) 
                        System.out.println("TIENES D");
                    else
                        if (calificacion >= 50 && calificacion <= 59) 
                            System.out.println("TIENES E");
                    else
                        if (calificacion >= 20 && calificacion <= 29)
                            System.out.println("preparate para los examenes de Gracia");
                                

        // TODO code application logic here
    }
    
}
