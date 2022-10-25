
package peluqueriacanina.logica;

import java.util.List;
import peluqueriacanina.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
          
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnduenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {
        
        controlPersis.borrarMascota (num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
      return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, 
            String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        
        //modifico la mascota, por que no puedo desde el objeto persona
        controlPersis.modificarMascota(masco);
        
        //seteo nuevos valores del dueño
        Duenio dueno = this.buscarDuenio(masco.getUnduenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //llamar al modificar Dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }


    
    
    
}
