import java.util.List;

/**
 * Busca un libro segun el criterio elegido
 *

 * @return libro encontrado o null
 */
public abstract class BuscarLibro_MariaGajardo_205215034 {
    public abstract Libro_MariaGajardo_205215034 buscarL(List<Libro_MariaGajardo_205215034> libros, String criterio);
    protected String formatear(String texto){
        return texto.toLowerCase();
     }
    }

