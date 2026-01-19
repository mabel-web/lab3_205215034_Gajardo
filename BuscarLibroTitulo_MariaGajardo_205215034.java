import java.util.List;
/**
 * Clase hija de BuscarLibro , permite buscar el libro parcialmente por el titulo
 *@author Maria Belen Gajardo
 * version 1.0.0
 */
public class BuscarLibroTitulo_MariaGajardo_205215034 extends BuscarLibro_MariaGajardo_205215034 {
    @Override
    public Libro_MariaGajardo_205215034 buscarL(List<Libro_MariaGajardo_205215034> libros, String criterio){
        String titulo = formatear(criterio);
        for (Libro_MariaGajardo_205215034 l : libros){
            if (formatear(l.getTitulo()).contains(titulo)){
                return l;
            }
        }
        return null;
    }

}
