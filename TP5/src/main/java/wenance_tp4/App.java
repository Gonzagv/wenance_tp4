package wenance_tp4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int errores = 0;
        boolean correcto = false;
        do{
            for (errores = 0; errores<=6; errores++) {
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
                        System.out.println("   |          |_|          ");
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
            }
        }while(errores <=6 || !correcto);
    }

}
