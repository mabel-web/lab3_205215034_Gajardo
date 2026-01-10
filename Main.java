import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bienvenida/o a la biblioteca virtual");
        int opcion;

        do {
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    break;


                case 2:
                    break;


                case 3:
                    break;


                default:
                    System.out.println("Opción invalida.");
            }
        }
    } while (opcion != 0);

    private static void menu();
        System.out.println("Seleccionar una instrucción:");
        System.out.println("");
        System.out.println("");
        System.out.println("N. Salir");
}