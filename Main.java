import java.time.LocalDate;
import java.util.List;
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
                    crearUsuario(b);
                    break;

                case 2:
                    crearLibro(b);
                    break;

                case 3:
                    crearPrestamo(b);
                    break;

                case 4:
                    crearBiblioteca(b);
                    break;

                case 5:
                    agregarLibro(b);
                    break;

                case 6:
                    registrarUsuario(b);
                    break;


                case 7:
                   obtenerUsuario(b);
                   break;

                case 8:
                    buscarLibro(b);
                    break;

                    break;
                default:
                    System.out.println("Opción invalida.");
            }
    } while (opcion != 0);

    private static void menu(){
        System.out.println("Seleccionar una operación:");
        System.out.println("1. Crear usuario.");
        System.out.println("2. Crear libro.");
        System.out.println("3. Crear préstamo.");
        System.out.println("4. Crear biblioteca.");
        System.out.println("5. Agregar libro.");
        System.out.println("6. Registrar usuario.");
        System.out.println("7. Obtener usuario.");
        System.out.println("8. Buscar libro.");
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
        UsuarioMariaGajardo_205215034 u = b.obtenerUsuario(id);
        if(u != null){
             System.out.println("Usuario encontrado");
        } else {
             System.out.println("El usuario no existe.");
                }
            }
    }

    private static void crearUsuario(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el nombre de usuario:");
        String nombre = scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.crearUsuario(nombre);
        if(u != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    private static void crearLibro(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el titulo del libro:");
        String titulo = scanner.nextLine();
        System.out.println("Ingresar el autor del libro:");
        String autor = scanner.nextLine();
        LibroMariaGajardo_205215034 l = b.crearLibro(titulo, autor);
        if(l != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    private static void crearPrestamo(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el usuario");
        String usuario = scanner.nextLine();
        System.out.println("Ingresar el libro:");
        String libro = scanner.nextLine();
        PrestamoMariaGajardo_205215034 p = b.crearPrestamo(usuario, libro);
        if(p != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    }

    private static void buscarLibro(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Buscar libro por su:");
        System.out.println("1. id.");
        System.out.println("2. Titulo.");
        System.out.println("3. Autor.");
        System.out.print("Seleccione un criterio:");
        int opcion = scanner.nextLine();
        BuscarLibro_MariaGajardo_205215034 busqueda = null;
        String criterio;
        switch (opcion){
            case 1:
                busqueda = new BuscarLibroId_MariaGajardo_205215034();
                System.out.print("Ingrese id del libro:");
                criterio = scanner.nextLine();
                break;

            case 2:
                busqueda = BuscarLibroTitulo_MariaGajardo_205215034();
                System.out.print("Ingresa el titulo del libro:");
                criterio = scanner.nextLine();
                break;


            case 3:
                busqueda = BuscarLibroAutor_MariaGajardo_205215034();
                System.out.print("Ingresa el autor del libro:");
                criterio = scanner.nextLine();
                break;

            default:
                System.out.print("Error, opcion ivalida.");
                return;
        }
        LibroMariaGajardo_205215034 libro = b.buscarLibro(busqueda, criterio);
        if(libro != null){
            System.out.println("");





        }

    }








    }