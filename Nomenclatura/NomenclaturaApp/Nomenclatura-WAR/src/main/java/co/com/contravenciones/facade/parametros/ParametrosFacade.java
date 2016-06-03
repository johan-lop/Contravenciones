package co.com.contravenciones.facade.parametros;

import co.com.contravenciones.definitions.view.parametros.MenuViewLocal;
import co.com.contravenciones.definitions.view.parametros.ParametrosViewLocal;
import co.com.contravenciones.dtos.maestro.LocalidadDto;
import co.com.contravenciones.dtos.seguridad.MenuDto;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 * Fachada de producto.
 * 
 * @author johan
 */

public class ParametrosFacade implements Serializable{

    @EJB
    private MenuViewLocal menuViewLocal;
    
    @EJB
    private ParametrosViewLocal parametrosViewLocal;
    
    public MenuDto generaMenuPorUsuario(final Long id) {
        return this.menuViewLocal.generarMenuPorUsuario(id);
    }
    
    public List<LocalidadDto> getLocalidades() {
        return parametrosViewLocal.getLocalidades();
    }
}
