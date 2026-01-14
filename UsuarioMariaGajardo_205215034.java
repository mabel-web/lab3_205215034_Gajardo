/**
 * TDA que representa el usuario de la biblioteca
 */
public class UsuarioMariaGajardo205215034 {
    private int id;
    private String nombre;
    private int deuda;
    private boolean estado;
    private List<LibroMariaGajardo_205215034> librosPrestados;

    /**
     * Es el constructor del UsuarioMariaGajardo205215034
     * @param id identificador del usuario
     * @param nombre es el nombre del usuario
     * @param deuda es el lo que debe el usuario po retrasos
     * @param estado es activado/suspendido del usuario
     */
    public UsuarioMariaGajardo205215034(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.deuda = 0;
        this.suspendido = true;
        this.librosPrestados = newArrayList<>();
    }
    /**
     *Metodos
     *devuelve el id del usuario
     *
     * @return id
     */
    public int getIdUsuario(){
        return id;
    }
    /**
     *devuelve el nombre del usuario
     *
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     *devuelve la deuda del usuario
     *
     * @return deuda
     */
    public int getDeuda(){
        return deuda;

    }

    public boolean getEstado(){
        return estado;
    }


}