
package logica;

import igu.Pantalla1;
import java.util.Date;
import java.util.List;
import javax.swing.UIManager;
import persistencia.EmpleadoController;


public class TestProyecto {

    public static void main(String[] args)throws Exception { //   para los form
        
        String aVisual = "com.jtattoo.plaf.fast.FastLookAndFeel";
        UIManager.setLookAndFeel(aVisual);
        
        //          Iniciar Formulario 
        Pantalla1 pant1 = new Pantalla1();
        pant1.setVisible(true);
//        
        
        //pant1.setLocation(null); //ubicación en el centro de la pantalla1
        
        
    
        //creamos objeto empleado para pasar parámetros
//        Empleado emp = new Empleado(55555, "williAM", "Esquivel", new Date("09/11/1980"));
        
        //instanciamos clase Controller para acceder a los metodos del CRUD
//        EmpleadoController control = new EmpleadoController();
        
//            control.crearEmpleado(emp);
//            //control.eliminarEmpleado(55555);
//        emp.setApellido("Rodriguez");
//        emp.setNombre("Victor");
//        control.modificarEmpleado(emp);
            
//          //metodo para traer listado de todos los empleados
//        List<Empleado> listaemp = control.listarEmpleados();
//    
//        
//        System.out.println("\n LISTADO DE EMPLEADOS");
//        listaemp.forEach(emp -> {
//            System.out.println(emp.getNombre() + " " + emp.getApellido() + " " + emp.getDni() + " " + emp.getFechaIngreso());
//        });
//        
//        //metodo para traer un empleado
//        Empleado unEmpleado = control.buscarUnEmpleado(30076379);
//        System.out.println(unEmpleado.getNombre() + " " + unEmpleado.getApellido() + " " + unEmpleado.getDni() + " " + unEmpleado.getFechaIngreso());
        
    }
    
}
