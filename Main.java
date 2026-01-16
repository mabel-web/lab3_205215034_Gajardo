import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         *RF06 TDA Biblioteca - constructor
         *
         * @return
         */
        BibliotecaMariaGajardo_205215034 b = new BibliotecaMariaGajardo_205215034(2, 14, 100, 1000, 1, LocalDate.now()); //valores de ejemplo debo revisarlos


        System.out.println("Bienvenida/o a la biblioteca virtual");
        int opcion;
        do {
            menu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1:
                    agregarLibro(b);
                    break;


                case 2:
                    registrarUsuario(b);
                    break;


                case 3:
                   obtenerUsuario(b);
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
    } while (opcion != 0);

    private static void menu(){
        System.out.println("Seleccionar una operación:");
        System.out.println("1. Agregar libro.");
        System.out.println("2. Registrar usuario.");
        System.out.println("3. Obtener usuario.");
        System.out.println("4. Buscar libro.");
        System.out.println("N. Salir");
}

    private static void agregarLibro(BibliotecaMariaGajardo_205215034 b){
        System.out.print("Ingresar el nombre del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingresar el autor del libro:");
        String autor = scanner.nextLine();
        LibroMariaGajardo_205215034 l = b.agregarLibro(titulo, autor);
        if(l != null){
            System.out.println("Libro agregado.");
        } else {
            System.out.println("Error, no se puede agregar el libro.");
            }
        }


    private static void registrarUsuario(BibliotecaMariaGajardo_205215034 b){
        System.out.print("Ingresar nombre y apellido del usuario:");
        String nombre = scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.registrarUsuario(nombre);
        if(u != null){
            System.out.println("Usuario registrado.");
        } else {
            System.out.println("Error, no se puede registrar el usuario.");
        }

    private static void obtenerUsuario(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el id del usuario:");
        int id = scanner.nextInt();
        scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.obtenerUsuario(id);//faltan las respuestas
            }
    }