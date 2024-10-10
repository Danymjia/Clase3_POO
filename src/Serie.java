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

    public void imprimir_serie() {
        System.out.println("El tìtulo es: " + this.nombre_serie);
        System.out.println("La casa productora es: " + this.casa_productora);
        System.out.println("La duracion es de: " + this.duracion_serie);
        System.out.println("----------------------------------------------");
    }

}
