
package Tablas;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author AudelGS
 */
public class Libros implements Serializable{
    private String Codigo;
    private String Titulo;
    private String Autor;
    private String Editorial;
    private String ISBN;
    private Integer NoEjemplares;
    
    public Libros (){
        this.Codigo = "";
        this.Titulo = "";
        this.Editorial = "";
        this.Autor = "";
        this.ISBN = "";
        this.NoEjemplares = 0;
    }

    public Libros(String Codigo, String Titulo, String Autor, String Editorial, String ISBN, Integer Noejemplares) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISBN = ISBN;
        this.NoEjemplares = NoEjemplares;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Codigo);
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
        final Libros other = (Libros) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Libros{" + "Codigo=" + Codigo + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Editorial=" + Editorial + ", ISBN=" + ISBN + ", NoEjemplares=" + NoEjemplares + '}';
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getNoEjemplares() {
        return NoEjemplares;
    }

    public void setNoEjemplares(Integer NoEjemplares) {
        this.NoEjemplares = NoEjemplares;
    }
    
    
    
    
}
