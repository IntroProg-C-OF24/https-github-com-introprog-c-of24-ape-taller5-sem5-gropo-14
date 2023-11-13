package ejercicio03;
/**
 *
 * @author Pablo Velez
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("primer numero");
        numero1 = teclado.nextInt();
        System.out.println("segundo numero");
        numero2 = teclado.nextInt();
        System.out.println("tercer numero");
        numero3 = teclado.nextInt();
        if (numero1 == numero2 && numero1 == numero3 )
            System.out.println("Los numeros son iguales");
        else 
            if (numero1 > numero2 && numero1 > numero3)
                System.out.println("El mayor es: " + numero1);
            else
                if (numero2 > numero1 && numero2 > numero3)
                    System.out.println("El mayor es: " + numero2);
                else
                    if (numero3 > numero1 && numero3 > numero2)
                        System.out.println("El mayor es: " + numero3);
        // TODO code application logic here
    }
    
}
