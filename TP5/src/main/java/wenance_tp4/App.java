package wenance_tp4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] arrA = {"casa", "perro", "auto", "lampara", "zapato"};
        int x = (int) (Math.random() * 5);
        int errores = 0;
        char letra = perdiLetra();
        char[] caracteres = arrA[x].toCharArray();
        char[] solucion =  new char[arrA[x].length()];
        System.out.println(Arrays.toString(caracteres));
        boolean correcto = false;

        for (int i = 0; i < arrA[x].length(); i++) {
            if (letra == caracteres[i]) {
                correcto = true;
                solucion[i] = letra;

            }
        }
        System.out.println(Arrays.toString(solucion));
        if (correcto){
            System.out.println("Letra correcta");
        } else {
            System.out.println("Letra incorrecta");
            errores++;
        }


    }

    public static char perdiLetra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char c = teclado.next().charAt(0);
        return c;
    }

}
