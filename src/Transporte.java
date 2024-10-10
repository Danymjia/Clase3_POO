public class Transporte {

    String TipoTransporte;
    String Marca;
    String Modelo;

    public Transporte(String tipoTransporte, String marca, String modelo) {
        TipoTransporte = tipoTransporte;
        Marca = marca;
        Modelo = modelo;
    }

    public Transporte() {
    }

    public String getTipoTransporte() {
        return TipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        TipoTransporte = tipoTransporte;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
