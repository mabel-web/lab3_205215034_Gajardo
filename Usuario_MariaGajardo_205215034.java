/**
 * TDA que representa el usuario de la biblioteca
 * @author Maria Belen Gajardo
 * version 1.0.0
 */
public class Usuario_MariaGajardo_205215034 {
    private int idUsuario;
    private String nombre;
    private int deuda;
    private boolean activo;

    /**
     * Es el constructor del UsuarioMariaGajardo205215034
     * @param idUsuario identificador del usuario
     * @param nombre es el nombre del usuario
     */
    public Usuario_MariaGajardo_205215034(int idUsuario, String nombre){
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.deuda = 0;
        this.activo = true;
    }
    /**
     *Metodos
     *devuelve el idUsuario del usuario
     *
     * @return idUsuario
     */
    public int getIdUsuario(){
        return idUsuario;
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

    public boolean isActivo(){
        return activo;
    }
    /**
     *Modifica el estado del usuario
     *
     */
    public void setActivo(boolean activo){
        this.activo = activo;
    }
}