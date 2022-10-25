package udi.caritas.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pariente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Familiar;
    private String nombreFamiliar;
    private String telefonoFamiliar;
    private String dniFamiliar;
    private String domicilio;
    private String otrosDatos;

    

    public Pariente() {
    }

    public Pariente(int id_Familiar, String nombreFamiliar, String telefonoFamiliar, String dniFamiliar, String domicilio, String otrosDatos) {
        this.id_Familiar = id_Familiar;
        this.nombreFamiliar = nombreFamiliar;
        this.telefonoFamiliar = telefonoFamiliar;
        this.dniFamiliar = dniFamiliar;
        this.domicilio = domicilio;
        this.otrosDatos = otrosDatos;
    }

    public int getId_Familiar() {
        return id_Familiar;
    }

    public void setId_Familiar(int id_Familiar) {
        this.id_Familiar = id_Familiar;
    }

    public String getNombreFamiliar() {
        return nombreFamiliar;
    }

    public void setNombreFamiliar(String nombreFamiliar) {
        this.nombreFamiliar = nombreFamiliar;
    }

    public String getTelefonoFamiliar() {
        return telefonoFamiliar;
    }

    public void setTelefonoFamiliar(String telefonoFamiliar) {
        this.telefonoFamiliar = telefonoFamiliar;
    }

    public String getDniFamiliar() {
        return dniFamiliar;
    }

    public void setDniFamiliar(String dniFamiliar) {
        this.dniFamiliar = dniFamiliar;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getOtrosDatos() {
        return otrosDatos;
    }

    public void setOtrosDatos(String otrosDatos) {
        this.otrosDatos = otrosDatos;
    }


}