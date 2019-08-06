package wenance_tp4;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int aciertos = 0;
        int errores = 0;
        boolean correcto = false;
        boolean gano = false;
        String[] arrA = {"casa", "perro", "auto", "lampara", "zapato"};
        int x = (int) (Math.random() * 5);
        char[] caracteres = arrA[x].toCharArray();
        char[] solucion = new char[arrA[x].length()];
        System.out.println(Arrays.toString(solucion));
        do {
            char letra = perdiLetra();
            for (int i = 0; i < arrA[x].length(); i++) {
                if (letra == caracteres[i]) {
                    correcto = true;
                    solucion[i] = letra;
                    aciertos++;
                }
            }
            System.out.println(Arrays.toString(solucion));
            if (correcto) {
                System.out.println("Letra correcta");
                correcto = false;
            } else {
                System.out.println("Letra incorrecta");
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


            if (aciertos==arrA[x].length()){
                gano = true;
            }

        } while (errores < 6 && !gano);
        if (gano){
            System.out.println("Felicitaciones");
        }else{
            System.out.println("Murio");
        }
    }

    public static char perdiLetra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char c = teclado.next().charAt(0);
        return c;

    }
}





