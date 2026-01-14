/**
 * TDA que representa un libro de la biblioteca
 */
public class LibroMariaGajardo_205215034 {
    private int idLibro;
    private String autor;
    private String titulo;
    private boolean disponibilidad;
    /**
     * Es el constructor del libro
     * @param idLibro identificador del libro
     * @param autor es el autor del libro
     * @param titulo es el titulo del libro
     * @param disponibilidad es el estado de disponibilidad, no prestado (true) y prestado (false)
     */
    public LibroMariaGajardo_205215034(int idLibro, String autor, String titulo, boolean disponibilidad){
        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.disponibilidad = true;
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
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    /**
     * Modifica el estado de disponibilidad si el prestamo esta activo o no
     * @param disponibilidad nuevo estado del libro
     */
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }

}
