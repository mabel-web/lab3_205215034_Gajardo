import java.util.List;
import java.util.ArrayList;
/**
 * TDA que representa el usuario de la biblioteca
 */
public class UsuarioMariaGajardo_205215034 {
    private int id;
    private String nombre;
    private int deuda;
    private boolean activo;
    private List<LibroMariaGajardo_205215034> librosPrestados;

    /**
     * Es el constructor del UsuarioMariaGajardo205215034
     * @param id identificador del usuario
     * @param nombre es el nombre del usuario
     */
    public UsuarioMariaGajardo_205215034(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.deuda = 0;
        this.activo = true;
        this.librosPrestados = new ArrayList<>();
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