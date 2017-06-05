
package Tablas;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author AudelGS
 */
public class Usuarios implements Serializable{
    private String Nombre;
    private String Roll;
    private String Contraseña;
    private String Acceso;
    
    public Usuarios (){
        this.Nombre ="";
        this.Roll= "";
        this.Contraseña= "";
        this.Roll= "Bloqueado";
    }

    public Usuarios(String Nombre, String Roll, String Contraseña, String Acceso) {
        this.Nombre = Nombre;
        this.Roll = Roll;
        this.Contraseña = Contraseña;
        this.Acceso = Acceso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        return true;
        } 

    @Override
    public String toString() {
        return "Usuarios{" + "Nombre=" + Nombre + ", Roll=" + Roll + ", Contrase\u00f1a=" + Contraseña + ", Acceso=" + Acceso + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getAcceso() {
        return Acceso;
    }

    public void setAcceso(String Acceso) {
        this.Acceso = Acceso;
    }
    
    }