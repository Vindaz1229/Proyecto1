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
            case TELEFONO: return empleado.getTelefono();
            case SALARIO: return empleado.getSalario();
            case SUCURSAL: return empleado.getSucursal();
            default: return "";
        }
    }
    public static final int CEDULA = 0;
    public static final int NOMBRE = 1;
    public static final int TELEFONO = 2;
    public static final int SALARIO = 3;
    public static final int SUCURSAL = 4;
    String [] colNames = new String [5];
    private void initColNames(){
        colNames[CEDULA] = "Cedula";
        colNames[NOMBRE] = "Nombre";
        colNames[SALARIO] = "Salario";
        colNames[TELEFONO] = "Telefono";
        colNames[SUCURSAL] = "Sucursal";
    }
}
