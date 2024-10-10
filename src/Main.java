//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!\n"+"----------------------------------------------");
        //para declarar el objeto
        //para instanciar una clase
        //para crear un objeto de la clase
        Libro libro1=new Libro("El resplandor","Stephen King","De bolsillo",600);
        Libro libro2=new Libro("La Bella y la Bestia","Disney","Critica",352);
        Libro libro3=new Libro("Superpoderes mentales","Tony Buzan","Planeta",272);
        Libro libro4=new Libro("En busca de la excelencia","Pablo Jacobsen","Paidós Empresa",392);
        Libro libro5=new Libro("Círculo de influencia","Cristian Arens","Paidós Empresa",144);

        Cancion cancion1=new Cancion("Situations","DaniLeigh","Brandon 'B.A.M' Hodge","3:45");
        Cancion cancion2=new Cancion("Love`s Train","Bruno Mars","D`Mile","5:07");
        Cancion cancion3=new Cancion("Heartbrak Anniversary","Giveon","Maneesh","3:18");

        Serie serie1=new Serie("Dark","Wiedemann & Berg Television","3 Temporadas");
        Serie serie2=new Serie();
        Serie serie3=new Serie("El juego del calamar","Siren Pictures Inc.","2 Temporadas");

    /*
        System.out.println(libro1.imprimircubierta());
        libro1.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro5.imprimircubierta());
        libro5.imprimir();
    */
        System.out.println(serie1.getNombre_serie());

        serie1.setNombre_serie("Mancos todos menos yo");
        System.out.println(serie1.getNombre_serie());

        serie2.setNombre_serie("The Crown");
        serie2.setDuracion_serie("Left Bank Pictures Sony Pictures Television");
        serie2.setCasa_productora("6 Temporadas");
    }
}

