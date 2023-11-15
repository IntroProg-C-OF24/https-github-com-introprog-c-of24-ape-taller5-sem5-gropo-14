package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String variable;
        double var1, var2, costoTotal, var4;
        System.out.println("Ingresar el producto que desea adquirir");
        variable = teclado.nextLine();
        System.out.println("Ingresar la cantidad de unidades que deseas adquirir");
        var2 = teclado.nextDouble();
        System.out.println("Ingrese el costo del producto");
        var1 = teclado.nextDouble();
        costoTotal = var1 * var2;
        if (var2 > 50) {
            var4 = costoTotal * 0.15;
            costoTotal = costoTotal - var4;
        }
        System.out.println("El Costo por Unidad es: " + var1);
        System.out.println("Las cantidad de unidades solicitadas son: " + var2);
        System.out.println("El costo total es: " + costoTotal);
    }

}
