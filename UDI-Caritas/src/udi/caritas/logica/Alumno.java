
package udi.caritas.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numAlumno;
    private String nombreAlumno;
    private String dni;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SUBMISSION_TIME")
    private Date fechaNacimiento;
    private String docente;
    private String turno;
    @OneToOne
    private Escuela unaEscuela;
    @OneToOne
    private Pariente unaFamilia;
    
    
    public Alumno() {
    }

    public Alumno(int numAlumno, String nombreAlumno, String dni, Date fechaNacimiento, String docente, String turno, Escuela unaEscuela, Pariente unaFamilia) {
        this.numAlumno = numAlumno;
        this.nombreAlumno = nombreAlumno;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.docente = docente;
        this.turno = turno;
        this.unaEscuela = unaEscuela;
        this.unaFamilia = unaFamilia;
    }

    public int getNumAlumno() {
        return numAlumno;
    }

    public void setNumAlumno(int numAlumno) {
        this.numAlumno = numAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Escuela getUnaEscuela() {
        return unaEscuela;
    }

    public void setUnaEscuela(Escuela unaEscuela) {
        this.unaEscuela = unaEscuela;
    }

    public Pariente getUnaFamilia() {
        return unaFamilia;
    }

    public void setUnaFamilia(Pariente unaFamilia) {
        this.unaFamilia = unaFamilia;
    }


}
