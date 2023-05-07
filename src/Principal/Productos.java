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
public class Productos implements Serializable
{
    private String claveProd = null;
    private String nomProd = null;
    private double precio = 0;
    private int exist = 0;

    /**
     * @return the claveProd
     */
    public String getClaveProd()
    {
        return claveProd;
    }

    /**
     * @param claveProd the claveProd to set
     */
    public void setClaveProd(String claveProd)
    {
        this.claveProd = claveProd;
    }

    /**
     * @return the nomProd
     */
    public String getNomProd()
    {
        return nomProd;
    }

    /**
     * @param nomProd the nomProd to set
     */
    public void setNomProd(String nomProd)
    {
        this.nomProd = nomProd;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the exist
     */
    public int getExist()
    {
        return exist;
    }

    /**
     * @param exist the exist to set
     */
    public void setExist(int exist)
    {
        this.exist = exist;
    }

    @Override
    public String toString()
    {
        return "Productos{" + "claveProd=" + claveProd + ", nomProd=" + nomProd + ", precio=" + precio + ", exist=" + exist + '}';
    }
    
    
}
