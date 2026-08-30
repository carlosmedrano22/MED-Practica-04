package com.ejercicio01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("EJERCICIO 1 - RAIZ CUADRADA");
        System.out.println("=================================");

        try {

            System.out.print("Ingrese un numero: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                throw new ArithmeticException(
                    "No se puede calcular la raiz cuadrada de un numero negativo."
                );
            }

            double resultado = Math.sqrt(numero);

            System.out.printf(
                "La raiz cuadrada de %.2f es: %.2f%n",
                numero,
                resultado
            );

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
            scanner.close();
        }

    }
}