public class Serie {

    //Atributos
    String nombre_serie;
    String casa_productora;
    String duracion_serie;

    //metodos

    //constructor
    public Serie(String nombre_serie, String casa_productora, String duracion_serie) {
        this.nombre_serie = nombre_serie;
        this.casa_productora = casa_productora;
        this.duracion_serie = duracion_serie;
    }

    //Constructor vacio
    public Serie() {

    }

    //getters
    public String getNombre_serie() {
        return nombre_serie;
    }

    public String getDuracion_serie() {
        return duracion_serie;
    }

    public String getCasa_productora() {
        return casa_productora;
    }

    //Setters

    public void setNombre_serie(String nombre_serie) {
        this.nombre_serie = nombre_serie;
    }

    public void setDuracion_serie(String duracion_serie) {
        this.duracion_serie = duracion_serie;
    }

    public void setCasa_productora(String casa_productora) {
        this.casa_productora = casa_productora;
    }
}

