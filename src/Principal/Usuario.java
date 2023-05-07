/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Liliana
 */
public class Usuario
{
    private String nombre = null;
    private String contra = null;
    private int type = 0; //0 es para usuario comun, 1 es para administrador

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getContra()
    {
        return contra;
    }

    public void setContra(String contra)
    {
        this.contra = contra;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    /**
     * @return the nombre
     */
    
    
}
