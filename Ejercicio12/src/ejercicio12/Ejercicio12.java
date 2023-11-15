package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String marca, origen;
        double precio, impuesto;
        System.out.println("Ingresar marca del automovil");
        marca = teclado.nextLine();
        System.out.println("Ingresar pais de origen del automovil");
        origen = teclado.nextLine();
        System.out.println("Ingresar el costo del automovil");
        precio = teclado.nextDouble();
        if (origen.equals("Alemania")) {
            impuesto = precio * 0.2;
            precio = precio + impuesto;
            System.out.println("EL impuesto a pagar es: " + impuesto);
            System.out.println("El precio de venta es: " + precio);
        } else {
            if (origen.equals("Japon")) {
                impuesto = precio * 0.3;
                precio = precio + impuesto;
                System.out.println("El impuesto a pagar es: " + impuesto);
                System.out.println("El precio de venta es: " + precio);
            } else {
                if (origen.equals("Italia")) {
                    impuesto = precio * 0.15;
                    precio = precio + impuesto;
                    System.out.println("El impuesto a pagar es: " + impuesto);
                    System.out.println("El percio de venta es: " + precio);
                } else {
                    if (origen.equals("USA")) {
                        impuesto = precio * 0.08;
                        precio = precio + impuesto;
                        System.out.println("El impuesto a pagar es: " + impuesto);
                        System.out.println("El precio de venta es: " + precio);
                    }
                }

            }
        }

    }

}
