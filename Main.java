import java.time.LocalDate;
import java.util.Scanner;

/**
 * Main de la biblioteca, aqui se encuentra el constructor TDA de la biblioteca y
 * el menu para acceder a los metodos/rfs
 * @author Maria Belen Gajardo
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         *RF06 TDA Biblioteca - constructor
         *
         * @return biblioteca con parametros iniciales
         */
        BibliotecaMariaGajardo_205215034 b = new BibliotecaMariaGajardo_205215034(2, 14, 100, 1000, 1, LocalDate.now());

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
                    b = crearBiblioteca();//?????
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

                case 9:
                    isLibroDisponible(b);
                    break;

                case 10:
                    isUsuarioSuspendido(b);
                    break;

                case 11:
                    getFecha(b);
                    break;

                case 12:
                    obtenerDeuda(b);
                    break;

                case 13:
                    obtenerFechaVencimiento(b);
                    break;

                case 14:
                    calcularDiasRetraso(b);
                    break;

                default:
                    System.out.println("Opción invalida.");
            }
    } while (opcion != 0);
    }
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
        System.out.println("9. Verificar disponibilidad de un libro.");
        System.out.println("10. Verificar si un usuario esta suspendido.");
        System.out.println("11. Obtener fecha actual del sistema.");
        System.out.println("12. Obtener deuda de un usuario.");
        System.out.println("13. Obtener fecha de vencimiento de un prestamo.");
        System.out.println("14. Calcular dias de retraso en un prestamo.");
        System.out.println("0. Salir");
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


    private static void crearUsuario(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el nombre de usuario:");
        String nombre = Main.scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.crearUsuario(nombre);
        if(u != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    private static void crearLibro(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el titulo del libro:");
        String titulo = Main.scanner.nextLine();
        System.out.println("Ingresar el autor del libro:");
        String autor = Main.scanner.nextLine();
        LibroMariaGajardo_205215034 l = b.crearLibro(titulo, autor);
        if(l != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    private static void crearPrestamo(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresar el usuario");
        String usuario = Main.scanner.nextLine();
        System.out.println("Ingresar el libro:");
        String libro = Main.scanner.nextLine();
        PrestamoMariaGajardo_205215034 p = b.crearPrestamo(UsuarioMariaGajardo_205215034 usuario, libro);
        if(p != null){
            System.out.println("Usuario creado.");
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }


    private static void buscarLibro(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Buscar libro por su:");
        System.out.println("1. id.");
        System.out.println("2. Titulo.");
        System.out.println("3. Autor.");
        System.out.print("Seleccione un criterio:");
        int opcion = Main.scanner.nextInt();
        Main.scanner.nextLine();
        BuscarLibro_MariaGajardo_205215034 busqueda = null;
        String criterio;
        switch (opcion){
            case 1:
                busqueda = new BuscarLibroId_MariaGajardo_205215034();
                System.out.print("Ingrese id del libro:");
                criterio = Main.scanner.nextLine();
                break;

            case 2:
                busqueda = new BuscarLibroTitulo_MariaGajardo_205215034();
                System.out.print("Ingresa el titulo del libro:");
                criterio = Main.scanner.nextLine();
                break;


            case 3:
                busqueda = new BuscarLibroAutor_MariaGajardo_205215034();
                System.out.print("Ingresa el autor del libro:");
                criterio = Main.scanner.nextLine();
                break;

            default:
                System.out.print("Error, opcion ivalida.");
                return;
        }
        LibroMariaGajardo_205215034 libro = b.buscarLibro(busqueda, criterio);
        if(libro != null){
            System.out.println("El libro que buscabas es:");
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }
        }

        public static void isLibroDisponible(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresa el id del libro para verificar su disponibilidad:");
        int id = Main.scanner.nextInt();
        Main.scanner.nextLine();
        boolean disponible  = b.isLibroDisponible(id);
        if(disponible){
            System.out.println("El libro está disponible.");
            } else {
            System.out.println("El libro no está disponible.");
            }
        }


    public static void isUsuarioSuspendido(BibliotecaMariaGajardo_205215034 b){
        System.out.print("Ingresa el id del usuario:");
        int id = Main.scanner.nextInt();
        Main.scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.obtenerUsuario(id);
        if(u == null){
            System.out.println("El usuario no existe.");
            return;
        }
        boolean suspendido =  b.isUsuarioSuspendido(u);
        if(suspendido){
            System.out.println("El usuario está suspendido.");
        } else {
            System.out.println("El usuario esta activo");
        }
    }

    public static void getFecha(BibliotecaMariaGajardo_205215034 b){
        System.out.println("La fecha de hoy es:  " + b.getFecha());
    }

    public static void obtenerDeuda(BibliotecaMariaGajardo_205215034 b){
        System.out.print("Ingresa el id del usuario:");
        int id = Main.scanner.nextInt();
        Main.scanner.nextLine();
        UsuarioMariaGajardo_205215034 u = b.obtenerUsuario(id);
        if(u == null){
            System.out.println("El usuario no existe.");
            return;
        }
        int deuda = b.obtenerDeuda(u);
        System.out.println("La deuda del usuario es: $" + deuda);
    }

    public static void obtenerFechaVencimiento(BibliotecaMariaGajardo_205215034 b){
    System.out.println("Ingresa el id del prestamo:");
    int id = Main.scanner.nextInt();
    PrestamoMariaGajardo_205215034 p = null;
    for(PrestamoMariaGajardo_205215034 prestamo : b.getPrestamos()){
        if(prestamo.getIdPrestamo() == id){
            p = prestamo;
            break;
        }
    }
    if(p == null){
        System.out.println("Ese prestamo no existe.");
    } else {
        LocalDate fechaVencimiento = b.obtenerFechaVencimiento(p.getFecha(), p.getDiasSolicitados());
        System.out.println("La fecha de vencimiento es: " + fechaVencimiento);
        }
    }

    public static void calcularDiasRetraso(BibliotecaMariaGajardo_205215034 b){
        System.out.println("Ingresa el id del prestamo:");
        int id = Main.scanner.nextInt();
        PrestamoMariaGajardo_205215034 p = null;
        for(PrestamoMariaGajardo_205215034 prestamo : b.getPrestamos()){
            if(prestamo.getIdPrestamo() == id){
                p = prestamo;
                break;
            }
        }
        if(p == null){
            System.out.println("Ese prestamo no existe.");
        } else {
            int diasRetraso = b.calcularDiasRetraso(p.getDiasSolicitados(), LocalDate.now());
            System.out.println("Tiene " + diasRetraso + " dias de retraso");
        }
    }
    }






    }