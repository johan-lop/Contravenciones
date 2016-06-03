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
public class LocalidadDto implements Serializable {
    
    
    private Long id;
    
    private String nombre;
    
    private List<BarrioDto> barrios;

    public LocalidadDto() {
    }

    public LocalidadDto(Long id) {
        this.id = id;
    }

    public LocalidadDto(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public List<BarrioDto> getBarrios() {
        return barrios;
    }

    public void setBarrios(List<BarrioDto> barrios) {
        this.barrios = barrios;
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
        if (!(object instanceof LocalidadDto)) {
            return false;
        }
        LocalidadDto other = (LocalidadDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.contravenciones.modelo.maestro.Localidad[ id=" + id + " ]";
    }
    
}
