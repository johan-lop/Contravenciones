package co.com.contravenciones.definitions.view.parametros;

import co.com.contravenciones.dtos.maestro.LocalidadDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author johan
 */
@Local
public interface ParametrosViewLocal {  
    
    List<LocalidadDto> getLocalidades();
    
}
