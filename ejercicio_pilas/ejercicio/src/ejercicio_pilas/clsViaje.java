package ejercicio_pilas;

public class clsViaje {

    private String IdViaje;
    private String Destino;
    private String Origen;
    private float CostoUni;
    private String IdVuelo;
    private String IdHotel;

    public clsViaje() {
    }

    public clsViaje(String IdViaje, String Destino, String Origen, float CostoUni, String IdVuelo, String IdHotel) {
        this.IdViaje = IdViaje;
        this.Destino = Destino;
        this.Origen = Origen;
        this.CostoUni = CostoUni;
        this.IdVuelo = IdVuelo;
        this.IdHotel = IdHotel;
    }

    public String getIdViaje() {
        return IdViaje;
    }

    public void setIdViaje(String IdViaje) {
        this.IdViaje = IdViaje;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public float getCostoUni() {
        return CostoUni;
    }

    public void setCostoUni(float CostoUni) {
        this.CostoUni = CostoUni;
    }

    public String getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(String IdVuelo) {
        this.IdVuelo = IdVuelo;
    }

    public String getIdHotel() {
        return IdHotel;
    }

    public void setIdHotel(String IdHotel) {
        this.IdHotel = IdHotel;
    }

}
