import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
/**
 * TDA que representa la biblioteca
 */
public class BibliotecaMariaGajardo_205215034 {
   // private List<LibroMariaGajardo205215034> libros;
   // private List<UsuarioMariaGajardo205215034> usuarios;
    //private List<PrestamoMariaGajardo_205215034> prestamos;  //creo que las listas van solo en el constructor con el this
    private int maxLibrosUsuario;
    private int diasMaxPrestamo;
    private int tasaMultaDiaria;
    private int limiteDeudaMax;
    private int diasRetrasoMax;
    private LocalDate fechaInicial; //SIN AÑO FALTA SACARLO
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
    public BibliotecaMariaGajardo_205215034(){
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
        this.maxLibrosUsuario = maxLibrosUsuario;
        this.diasMaxPrestamo = diasMaxPrestamo;
        this.tasaMultaDiaria = tasaMultaDiaria;
        this.limiteDeudaMax = limiteDeudaMax;
        this.diasRetrasoMax = diasRetrasoMax;
        this.fechaInicial = LocalDate.now();

    }
    /**
     *Devuelve la lista de libros de la biblioteca
     *
     * @return libros
     */
    public List<LibroMariaGajardo205215034> getLibros() {
        return libros;
    }
    /**
     *Devuelve la lista de usuarios de la biblioteca
     *
     * @return usuarios
     */
    public List<UsuarioMariaGajardo205215034> getUsuarios() {
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
     *RF03 TDA Usuario - constructor BORRADOR
     *
     * @return nuevoUsuario
     */
    public UsuarioMariaGajardo205215034 crearUsuario(){
        UsuarioMariaGajardo205215034 nuevoUsuario = new UsuarioMariaGajardo205215034();
        usuarios.add();
        idUsuarios++;
        return nuevoUsuario;
    }
    /**
     *RF04 TDA Libro - constructor BORRADOR
     *
     * @return nuevoLibro
     */
    public LibroMariaGajardo205215034 crearLibro(){
        LibroMariaGajardo205215034 nuevoLibro = new LibroMariaGajardo205215034();
        libros.add();
        idLibros++; //crear la variable para incrementar los ids
        return nuevoLibro;
    }
}

