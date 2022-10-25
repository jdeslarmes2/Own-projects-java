
package udi.caritas.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import udi.caritas.logica.Alumno;
import udi.caritas.logica.Escuela;
import udi.caritas.logica.Pariente;
import udi.caritas.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    AlumnoJpaController alumnoJpa = new AlumnoJpaController();
    ParientesJpaController parientesJpa = new ParientesJpaController();
    EscuelaJpaController escuelaJpa = new EscuelaJpaController();

    public void guardar(Alumno alumno, Pariente parientes, Escuela escuelaAlumno) {
        
        //Creo el la BD el alumno primero dado que las relaciones one to one son desde los parientes y escuela hacia el alumno

        parientesJpa.create(parientes);
        
        escuelaJpa.create(escuelaAlumno);
        
        alumnoJpa.create(alumno);
        
    }

    public List<Alumno> traerAlumnos() {
       
        return alumnoJpa.findAlumnoEntities();
        
        
    }

    public void borrarAlumno(int num_alumno) {
        try {
            alumnoJpa.destroy(num_alumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int num_alumno) {
        
       return alumnoJpa.findAlumno(num_alumno);
        
    }

    public void modificarAlumno(Alumno alum) {
        try {
            alumnoJpa.edit(alum);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Escuela traerEscuela(int id_escuela) {
        return escuelaJpa.findEscuela(id_escuela);
    }

    public void modificarEscuela(Escuela escuel) {
        try {
            escuelaJpa.edit(escuel);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pariente traerPariente(int id_Familiar) {
        return parientesJpa.findParientes(id_Familiar);
    }

    public void modificarPariente(Pariente parien) {
        try {
            parientesJpa.edit(parien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
