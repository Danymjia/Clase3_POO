public class Zapato {

    float talla;
    String marca;
    String color_zapato;

    public Zapato(float talla, String marca, String color_zapato) {
        this.talla = talla;
        this.marca = marca;
        this.color_zapato = color_zapato;
    }

    public Zapato() {
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor_zapato() {
        return color_zapato;
    }

    public void setColor_zapato(String color_zapato) {
        this.color_zapato = color_zapato;
    }
}

