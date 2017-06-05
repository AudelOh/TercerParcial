package Controlador;

import Tablas.Libros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controlador {

    private HashSet<Libros> basedatos;

    public Controlador() {
        File file = new File("inventario.dat");
        if (file.exists()) {
            basedatos = cargarLibros();
        } else {
            basedatos = new HashSet<>();
        }
    }

    private HashSet<Libros> cargarLibros() {
        try {
            File file = new File("inventario.dat");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(input);

            HashSet<Libros> retorno = (HashSet<Libros>) reader.readObject();

            reader.close();
            input.close();

            return retorno;
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
        return null;
    }

    public void agregar(Libros l) throws LibroExistenteException {
        if (!basedatos.add(l)) {
            throw new LibroExistenteException();
        }
    }

    public void guardar() {
        try {
            File file = new File("inventario.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(output);

            System.out.println("Guardado");
            for (Libros registro : basedatos) {
                System.out.println(registro);
            }
            System.out.println("Guardado");

            writer.writeObject(basedatos);
            writer.close();
            output.close();
        } catch (IOException ex) {

        }
    }

    
    public Object[] obtenerDatos(){        
        return basedatos.toArray();
    }
    
    public Libros buscar(int idx){
        Object[] objs = basedatos.toArray();
        Libros producto = (Libros)objs[idx];
        return producto;
    }
    
    
    
}