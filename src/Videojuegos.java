public class Videojuegos {

    String nombre;
    String genero;
    String anio;
    String desarrolladora;

    //Constructor
    public Videojuegos(String nombre, String genero, String anio, String desarrolladora) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.desarrolladora = desarrolladora;
    }

    //Constructor vacio
    public Videojuegos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    //Metodos personalizados



}

