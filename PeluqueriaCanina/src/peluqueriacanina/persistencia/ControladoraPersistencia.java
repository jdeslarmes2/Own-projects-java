
package peluqueriacanina.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import peluqueriacanina.logica.Duenio;
import peluqueriacanina.logica.Mascota;
import peluqueriacanina.persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Crear en la BD el Dueño
        duenioJpa.create(duenio);
        
        //crear en la BD la mascota
        mascoJpa.create(masco);
    }  

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        
        //Hay que hacer un catch and try para hacer una excepción, ej. si no hay num_cliente en la tabla, por que java no sabe
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
       return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
       return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
