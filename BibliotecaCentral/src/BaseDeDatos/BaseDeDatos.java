
package BaseDeDatos;

import Controlador.Controlador;
import Controlador.LibroExistenteException;
import Tablas.Libros;

/**
 *
 * @author AudelGS
 */
public class BaseDeDatos {
    
    public static void main(String[] args) {

        Controlador controlador = new Controlador();

        
        Libros sabritas = new Libros("SAB-CHET", "Chetos bolita", "asdf","asdf", "1234",1234);
        Libros cahuama = new Libros("SAB-CHE", "Cheto bolita", "asdf","asdf", "1234",124);
        Libros cahuama2 = new Libros("SAB-CHT", "Chets bolita", "asdf","asdf", "1234",123);

        try {
            controlador.agregar(cahuama);
            controlador.agregar(sabritas);
            controlador.agregar(cahuama2);
            
        } catch (LibroExistenteException ex) {
            System.out.println("Producto repetido");
        }
        
        Object[] Libros = controlador.obtenerDatos();
        
        for (Object Libritos : Libros) {
            System.out.println((Libros)Libritos);
        }
        
        controlador.guardar();

    
}
}
