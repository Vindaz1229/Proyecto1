package Proyecto.Graphics.Empleados;

import Proyecto.Logic.Empleado;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModel extends AbstractTableModel{
    List<Empleado> rows;
    int [] cols;

    public TableModel(List<Empleado> rows, int[] cols) {
        initColNames();
        this.rows = rows;
        this.cols = cols;
    }

    public String getColumnName(int col){
        return colNames[cols[col]];
    }
    public Class<?> getColumnClass(int col){
        switch (cols[col]){
            default: return super.getColumnClass(col);
        }
    }


    public int getRowCount() {
        return rows.size();
    }


    public int getColumnCount() {
        return cols.length;
    }


    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado empleado = rows.get(rowIndex);
        switch (cols[columnIndex]){
            case CEDULA: return empleado.getCedula();
            case NOMBRE: return empleado.getNombre();
            default: return "";
        }
    }
    public static final int CEDULA = 0;
    public static final int NOMBRE = 1;
    public static final int TELEFONO = 2;
    public static final int SUCURSAL = 3;
    String [] colNames = new String [4];
    private void initColNames(){
        colNames[CEDULA] = "Cedula";
        colNames[NOMBRE] = "Nombre";
        colNames[TELEFONO] = "Telefono";
        colNames[SUCURSAL] = "Sucursal";
    }
}
