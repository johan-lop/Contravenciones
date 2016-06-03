/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.contravenciones.dtos.maestro;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author johan
 */

public class TipoParametroDto implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private String nombre;
    
    private Boolean estado;
    
    private List<ParametroDto> parametros;

    public TipoParametroDto() {
    }

    public TipoParametroDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<ParametroDto> getParametros() {
        return parametros;
    }

    public void setParametros(List<ParametroDto> parametros) {
        this.parametros = parametros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoParametroDto)) {
            return false;
        }
        TipoParametroDto other = (TipoParametroDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.contravenciones.modelo.maestro.TipoParametro[ id=" + id + " ]";
    }
    
}
