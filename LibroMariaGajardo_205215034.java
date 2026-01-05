public class LibroMariaGajardo205215034 {
    private int id;
    private String autor;
    private String titulo;
    private boolean disponibilidad;

    public LibroMariaGajardo205215034(int id, String autor, String titulo, boolean disponibilidad){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.disponibilidad = disponibilidad
    }

    public int getId(){
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean getDisponibilidad(){
        return disponibilidad;
    }
}
