
package lectura_ficheros;

import java.io.Serializable;

public class personas implements Serializable{
    
    private String nombre;
    private String apellidos1;
    private String apellido2;
    private String notalenguaje;
    private String notapro;
    private String notaentornos;
    private String notasbases;
    private String notassistemas;
    private String notasfol;

    public personas(String nombre, String apellidos1, String apellido2, String notalenguaje, String notapro, String notaentornos, String notasbases, String notassistemas, String notasfol) {
        this.nombre = nombre;
        this.apellidos1 = apellidos1;
        this.apellido2 = apellido2;
        this.notalenguaje = notalenguaje;
        this.notapro = notapro;
        this.notaentornos = notaentornos;
        this.notasbases = notasbases;
        this.notassistemas = notassistemas;
        this.notasfol = notasfol;
    }

    public personas() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNotalenguaje() {
        return notalenguaje;
    }

    public String getNotapro() {
        return notapro;
    }

    public String getNotaentornos() {
        return notaentornos;
    }

    public String getNotasbases() {
        return notasbases;
    }

    public String getNotassistemas() {
        return notassistemas;
    }

    public String getNotasfol() {
        return notasfol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNotalenguaje(String notalenguaje) {
        this.notalenguaje = notalenguaje;
    }

    public void setNotapro(String notapro) {
        this.notapro = notapro;
    }

    public void setNotaentornos(String notaentornos) {
        this.notaentornos = notaentornos;
    }

    public void setNotasbases(String notasbases) {
        this.notasbases = notasbases;
    }

    public void setNotassistemas(String notassistemas) {
        this.notassistemas = notassistemas;
    }

    public void setNotasfol(String notasfol) {
        this.notasfol = notasfol;
    }

    
        
}

