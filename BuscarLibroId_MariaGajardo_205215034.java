import java.util.List;

public class BuscarLibroId_MariaGajardo_205215034 extends BuscarLibro_MariaGajardo_205215034 {
    @Override
    public LibroMariaGajardo_205215034 buscarL(List<LibroMariaGajardo_205215034> libros, String criterio){
        int id = Integer.parseInt(criterio);
        for (LibroMariaGajardo_205215034 l : libros){
            if (l.getIdLibro() == id){
                return l;
            }
        }
        return null;


    }
}
