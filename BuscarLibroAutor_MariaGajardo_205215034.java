import java.util.List;

public class BuscarLibroAutor_MariaGajardo_205215034 extends BuscarLibro_MariaGajardo_205215034{
    @Override
    public LibroMariaGajardo_205215034 buscarL(List<LibroMariaGajardo_205215034> libros, String criterio){
        String autor = formatear(criterio);
        for(LibroMariaGajardo_205215034 l : libros){
            if (formatear(l.getAutor()).contains(autor)){
                return l;
            }
        }
    return null;
    }
}
