package com.ejercicio02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("EJERCICIO 2 - IMPUESTO SOBRE LA RENTA");
        System.out.println("=================================");

        try {

            System.out.print("Ingrese su salario anual: $");

            String entrada = scanner.nextLine();

            double salario = Double.parseDouble(entrada);

            double impuesto;

            if (salario <= 10000) {

                impuesto = 0;

            } else if (salario <= 20000) {

                impuesto = salario * 0.10;

            } else if (salario <= 40000) {

                impuesto = salario * 0.20;

            } else {

                impuesto = salario * 0.30;
            }

            System.out.printf("Salario anual: $%.2f%n", salario);
            System.out.printf("Impuesto a pagar: $%.2f%n", impuesto);

        } catch (NumberFormatException e) {

            System.out.println(
                "Error: debe ingresar un salario numerico."
            );
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
            scanner.close();
        }

    }
}