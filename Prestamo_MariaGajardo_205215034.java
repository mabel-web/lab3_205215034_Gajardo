import java.time.LocalDate;

/**
 * TDA que representa un prestamo de la biblioteca
 * @author Maria Belen Gajardo
 * version 1.0.0
 */
public class Prestamo_MariaGajardo_205215034 {
    private int idPrestamo;
    private int idUsuario;
    private int idLibro;
    private LocalDate fecha;
    private int diasSolicitados;
    /**
     * Constructor del prestamo
     * @param idLibro identificador del libro
     * @param idUsuario identificador del usuario que solicita
     * @param fecha fecha inicial del prestamo
     * @param diasSolicitados numero de dias del prestamo
     */
    public Prestamo_MariaGajardo_205215034(int idPrestamo, int idUsuario, int idLibro, LocalDate fecha, int diasSolicitados){
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fecha = fecha;
        this.diasSolicitados = diasSolicitados;
    }
    /**
     *Devuelve el identificador del prestamo
     *
     * @return idPrestamo
     */
    public int getIdPrestamo() {
        return idPrestamo;
    }
    /**
     *Devuelve el identificador del usuario
     *
     * @return idUsuario
     */
    public int getIdUsuario(){
        return idUsuario;
    }
    /**
     *Devuelve el identificador del libro
     *
     * @return idLibro
     */
    public int getIdLibro() {
        return idLibro;
    }
    /**
     *Devuelve la fecha inicial del prestamo
     *
     * @return fecha
     */
    public LocalDate getFecha(){
        return fecha;
    }
    /**
     *Devuelve los dias totales del prestamo
     *
     * @return diasSolicitados
     */
    public int getDiasSolicitados(){
        return diasSolicitados;
    }
}


