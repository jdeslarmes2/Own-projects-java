package udi.caritas.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import udi.caritas.logica.Escuela;
import udi.caritas.logica.Pariente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-23T01:19:00")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Pariente> unaFamilia;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, Integer> numAlumno;
    public static volatile SingularAttribute<Alumno, String> nombreAlumno;
    public static volatile SingularAttribute<Alumno, String> docente;
    public static volatile SingularAttribute<Alumno, String> turno;
    public static volatile SingularAttribute<Alumno, Escuela> unaEscuela;
    public static volatile SingularAttribute<Alumno, String> dni;

}