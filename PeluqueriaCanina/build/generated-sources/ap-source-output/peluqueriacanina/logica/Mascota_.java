package peluqueriacanina.logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import peluqueriacanina.logica.Duenio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-21T19:27:17")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Integer> num_cliente;
    public static volatile SingularAttribute<Mascota, Duenio> unduenio;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, String> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, String> atencion_especial;
    public static volatile SingularAttribute<Mascota, String> nombre;

}