package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var1, var2, var3, var4, var5;
        System.out.println("Ingrese su edad");
        var3 = teclado.nextDouble();
        System.out.println("Ingrese el costo de Kilovatios/hora");
        var1 = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de kilovatios consumidos menusalmente");
        var2 = teclado.nextDouble();
        var4 = var1 * var2;
        if (var3 > 65) {
            var5 = var4 * 10 / 100;
            var4 = var4 - var5;
        }
        System.out.println("El valor de la planilla es: " + var4);
    }

}
