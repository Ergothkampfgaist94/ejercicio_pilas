package ejercicio_pilas;

public class clsPasajero {

    private String IdPasajero;
    private String Pasaporte;
    private String Nombre;
    private String Apellidos;
    private String FechaNacimiento;
    private int CantPersonas;
    private String DatosPers;
    private String TotalFactura;

    public clsPasajero() {
        this.IdPasajero = null;
        this.Pasaporte = null;
        this.Nombre = null;
        this.Apellidos = null;
        this.FechaNacimiento = null;
        this.CantPersonas = 0;
        this.DatosPers = null;
        this.TotalFactura = null;
    }

    public clsPasajero(String IdPasajero, String Pasaporte, String Nombre, String Apellidos, String FechaNacimiento, int CantPersonas, String DatosPers, String TotalFactura) {
        this.IdPasajero = IdPasajero;
        this.Pasaporte = Pasaporte;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.CantPersonas = CantPersonas;
        this.DatosPers = DatosPers;
        this.TotalFactura = TotalFactura;
    }

    public String getIdPasajero() {
        return IdPasajero;
    }

    public void setIdPasajero(String IdPasajero) {
        this.IdPasajero = IdPasajero;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public void setPasaporte(String Pasaporte) {
        this.Pasaporte = Pasaporte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getCantPersonas() {
        return CantPersonas;
    }

    public void setCantPersonas(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public String getDatosPers() {
        return DatosPers;
    }

    public void setDatosPers(String DatosPers) {
        this.DatosPers = DatosPers;
    }

    public String getTotalFactura() {
        return TotalFactura;
    }

    public void setTotalFactura(String TotalFactura) {
        this.TotalFactura = TotalFactura;
    }

}
