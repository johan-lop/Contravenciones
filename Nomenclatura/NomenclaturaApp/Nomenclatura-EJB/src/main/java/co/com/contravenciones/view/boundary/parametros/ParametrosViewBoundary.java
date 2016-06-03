/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.contravenciones.view.boundary.parametros;

import co.com.contravenciones.definitions.view.parametros.ParametrosViewLocal;
import co.com.contravenciones.dtos.maestro.LocalidadDto;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ParametrosViewBoundary implements ParametrosViewLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<LocalidadDto> getLocalidades() {
        return em.createNamedQuery("Localidad.getAll", LocalidadDto.class).getResultList();        
    }
}
