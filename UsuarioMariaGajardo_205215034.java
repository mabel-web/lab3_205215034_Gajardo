/**
 * TDA que representa el usuario de la biblioteca
 */
public class UsuarioMariaGajardo205215034 {
    private int id;
    private String nombre;

    /**
     * Es el constructor del UsuarioMariaGajardo205215034
     * @param id identificador del usuario
     * @param nombre es el nombre del usuario
     */
    public UsuarioMariaGajardo205215034(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    /**
     *Metodos
     *devuelve el id del usuario
     *
     * @return id
     */
    public int getId(){
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
}