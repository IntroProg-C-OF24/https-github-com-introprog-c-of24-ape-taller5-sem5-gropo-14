package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu peso");
        double peso = teclado.nextDouble();
        System.out.println("Ingresa tu altura");
        double altura = teclado.nextDouble();
        double imc = calcularIndice(peso, altura);
        String clasificacion = clasificarIndice(imc);
        System.out.println("Tu indice de masa corporal es: " + imc);
        System.out.println("Estas en un " + clasificacion);

    }

    public static double calcularIndice(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String clasificarIndice(double imc) {
        if (imc < 18.5) {
            return "bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad";
        } else if (imc >= 35 && imc < 40) {
            return "obesidad";
        } else {
            return "obesidad severa";
        }
    }

}
