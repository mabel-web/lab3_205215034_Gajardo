import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         *RF06 TDA Biblioteca - constructor
         *
         * @return
         */
        BibliotecaMariaGajardo_205215034 b = new BibliotecaMariaGajardo_205215034(2, 14, 100, 1000, 1); //valores de ejemplo debo revisarlos


        System.out.println("Bienvenida/o a la biblioteca virtual");
        int opcion;

        do {
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    registrarUsuario(b);
                    break;


                case 2:
                    agregarLibro(b);
                    break;


                case 3:
                    crearPrestamo(b)
                    break;


                default:
                    System.out.println("Opción invalida.");
            }
    } while (opcion != 0);

    private static void menu(){
        System.out.println("Seleccionar una operación:");
        System.out.println("1. Registrar usuario");
        System.out.println("2. Agregar Libro");
        System.out.println("N. Salir");
}