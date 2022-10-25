
package udi.caritas.logica;

import java.util.Date;
import java.util.List;
import udi.caritas.persistencia.ControladoraPersistencia;

/**
 *
 * @author jdeslarmes
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();


    public void guardar(String nombreAlumno, Date fechaNacimiento, String dni, String nombreFamiliar, String dniFamiliar, String telefonoFamiliar, String domicilio, String otrosDatos, String escuela, String telefonoEscuela, String docente, String turno, String grado) {
        
        
        Pariente parientes = new Pariente();
        parientes.setNombreFamiliar(nombreFamiliar);
        parientes.setTelefonoFamiliar(telefonoFamiliar);
        parientes.setDniFamiliar(dniFamiliar);
        parientes.setDomicilio(domicilio);
        parientes.setOtrosDatos(otrosDatos);

        
        Escuela escuelaAlumno = new Escuela();
        escuelaAlumno.setEscuela(escuela);
        escuelaAlumno.setGrado(grado);
        escuelaAlumno.setTelefonoEscuela(telefonoEscuela);
        
        Alumno alumno = new Alumno();
        alumno.setNombreAlumno(nombreAlumno);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setDni(dni);
        alumno.setDocente(docente);
        alumno.setTurno(turno);
        alumno.setUnaEscuela(escuelaAlumno);
        alumno.setUnaFamilia(parientes);


       controlPersis.guardar(alumno, parientes, escuelaAlumno); 
           
        
    }
    
    public List<Alumno> traerAlumnos() {
        
        return controlPersis.traerAlumnos();
        
        
    }

    public void borrarAlumno(int num_alumno) {
        controlPersis.borrarAlumno(num_alumno);
    }

    public Alumno traerAlumno(int num_alumno) {
        
        return controlPersis.traerAlumno(num_alumno);
        
    }

    public void modificarAlumno(Alumno alum, String nombreAlumno, Date fechaNacimiento, String dni, String nombreFamiliar, String dniFamiliar, String telefonoFamiliar, String domicilio, String otrosDatos, String escuela, String telefonoEscuela, String docente, String turno, String grado) {
        
        alum.setNombreAlumno(nombreAlumno);
        alum.setFechaNacimiento(fechaNacimiento);
        alum.setDni(dni);
        alum.setDocente(docente);
        alum.setTurno(turno);
        
        
        
        //Modifico alumno
        controlPersis.modificarAlumno(alum);
        
        //Seteo nuevos valores de Escuela
        Escuela escuel = this.buscarEscuela(alum.getUnaEscuela().getId_escuela());
        escuel.setEscuela(escuela);
        escuel.setGrado(grado);
        escuel.setTelefonoEscuela(telefonoEscuela);
        
        //Llamar al modificar alumnos
        this.modicarEscuela(escuel);
        
        //Seteo nuevos datos de familia
        Pariente parien = this.buscarPariente(alum.getUnaFamilia().getId_Familiar());
        
        parien.setNombreFamiliar(nombreFamiliar);
        parien.setDniFamiliar(dniFamiliar);
        parien.setDomicilio(domicilio);
        parien.setTelefonoFamiliar(telefonoFamiliar);
        parien.setOtrosDatos(otrosDatos);
        
        this.modificarPariente(parien);
    }

    private Escuela buscarEscuela(int id_escuela) {
        return controlPersis.traerEscuela(id_escuela);
    }

    private void modicarEscuela(Escuela escuel) {
        controlPersis.modificarEscuela(escuel);
    }

    private Pariente buscarPariente(int id_Familiar) {
        return controlPersis.traerPariente(id_Familiar);
    }

    private void modificarPariente(Pariente parien) {
        controlPersis.modificarPariente(parien);
    }
   
}
