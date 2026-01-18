import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 * TDA que representa la biblioteca
 */
public class BibliotecaMariaGajardo_205215034 {
    private int idIncrPrestamos;
    private int idIncrLibros;
    private int idIncrUsuarios;
    private int idIncrBibliotecas;
    private List<LibroMariaGajardo_205215034> libros;
    private List<UsuarioMariaGajardo_205215034> usuarios;
    private List<PrestamoMariaGajardo_205215034> prestamos;
    private int maxLibrosUsuario;
    private int diasMaxPrestamo;
    private int tasaMultaDiaria;
    private int limiteDeudaMax;
    private int diasRetrasoMax;
    private LocalDate fechaInicial;
    /**
     * Constructor biblioteca
     *
     * @param maxLibrosUsuario es el maximo numero de libros que puede pedir el usuario
     * @param diasMaxPrestamo es el numero maximo de prestamo que puede tener un libro
     * @param tasaMultaDiaria es la multa que recibe el usuario por dias de retraso
     * @param limiteDeudaMax deuda maxima que puede llegar a tener un usuario antes de ser suspendido
     * @param diasRetrasoMax dias de retraso antes de la suspension
     * @param fechaInicial fecha inicia del sistema
     */
    public BibliotecaMariaGajardo_205215034(int maxLibrosUsuario, int diasMaxPrestamo, int tasaMultaDiaria, int limiteDeudaMax, int diasRetrasoMax, LocalDate fechaInicial){
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.maxLibrosUsuario = maxLibrosUsuario;
        this.diasMaxPrestamo = diasMaxPrestamo;
        this.tasaMultaDiaria = tasaMultaDiaria;
        this.limiteDeudaMax = limiteDeudaMax;
        this.diasRetrasoMax = diasRetrasoMax;
        this.fechaInicial = LocalDate.now(); ////////no entiendooo si es fecha real o falsa del sistema

        this.idIncrUsuarios = 0;
        this.idIncrLibros = 0;
        this.idIncrPrestamos = 0;
        this.idIncrBibliotecas = 0;

    }
    /**
     *Devuelve la lista de libros de la biblioteca
     *
     * @return libros
     */
    public List<LibroMariaGajardo_205215034> getLibros() {
        return libros;
    }
    /**
     *Devuelve la lista de usuarios de la biblioteca
     *
     * @return usuarios
     */
    public List<UsuarioMariaGajardo_205215034> getUsuarios() {
        return usuarios;
    }
    /**
     *Devuelve la lista de prestamos de la biblioteca
     *
     * @return prestamos
     */
    public List<PrestamoMariaGajardo_205215034> getPrestamos() {
        return prestamos;
    }

    /**
     *Devuelve el numero de libros max
     *
     * @return maxLibrosUsuario
     */
    public int getMaxLibrosUsuario() {
        return maxLibrosUsuario;
    }
    /**
     *Devuelve los dias max de prestamo del libro
     *
     * @return diasMaxPrestamo
     */
    public int getDiasMaxPrestamo() {
        return diasMaxPrestamo;
    }
    /**
     *Devuelve el numero de la tasa multa diaria de retraso
     *
     * @return tasaMultaDiaria
     */
    public int getTasaMultaDiaria() {
        return tasaMultaDiaria;
    }
    /**
     *Devuelve el limite de la deuda maxima
     *
     * @return limiteDeudaMax
     */
    public int getLimiteDeudaMax() {
        return limiteDeudaMax;
    }
    /**
     *Devuelve los dias de retraso maximo
     *
     * @return diasRetrasoMax
     */
    public int getDiasRetrasoMax() {
        return diasRetrasoMax;
    }

    /**
     *Devuelve la fecha inicial del sistema    /FECHA INICIAL
     *
     * @return diasRetrasoMax
     */
    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    /**
     *RF03 TDA Usuario - constructor BORRADOR
     *
     * @return nuevoUsuario
     */
    public UsuarioMariaGajardo_205215034 crearUsuario(String nombre){
        UsuarioMariaGajardo_205215034 u = new UsuarioMariaGajardo_205215034(idIncrUsuarios, nombre);
        usuarios.add(u);
        idIncrUsuarios++;
        return u;
    }
    /**
     *RF04 TDA Libro - constructor
     *
     * @param autor
     * @param titulo
     * @return l
     */
    public LibroMariaGajardo_205215034 crearLibro(String autor, String titulo){
        LibroMariaGajardo_205215034 l = new LibroMariaGajardo_205215034(idIncrLibros, autor, titulo);
        libros.add(l);
        idIncrLibros++;
        return l;
    }


    /**
    *RF05 TDA Prestamo - constructor /////////7
    *
     * @param usuario
     * @param libro
    * @return nuevoPrestamo
    */
    public PrestamoMariaGajardo_205215034 crearPrestamo(UsuarioMariaGajardo_205215034 usuario, LibroMariaGajardo_205215034 libro){
        PrestamoMariaGajardo_205215034 p = new PrestamoMariaGajardo_205215034(usuario, libro, fechaInicial, fechaInicial.plusDays(diasMaxPrestamo));
        prestamos.add(p);
        idIncrPrestamos++;
        return p;
}
    /**
     *RF07 agregarLibro
     * Agrega un libro a la biblioteca, si el id ya existe no se agrega y entrega null, sino
     * se agrega y retorna el libro
     *
     * @param titulo
     * @param autor
     * @return libro nuevo
     */

    public LibroMariaGajardo_205215034 agregarLibro(String titulo, String autor){
        for (LibroMariaGajardo_205215034 libro : libros){ //no se si necesario xq al agregar uno deberia aumentar siosi el id
            if (libro.getIdLibro() == idIncrLibros){
                return null;
            }
        }

        LibroMariaGajardo_205215034 l = new LibroMariaGajardo_205215034(idIncrLibros, titulo, autor);
        libros.add(l);
        idIncrLibros++;
        return l;

}

    /**
     *RF08 registrarUsuario
     * Registra un usuario en el sistema, inciia con deuda 0 y estado activo(true), si ya existe no se agrega
     *
     * @param nombre nombre del usuario
     * @return usuario registrado
     */

    public BibliotecaMariaGajardo_205215034 registrarUsuario(String nombre){
        UsuarioMariaGajardo_205215034 u = new UsuarioMariaGajardo_205215034(idIncrUsuarios, nombre);
        usuarios.add(u);
        idIncrUsuarios++;
        return u;
    }

    /**
     *RF09 obtenerUsuario
     * Busca usuario por id
     *
     * @param idUsuario identificador del usuario
     * @return u  buscado o null
     */
    public UsuarioMariaGajardo_205215034 obtenerUsuario(int idUsuario){
        for(UsuarioMariaGajardo_205215034 usuario : usuarios){
            if(usuario.getIdUsuario() == idUsuario){
                return usuario;
            }
        }
        return null;
    }

    /**
     *RF10 buscarLibro
     * Busca libro por "id", "titulo" o "autor"
     *
     */
    public LibroMariaGajardo_205215034 buscarLibro(BuscarLibro_MariaGajardo_205215034 busqueda, String criterio){
        return busqueda.buscarL(libros, criterio);
    }

    /**
     *RF11 isLibroDisponible
     * Verifica si un libro esta disponible (no prestado)
     *
     * @param l libro a verificar
     * @return boolean si esta disponible true sino false
     */

    public boolean isLibroDisponible(LibroMariaGajardo_205215034 l){
        return l.isDisponible();
    }
    /**
     *RF12 isUsuarioSuspendido
     * Verifica el estado del usuario
     *
     * @param u usuario a verificar
     * @return boolean si está activo true sino false
     */

    public boolean isUsuarioSuspendido(UsuarioMariaGajardo_205215034 u){
        return !u.isActivo();
    }

    /**
     * RF13 getFecha
     *
     *Obtiene fecha actual del sistema desde la biblioteca FECHA ACTUAL
     * @return fecha actual
     */
    public LocalDate getFecha(){
        return LocalDate.now();
    }
    /**
     *RF14 obtenerDeuda
     *
     * Retorna la deuda acumulada por el usuario
     *
     * @return deuda
     */
    public int obtenerDeuda(UsuarioMariaGajardo_205215034 u){
        return u.getDeuda();
    }

    /**
     * RF15 obtenerFechaVencimiento
     *
     * Calcula fecha de vencimiento sumando dias solicitados a fecha de prestamo
     */
    public LocalDate obtenerFechaVencimiento(LocalDate fechaInicial, int diasSolicitados){
        return fechaInicial.plusDays(diasSolicitados);
    }

    /**
     * RF16 calcularDiasRetraso
     *
     * Calcula dias de retraso entre fecha de vencimiento y fecha actual
     * Retorna 0 si no hay retraso
     */
    public int calcularDiasRetraso(int diasSolicitados, LocalDate fecha){
        LocalDate fechaVencimiento = obtenerFechaVencimiento(fechaInicial, diasSolicitados);
        long diasRetraso = ChronoUnit.DAYS.between(fechaVencimiento, fecha);
        return (diasRetraso > 0) ? (int) diasRetraso : 0;
    }

}