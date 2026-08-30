package com.ejercicio03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("EJERCICIO 3 - REGISTRO DE USUARIO");
        System.out.println("=================================");

        try {

            System.out.print("Ingrese el nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String contraseña = scanner.nextLine();

            if (contraseña.length() < 8) {

                throw new SecurityException(
                    "La contraseña debe tener al menos 8 caracteres."
                );
            }

            boolean tieneNumero = false;
            boolean tieneEspecial = false;

            for (int i = 0; i < contraseña.length(); i++) {

                char caracter = contraseña.charAt(i);

                if (caracter >= '0' && caracter <= '9') {
                    tieneNumero = true;
                }

                if (!Character.isLetterOrDigit(caracter)) {
                    tieneEspecial = true;
                }
            }

            if (!tieneNumero) {

                throw new SecurityException(
                    "La contraseña debe contener al menos un numero."
                );
            }

            if (!tieneEspecial) {

                throw new SecurityException(
                    "La contraseña debe contener al menos un caracter especial."
                );
            }

            System.out.println();
            System.out.println("Usuario registrado correctamente.");
            System.out.println("Nombre de usuario: " + usuario);

        } catch (SecurityException e) {

            System.out.println("Error de seguridad: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fin del programa.");
            scanner.close();
        }

        scanner.close();
    }
}