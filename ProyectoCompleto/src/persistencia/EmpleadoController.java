
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Empleado;
import persistencia.exceptions.NonexistentEntityException;

public class EmpleadoController {
    
    //instanciamos la clase EmpleadoJPA
    
    EmpleadoJpaController empJPA = new EmpleadoJpaController();
    
    //metodo para insertar Empleado
    public void crearEmpleado(Empleado emp){
        try {
            empJPA.create(emp);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para eliminar empleado
    public void eliminarEmpleado(int i) {
        try {
            empJPA.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(EmpleadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo para editar empleado
    public void modificarEmpleado(Empleado emp) {
        try {
            empJPA.edit(emp);
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> listarEmpleado = empJPA.findEmpleadoEntities();
        
        return listarEmpleado;
    }

    public Empleado buscarUnEmpleado(int id) {
        Empleado emp = empJPA.findEmpleado(id);
        return emp;
    }

      
    
}
