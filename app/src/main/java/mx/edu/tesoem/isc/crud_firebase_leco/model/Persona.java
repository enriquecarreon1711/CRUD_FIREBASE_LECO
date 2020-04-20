package mx.edu.tesoem.isc.crud_firebase_leco.model;

public class Persona {

    private String uidp;
    private String Nomp;
    private String Apep;
    private String Correo;
    private String Password;

    public Persona() {
    }

    public String getUid() {
        return uidp;
    }

    public void setUid(String uidp) {
        this.uidp = uidp;
    }

    public String getNomp() {
        return Nomp;
    }

    public void setNomp(String nomp) {
        Nomp = nomp;
    }

    public String getApep() {
        return Apep;
    }

    public void setApep(String apep) {
        Apep = apep;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return Nomp;
    }
}
