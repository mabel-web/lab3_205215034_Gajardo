/**
 * TDA que representa un libro de la biblioteca
 * @author Maria Belen Gajardo
 * version 1.0.0
 */
public class Libro_MariaGajardo_205215034 {
    private int idLibro;
    private String autor;
    private String titulo;
    private boolean disponible;
    /**
     * Es el constructor del libro
     * @param idLibro identificador del libro
     * @param autor es el autor del libro
     * @param titulo es el titulo del libro
     */
    public Libro_MariaGajardo_205215034(int idLibro, String titulo, String autor){
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    /**
     *Devuelve el identificador del libro
     *
     * @return idLibro
     */
    public int getIdLibro(){
        return idLibro;
    }
    /**
     *Devuelve el autor del libro
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }
    /**
     *Devuelve el titulo del libro
     *
     * @return titulo
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     *Devuelve el estado de disponibilidad del libro
     *
     * @return disponibilidad
     */
    public boolean isDisponible(){
        return disponible;
    }
    /**
     * Modifica el estado de disponibilidad
     * @param disponible nuevo estado del libro
     */
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

}
