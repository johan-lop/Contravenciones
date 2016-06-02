package co.com.contravenciones.definitions.view.parametros;

import co.com.contravenciones.dtos.seguridad.MenuDto;
import javax.ejb.Local;

/**
 *
 * @author johan
 */
@Local
public interface MenuViewLocal {  
    
    MenuDto generarMenuPorUsuario(Long usuarioId);
    
}
