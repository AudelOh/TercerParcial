/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Controlador.Controlador;
import Tablas.Libros;
import javax.swing.table.AbstractTableModel;
import java.util.HashSet;

/**
 *
 * @author AudelGS
 */
public class LibrosModel extends AbstractTableModel{
    private Controlador oController;
    private Object[] Libros;
    
    public LibrosModel(Controlador c){
        oController = c;
        Libros = c.obtenerDatos();
    }

    @Override
    public int getRowCount() {
        Libros = oController.obtenerDatos();                   
        return Libros.length;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libros = oController.obtenerDatos();           
        Libros l = (Libros)Libros[rowIndex];
        switch (columnIndex) {
            case 0: return l.getCodigo();
            case 1: return l.getTitulo();
            case 2: return l.getAutor();
            case 3: return l.getEditorial();
            case 4: return l.getISBN();
            case 5: return l.getNoEjemplares();
            default:
                throw new AssertionError();
        }
    }
    
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Codigo";
            case 1: return "Titulo";
            case 2: return "Autor";
            case 3: return "Editorial";
            case 4: return "ISBN";
            case 5: return "N°Ejemplares";
                
            default:
                throw new AssertionError();
        }
    }
}


