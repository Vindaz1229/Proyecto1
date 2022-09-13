package Proyecto.Graphics.Empleados;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class View  implements Observer {
    private JPanel panel1;
    private JLabel nombreLabel;
    private JButton buscarButton;
    private JButton agregarButton;
    private JButton borrarButton;
    private JButton reporteButton;
    private JTextField NombreTextField;
    private JScrollPane scrollPane1;
    private JTable tablaEmpleados;
    Controller controller;
    Model model;

    public View() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.buscar(NombreTextField.getText());
            }
        });

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(controller.add()) {
                    controller.buscar("");
                }
            }
        });

        tablaEmpleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tablaEmpleados.getSelectedRow();
                TableModel model = (Proyecto.Graphics.Empleados.TableModel)tablaEmpleados.getModel();
                borrarButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            controller.remove(model.getValueAt(row, 0).toString());
                            controller.buscar("");

                        }
                        catch (Exception exception){}
                    }
                });
                if(e.getClickCount()==2){
                    if(controller.edit(model.getValueAt(row, 0).toString())) {
                        controller.buscar("");
                    }
                }

            }
        });
    }

    public JPanel getPanel() {
        return panel1;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        int[] cols = {TableModel.CEDULA,TableModel.NOMBRE,TableModel.TELEFONO,TableModel.SALARIO,TableModel.SUCURSAL};
        tablaEmpleados.setModel(new TableModel(model.getEmpleados(),cols));
        tablaEmpleados.setRowHeight(30);
        this.panel1.revalidate();
    }
}
