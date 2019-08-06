package wenance_tp4;

import java.util.Scanner;

public class Empleado {
    Scanner teclado = new Scanner(System.in);
    public static final long serialVersionUID = -1L;
    String name;
    String age;
    String birthday;
    public Empleado (String name, String age, String birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    }

}

