package udi.caritas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Escuela implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_escuela;
    private String escuela;
    private String grado;
    private String telefonoEscuela;
    

    public Escuela() {
    }

    public Escuela(int id_escuela, String escuela, String grado, String telefonoEscuela) {
        this.id_escuela = id_escuela;
        this.escuela = escuela;
        this.grado = grado;
        this.telefonoEscuela = telefonoEscuela;
    }

    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTelefonoEscuela() {
        return telefonoEscuela;
    }

    public void setTelefonoEscuela(String telefonoEscuela) {
        this.telefonoEscuela = telefonoEscuela;
    }

    
}