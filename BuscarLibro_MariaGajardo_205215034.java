import java.util.List;

/**
 * Busca un libro segun el criterio elegido
 *
 * @param libros lista de libros de la biblioteca
 * @param criterio valor elegido para la busqueda
 * @return libro encontrado o null
 */
public abstract class BuscarLibro_MariaGajardo_205215034 {
    public abstract LibroMariaGajardo_205215034 buscarL(List<LibroMariaGajardo_205215034> libros, String criterio);
    protected String formatear(String texto){
        return texto.toLowerCase();
     }
    }

