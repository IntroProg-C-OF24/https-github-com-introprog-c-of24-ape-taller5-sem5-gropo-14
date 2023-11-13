
package ejercicio02;
/**
 *
 * @author Pablo Velez
 *
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dia_delasemana ;
        System.out.println("Ingresa un numero");
        dia_delasemana = teclado.nextInt();
        if (dia_delasemana == 1)
            System.out.println("ES lunes");
        else
            if(dia_delasemana == 2)
                System.out.println("ES martes");
            else
                if (dia_delasemana ==  3)
                    System.out.println("Es miercoles");
                else
                    if (dia_delasemana == 4)
                        System.out.println("Es jueves");
                    else
                        if (dia_delasemana == 5)
                            System.out.println("Es viernes");
                        else
                            if (dia_delasemana == 6)
                                System.out.println("ES sabado");
                            else
                                if (dia_delasemana == 7){
                                    System.out.println("Es Domingo");
                                }
                                else
                                    System.out.println("Este numero no pertenece a ningun dia de la semana");
        // TODO code application logic here
    }
    
}
