import java.util.List;
/**
 * Clase hija de BuscarLibro , usa busqueda exacta para buscar el libro por id
 *@author Maria Belen Gajardo
 * version 1.0.0
 */
public class BuscarLibroId_MariaGajardo_205215034 extends BuscarLibro_MariaGajardo_205215034 {
    @Override
    public Libro_MariaGajardo_205215034 buscarL(List<Libro_MariaGajardo_205215034> libros, String criterio){
        int id = Integer.parseInt(criterio);
        for (Libro_MariaGajardo_205215034 l : libros){
            if (l.getIdLibro() == id){
                return l;
            }
        }
        return null;


    }
}
