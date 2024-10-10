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

    public void imprimir_cancion() {
        System.out.println("El tìtulo es: " + this.nombre);
        System.out.println("El autor es: " + this.cantautor);
        System.out.println("El productor/a es: " + this.productora);
        System.out.println("La duracion es de: " + this.duracion);
        System.out.println("----------------------------------------------");
    }

}