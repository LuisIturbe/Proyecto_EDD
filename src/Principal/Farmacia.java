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
public class Farmacia implements Serializable
{
    private String nombre = null;
    private String clave = null;
    private String tpSociedad = null;
    private String rfc = null;

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the clave
     */
    public String getClave()
    {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave)
    {
        this.clave = clave;
    }

    /**
     * @return the tpSociedad
     */
    public String getTpSociedad()
    {
        return tpSociedad;
    }

    /**
     * @param tpSociedad the tpSociedad to set
     */
    public void setTpSociedad(String tpSociedad)
    {
        this.tpSociedad = tpSociedad;
    }

    /**
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

    @Override
    public String toString()
    {
        return "Farmacia{" + "nombre=" + nombre + ", clave=" + clave + ", tpSociedad=" + tpSociedad + ", rfc=" + rfc + '}';
    }
    
    
}
