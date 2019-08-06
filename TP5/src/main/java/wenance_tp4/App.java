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
        String letra = (char)perdiLetra();
        char[] caracteres = arrA[x].toCharArray();
        System.out.println(Arrays.toString(caracteres));

        for (int i = 0; i < arrA[x].length();i++){
            if (letra.equals(caracteres[i])){
                System.out.println("Letra correcta!");
            } else
                System.out.println("Letra incorrecta");
        }


        }

    public static String perdiLetra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String a = teclado.next();
        return a;
    }

}
