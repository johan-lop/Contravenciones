package co.com.contravenciones.controller.ubicabilidad;

import co.com.contravenciones.dtos.maestro.LocalidadDto;
import co.com.contravenciones.facade.parametros.ParametrosFacade;
import com.ocpsoft.pretty.faces.annotation.URLMapping;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author johan
 */
@Named
@ViewScoped
@URLMapping(id = "direcciones", pattern = "/nomenclatura/direcciones", viewId = "/nomenclatura/direcciones.page")
public class DireccionesController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    ParametrosFacade parametrosFacade;

    private List<LocalidadDto> localidades;

    @PostConstruct
    public void init() {
        try {
            this.setLocalidades(parametrosFacade.getLocalidades());
        } catch (Exception e) {
            
        }

    }

    /**
     * @return the localidades
     */
    public List<LocalidadDto> getLocalidades() {
        return localidades;
    }

    /**
     * @param localidades the localidades to set
     */
    public void setLocalidades(List<LocalidadDto> localidades) {
        this.localidades = localidades;
    }

    
}
