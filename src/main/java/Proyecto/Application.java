package Proyecto;



import javax.swing.*;

public class Application {
    public static JFrame window;
    public static Proyecto.Graphics.MainTabbedPane.Controller mainController;
    public static Proyecto.Graphics.Empleados.Controller empleadosController;

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e){}

        Proyecto.Graphics.Empleados.View empleadosView = new Proyecto.Graphics.Empleados.View();
        Proyecto.Graphics.Empleados.Model empleadosModel = new Proyecto.Graphics.Empleados.Model();
        empleadosController = new Proyecto.Graphics.Empleados.Controller(empleadosView,empleadosModel);

        Proyecto.Graphics.MainTabbedPane.View mainView = new Proyecto.Graphics.MainTabbedPane.View();
        Proyecto.Graphics.MainTabbedPane.Model mainModel  = new Proyecto.Graphics.MainTabbedPane.Model();
        mainController = new Proyecto.Graphics.MainTabbedPane.Controller(mainView, mainModel);


        mainView.getTabbedPane().add("Empleados", empleadosView.getPanel());
        mainView.getTabbedPane().add("Sucursales",new JPanel());
        mainView.getTabbedPane().add("Acerca De",new JPanel());

        window = new JFrame();
        window.setSize(400,300);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("SISTEMA...");
        window.setVisible(true);
        mainController.show();

    }
}
