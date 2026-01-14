import java.util.List;

public class BuscarLibroTitulo_MariaGajardo_205215034 extends BuscarLibro_MariaGajardo_205215034 {
    @Override
    public LibroMariaGajardo_205215034 buscarL(List<LibroMariaGajardo_205215034> libros, String criterio){
        String titulo = formatear(criterio);
        for (LibroMariaGajardo_205215034 l : libros){
            if (formatear(l.getTitulo()).contains(titulo)){
                return l;
            }
        }
        return null;
    }

}
