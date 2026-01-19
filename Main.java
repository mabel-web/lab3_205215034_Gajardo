import java.time.LocalDate;
import java.util.Scanner;

/**
 * Main de la biblioteca, aqui se encuentra el constructor TDA de la biblioteca y
 * el menu para acceder a los metodos/rfs
 * @author Maria Belen Gajardo
 * version 1.0.0
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         *RF06 TDA Biblioteca - constructor
         *
         * @return biblioteca con parametros iniciales
         */

        Biblioteca_MariaGajardo_205215034 b = new Biblioteca_MariaGajardo_205215034(2, 14, 100, 1000, 1, LocalDate.now());

        /**
         * Aquí empieza el menu de la biblioteca que intectua con el usuario en la consola
         * Muestra 14 metodos disponibles
         */
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
    } while (opcion != 15);
    }
    private static void menu(){
        System.out.println("Seleccionar una operación:");
        System.out.println("1. Crear usuario.");
        System.out.println("2. Crear libro.");
        System.out.println("3. Crear préstamo.");
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
        System.out.println("15. Salir");
}

    /**
     * Permite que el usuario/a agregue un libro a la biblioteca, mostrando un mensaje si se logra o no
     * @param b biblioteca donde se registra el nuevo usuario
     */
    private static void agregarLibro(Biblioteca_MariaGajardo_205215034 b){
        System.out.print("Ingresar el nombre del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingresar el autor del libro:");
        String autor = scanner.nextLine();
        Libro_MariaGajardo_205215034 l = b.agregarLibro(titulo, autor);
        if(l != null){
            System.out.println("Libro agregado.");
        } else {
            System.out.println("Error, no se puede agregar el libro.");
            }
        }

    /**
     * Permite al usuario/a registrar un usuario nuevo a la biblioteca
     * @param b
     */
    private static void registrarUsuario(Biblioteca_MariaGajardo_205215034 b){
        System.out.print("Ingresar nombre y apellido del usuario:");
        String nombre = scanner.nextLine();
        Usuario_MariaGajardo_205215034 u = b.registrarUsuario(nombre);
        if(u != null){
            System.out.println("Usuario registrado.");
        } else {
            System.out.println("Error, no se puede registrar el usuario.");
        }
        }

    /**
     * Permite al usuario o usuaria buscar y retornar un usuario si es que existe, sino responde con un mensaje
      * @param b
     */
    private static void obtenerUsuario(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("Ingresar el nombre del usuario:");
        String nombre = scanner.nextLine();
        Usuario_MariaGajardo_205215034 usuarioEncontrado = null;
        for(Usuario_MariaGajardo_205215034 u : b.getUsuarios()){
            if(u.getNombre().equalsIgnoreCase(nombre)){
                usuarioEncontrado = u;
                break;
            }
        }
        if(usuarioEncontrado != null){
            System.out.println("Usuario encontrado");
            System.out.println("Id" + usuarioEncontrado.getIdUsuario());
            System.out.println("Nombre: "+ usuarioEncontrado.getNombre());
            System.out.println("Deuda: $" + usuarioEncontrado.getDeuda());
            System.out.println("Estado: " + (usuarioEncontrado.isActivo() ? "Activo" : "Suspendido"));
        } else {
            System.out.println("El usuario no existe.");
                }
        }

    /**
     * Permite que el usuario/a cree un usuario nuevo con atributos iniciales, tiene mensajes de confirmacion o fallo
     * Muestra el usaurio/a creado por mensaje en consola
     * @param b
     */
    private static void crearUsuario(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("Ingresar el nombre de usuario:");
        String nombre = Main.scanner.nextLine();
        Usuario_MariaGajardo_205215034 u = b.crearUsuario(nombre);
        if(u != null){
            System.out.println("Usuario creado.");
            System.out.println("Id" + u.getIdUsuario());
            System.out.println("Nombre: "+ u.getNombre());
            System.out.println("Deuda: $" + u.getDeuda());
            System.out.println("Estado: " + (u.isActivo() ? "Activo" : "Suspendido"));
        } else {
            System.out.println("No se pudo crear el usuario.");
        }
        }

    /**
     * Permite que el usuario/a cree un libro nuevo con atributos iniciales, tiene mensajes de confirmacion o fallo
     * Muestar el libro creado por mensaje en consola
     * @param b
     */
    private static void crearLibro(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("Ingresar el titulo del libro:");
        String titulo = Main.scanner.nextLine();
        System.out.println("Ingresar el autor del libro:");
        String autor = Main.scanner.nextLine();
        Libro_MariaGajardo_205215034 l = b.crearLibro(titulo, autor);
        if(l != null){
            System.out.println("Libro creado.");
            System.out.println("Id" + l.getIdLibro());
            System.out.println("Titulo: "+ l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Disponible: " + (l.isDisponible() ? "Sí" : "No"));
        } else {
            System.out.println("No se pudo crear el libro.");
        }
        }
    /**
     * Permite que el usuario/a cree un prestamo nuevo con atributos iniciales, tiene mensajes de confirmacion o fallo
     * Muestra el prestamo creado por mensaje
     * @param b
     */
    private static void crearPrestamo(Biblioteca_MariaGajardo_205215034 b){
        System.out.print("Ingresa el nombre del usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresar titulo del libro:");
        String titulo = Main.scanner.nextLine();
        Usuario_MariaGajardo_205215034 usuario = null;
        for(Usuario_MariaGajardo_205215034 u : b.getUsuarios()){
            if(u.getNombre().equalsIgnoreCase(nombre)){
                usuario = u;
                break;
            }
        }
        Libro_MariaGajardo_205215034 libro = null;
        for(Libro_MariaGajardo_205215034 l : b.getLibros()){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                libro = l;
                break;
            }
        }
        if(usuario != null && libro != null){
            Prestamo_MariaGajardo_205215034 p = b.crearPrestamo(usuario, libro);
            System.out.println("Prestamo creado.");
            System.out.println("Id prestamo: " + p.getIdPrestamo());
            System.out.println("Id usuario: " + usuario.getIdUsuario());
            System.out.println("Id libro: " + libro.getIdLibro());
            System.out.println("Fecha inicio: " + p.getFecha());
            System.out.println("Días solicitados: " + p.getDiasSolicitados());
            System.out.println("Fecha vencimiento: " + b.obtenerFechaVencimiento(p.getFecha(), p.getDiasSolicitados()));
        } else {
            System.out.println("No se pudo crear el prestamo.");
        }
        }

    /**
     * Permite buscar un libro por tres criterios distintos, id con busqueda exacta y titulo o autor por busqueda aprcial
     * Si encuentra el libro lo muestra por la consola, sino mensaje de fallo
     * @param b
     */
    private static void buscarLibro(Biblioteca_MariaGajardo_205215034 b){
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
                System.out.println("Error, opcion ivalida.");
                return;
        }
        Libro_MariaGajardo_205215034 libro = b.buscarLibro(busqueda, criterio);
        if(libro != null){
            System.out.println("El libro que buscabas es:");
            System.out.println("Id: " + libro.getIdLibro());
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }
        }

    /**
     * Permite ver el estado de disponibilidad de un libro, retorna el estado por mensaje en la consola
     * @param b
     */
    public static void isLibroDisponible(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("Ingresa el titulo del libro para verificar su disponibilidad:");
        String criterio = Main.scanner.nextLine();
        Libro_MariaGajardo_205215034 libro = null;
        for(Libro_MariaGajardo_205215034 l : b.getLibros()){
            if(l.getTitulo().toLowerCase().contains(criterio.toLowerCase())){
                libro = l;
                break;
            }
        }
        if(libro != null){
            boolean disponible  = b.isLibroDisponible(libro);
            System.out.println(disponible ? "El libro está disponible." : "El libro no está disponible.");
            } else {
            System.out.println("El libro no existe");
            }
        }
    /**
     * Permite ver el estado (activo/suspendido) de un usuario, retorna el estado por mensaje en la consola
     * @param b
     */
    public static void isUsuarioSuspendido(Biblioteca_MariaGajardo_205215034 b){
        System.out.print("Ingresa el nombre del usuario para verificar su estado:");
        String nombre = Main.scanner.nextLine();
        Usuario_MariaGajardo_205215034 usuarioBuscado = null;
        for(Usuario_MariaGajardo_205215034 u : b.getUsuarios()){
            if(u.getNombre().equalsIgnoreCase(nombre)){
                usuarioBuscado = u;
                break;
            }
        }
        if(usuarioBuscado != null){
            boolean suspendido =  b.isUsuarioSuspendido(usuarioBuscado);
            System.out.println("Estado: "+ (suspendido ? "Suspendido" : "Activo"));
        } else {
            System.out.println("El usuario no existe");
        }
    }
    /**
     * Permite ver la fecha actual del sistema por consola
     * @param b
     */
    public static void getFecha(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("La fecha de hoy es:  " + b.getFecha());
    }

    /**
     * Permite buscar y obtener la deuda de un usuario, la muestra por pantalla o muestra mensaje de error
     * @param b
     */
    public static void obtenerDeuda(Biblioteca_MariaGajardo_205215034 b){
        System.out.print("Ingresa el nombre del usuario:");
        String nombre = Main.scanner.nextLine();
        Usuario_MariaGajardo_205215034 usuarioBuscado = null;
        for(Usuario_MariaGajardo_205215034 u : b.getUsuarios()){
            if(u.getNombre().equalsIgnoreCase(nombre)){
                usuarioBuscado = u;
                break;
            }
        }
        if(usuarioBuscado != null){
            int deuda = b.obtenerDeuda(usuarioBuscado);
            System.out.println("La deuda del usuario es: $" + deuda);
        } else {
            System.out.println("El usuario no existe.");
        }
    }
    /**
     * Permite ver la fecha de vencimiento de un prestamo por pantalla, sino muestra mensaje de error
     * @param b
     */
    public static void obtenerFechaVencimiento(Biblioteca_MariaGajardo_205215034 b){
    System.out.println("Ingresa el id del prestamo:");
    int id = Main.scanner.nextInt();
    Prestamo_MariaGajardo_205215034 p = null;
    for(Prestamo_MariaGajardo_205215034 prestamo : b.getPrestamos()){
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
    /**
     * Permite ver el numero de dias de retraso que tiene un  prestamo, retorna el estado por mensaje en la consola
     * o muestra un mensaje de error
     * @param b
     */
    public static void calcularDiasRetraso(Biblioteca_MariaGajardo_205215034 b){
        System.out.println("Ingresa el id del prestamo:");
        int id = Main.scanner.nextInt();
        Prestamo_MariaGajardo_205215034 p = null;
        for(Prestamo_MariaGajardo_205215034 prestamo : b.getPrestamos()){
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


