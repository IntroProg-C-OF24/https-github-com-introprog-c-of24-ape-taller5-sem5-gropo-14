package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner flamengo = new Scanner(System.in);
        int var1;
        double var2, descuento, subtotal, total;
        System.out.println("Ingresar numero de dias a hospedarse");
        var1 = flamengo.nextInt();
        System.out.println("Ingresar cosot de la habitacion");
        var2 = flamengo.nextDouble();
        subtotal = var1 * var2;
        total = var1 * var2;
        descuento = 0;
        if (var1 > 15) {
            descuento = total * 0.2;
            total = total - descuento;
        } else {
            if (var1 > 10) {
                descuento = total * 0.15;
                total = total - descuento;
            } else {
                if (var1 > 5) {
                    descuento = total * 0.1;
                    total = total - descuento;
                }
                System.out.println("El subtotal por pagar es: " + subtotal);
                System.out.println("Se le aplicaria un descuento del: " + descuento);
                System.out.println("El total a pagar es: " + total);
            }
        }

    }

}
