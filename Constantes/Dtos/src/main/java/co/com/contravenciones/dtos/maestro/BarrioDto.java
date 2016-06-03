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

public class BarrioDto implements Serializable {
    
    
    private Long id;
    
    private Integer codigo;
    
    private String nombre;
    
    private LocalidadDto localidad;

    public BarrioDto() {
    }

    public BarrioDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalidadDto getLocalidad() {
        return localidad;
    }

    public void setLocalidadId(LocalidadDto localidad) {
        this.localidad = localidad;
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
        if (!(object instanceof BarrioDto)) {
            return false;
        }
        BarrioDto other = (BarrioDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.contravenciones.modelo.maestro.Barrio[ id=" + id + " ]";
    }
    
}
