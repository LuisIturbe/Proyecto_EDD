/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.Serializable;

/**
 *
 * @author Liliana
 */
public class Ciudades implements Serializable
{
    private String estado = null;
    private String municipio = null;
    private String ciudad = null;

    /**
     * @return the estado
     */
    public String getEstado()
    {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio()
    {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio)
    {
        this.municipio = municipio;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad()
    {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

    @Override
    public String toString()
    {
        return "Ciudades{" + "estado=" + estado + ", municipio=" + municipio + ", ciudad=" + ciudad + '}';
    }
    
    
}
