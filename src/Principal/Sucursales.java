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
public class Sucursales implements Serializable
{
    private String claveSuc = null;
    private String nomSuc = null;
    private String cp = null;

    /**
     * @return the claveSuc
     */
    public String getClaveSuc()
    {
        return claveSuc;
    }

    /**
     * @param claveSuc the claveSuc to set
     */
    public void setClaveSuc(String claveSuc)
    {
        this.claveSuc = claveSuc;
    }

    /**
     * @return the nomSuc
     */
    public String getNomSuc()
    {
        return nomSuc;
    }

    /**
     * @param nomSuc the nomSuc to set
     */
    public void setNomSuc(String nomSuc)
    {
        this.nomSuc = nomSuc;
    }

    /**
     * @return the cp
     */
    public String getCp()
    {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp)
    {
        this.cp = cp;
    }

    @Override
    public String toString()
    {
        return "Sucursales{" + "claveSuc=" + claveSuc + ", nomSuc=" + nomSuc + ", cp=" + cp + '}';
    }
    
    
}
