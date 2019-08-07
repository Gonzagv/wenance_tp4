package wenance_tp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int errores = 0;
        boolean correcto = false;
        boolean gano = false;
        System.out.println("Bienvenido al Ahorcado Wenance");
        String[] arrA = {"casa", "perro", "auto", "lampara", "zapato" , "ropa", "caso" , "frasco", "ramo", "roma", "wenance", "salud", "silla", "aire", "maven"};
        int x = (int) (Math.random() * 15);
        char[] caracteres = arrA[x].toCharArray();
        char[] solucion = new char[arrA[x].length()];
        imprimirPalabra(solucion);

        do {
            char letra = Character.toLowerCase(perdiLetra());

            for (int i = 0; i < arrA[x].length(); i++) {

                if (letra == caracteres[i]) {
                    correcto = true;
                    solucion[i] = letra;
                }
            }

            if (correcto) {
                System.out.println("\nLetra correcta");
                correcto = false;
            } else {
                System.out.println("\nLetra incorrecta");
                errores++;
            }


            switch (errores) {
                case 1:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |          |_|          ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
                case 2:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |          |_|          ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
                case 3:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |          |_|          ");
                    System.out.println("   |           |           ");
                    System.out.println("   |         --|           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
                case 4:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |          |_|          ");
                    System.out.println("   |           |           ");
                    System.out.println("   |         --|--           ");
                    System.out.println("   |           |          ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
                case 5:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |          |_|          ");
                    System.out.println("   |           |           ");
                    System.out.println("   |         --|--           ");
                    System.out.println("   |           |          ");
                    System.out.println("   |          /            ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
                case 6:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |           |           ");
                    System.out.println("   |           _           ");
                    System.out.println("   |         _|_|_         ");
                    System.out.println("   |           |           ");
                    System.out.println("   |         --|--         ");
                    System.out.println("   |           |           ");
                    System.out.println("   |          - -          ");
                    System.out.println("   |         |   |         ");
                    System.out.println("  ___                      ");
                    break;
                default:
                    System.out.println("    ____________");
                    System.out.println("   |           |           ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("   |                       ");
                    System.out.println("  ___                      ");
                    break;
            }

            imprimirPalabra(solucion);
            for (int j = 0; j < caracteres.length; j++) {
                if (solucion[j] == caracteres[j]) {
                    gano = true;
                } else {
                    gano = false;
                    break;
                }

            }
        } while (errores < 6 && !gano);

        if (gano) {
            System.out.println("\nFelicitaciones");
        } else {
            System.out.println("\nMurio");
        }

    }


    public static char perdiLetra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngrese una letra");
        char c = teclado.next().charAt(0);

        return c;

    }


    public static void imprimirPalabra(char solucion[]) {
        System.out.println(" ");
        for (int i = 0; i < solucion.length; i++) {

            if (solucion[i] == '\u0000') {
                System.out.print(" _ ");
            } else {
                System.out.print(" " + solucion[i] + " ");
            }
        }
    }
}






