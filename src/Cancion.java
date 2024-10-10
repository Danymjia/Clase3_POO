public class Cancion {

    //Atributos
    String nombre;
    String cantautor;
    String productora;
    String duracion;

    //metodos

    //constructor
    public Cancion(String nombre, String cantautor, String productora, String duracion) {
        this.nombre = nombre;
        this.cantautor = cantautor;
        this.productora = productora;
        this.duracion = duracion;
    }

    //Constructor vacio
    public Cancion() {

    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getCantautor() {
        return cantautor;
    }

    public String getProductora() {
        return productora;
    }

    public String getDuracion() {
        return duracion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantautor(String cantautor) {
        this.cantautor = cantautor;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }
}
