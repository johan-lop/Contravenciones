/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.contravenciones.dtos.maestro;

import java.io.Serializable;

/**
 *
 * @author johan
 */

public class ParametroDto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private Integer codigo;
    
    private String descripcion;
    
    private String abreviatura;
    
    private Boolean estado;
    
    private TipoParametroDto tipoParametro;

    public ParametroDto() {
    }

    public ParametroDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public TipoParametroDto getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(TipoParametroDto tipoParametro) {
        this.tipoParametro = tipoParametro;
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
        if (!(object instanceof ParametroDto)) {
            return false;
        }
        ParametroDto other = (ParametroDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.contravenciones.modelo.maestro.Parametro[ id=" + id + " ]";
    }
    
}
