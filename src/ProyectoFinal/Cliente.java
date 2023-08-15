package ProyectoFinal;

public class Cliente implements Comparable <Cliente> {
       
    String ApellyNom, DNI, Fechanac, Telefono, Domicilio, Provincia, Localidad, Mail;

    public Cliente(String ApellyNom, String DNI, String Fechanac, String Telefono, String Domicilio, String Provincia, String Localidad, String Mail) {
        
        this.ApellyNom = ApellyNom;
        this.DNI = DNI;
        this.Fechanac = Fechanac;
        this.Telefono = Telefono;
        this.Domicilio = Domicilio;
        this.Provincia = Provincia;
        this.Localidad = Localidad;
        this.Mail = Mail;
    }

    public String getApellyNom() {
        return ApellyNom;
    }

    public void setApellyNom(String ApellyNom) {
        this.ApellyNom = ApellyNom;
    }
            
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechanac() {
        return Fechanac;
    }

    public void setFechanac(String Fechanac) {
        this.Fechanac = Fechanac;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    @Override
    public int compareTo(Cliente p) {
        return ApellyNom.compareTo(p.getApellyNom());
    }
            
}
