/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author LIPM
 *
 */
public class NodoListas<T>
{
    private T obj;
    private String et;
    private NodoListas sig;
    private NodoListas ant;
    private NodoListas abj;

    public NodoListas(T obj, String et)
    {
        this.obj = obj;
        this.et = et;
        this.sig = null;
        this.ant = null;
        this.abj = null;
    }

    public NodoListas getAbj()
    {
        return abj;
    }

    public void setAbj(NodoListas abj)
    {
        this.abj = abj;
    }
    
    public NodoListas getAnt()
    {
        return ant;
    }

    public void setAnt(NodoListas ant)
    {
        this.ant = ant;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the et
     */
    public String getEt()
    {
        return et;
    }

    /**
     * @param et the et to set
     */
    public void setEt(String et)
    {
        this.et = et;
    }

    /**
     * @return the sig
     */
    public NodoListas getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoListas sig)
    {
        this.sig = sig;
    }

    public String desp()
    {
        return "Etiqueta: " + et;
    }

}
