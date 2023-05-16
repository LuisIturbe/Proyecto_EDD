/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Liliana
 */
public class ArregloDinamico
{

    private Object arr[];

    public ArregloDinamico()
    {
    }

    public ArregloDinamico(Object[] arr)
    {
        this.arr = arr;
    }

    /**
     * @return the arr
     */
    public Object[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(Object[] arr)
    {
        this.arr = arr;
    }

    public String desp()
    {
        Usuario us;
        String s = "";
        if (arr == null)
        {
            s = "No hay datos" + "\n";
        } else
        {
            for (int i = 0; i < arr.length; i++)
            {
                us = (Usuario)(arr[i]);
                s +="Usuario: " + us.getNombre()+ "\nContraseña: " + us.getContra() + "\n";
            }
        }
        return s;
    }

    public void inserta(Object d)
    {
        if (arr == null)
        {
            arr = new Object[1];
            arr[0] = d;
        } else
        {
            Object tmp[] = new Object[arr.length + 1];
            System.arraycopy(arr, 0, tmp, 0, arr.length);
            tmp[arr.length] = d;
            arr = tmp;
        }
    }

    public boolean busca(String u, String c)
    {
        Usuario us;
        JFrame jf = null;
        if (arr == null)
        {
            JOptionPane.showMessageDialog(jf, "No existen datos", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else
        {
            for (int i = 0; i < arr.length; i++)
            {
                us = (Usuario) arr[i];
                if (us.getNombre().equals(u) && us.getContra().equals(c))
                {
                    return true;
                }
            }
            JOptionPane.showMessageDialog(jf, "No existen coinsidencias", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    //Funcion que busca si el usuario es administrador
    public boolean tipoUser (String u)
    {
        Usuario us;
        for (int i = 0; i < arr.length; i++)
        {
            us = (Usuario) arr[i];
            if (us.getType() == 1)
            {
                return true;
            }
        }
        return false;
    }

    public void elimina(int pos)
    {
        if (pos >= 0)
        {
            if (arr.length == 1 && pos == 0)
            {
                arr = null;
            } else
            {
                Object tmp[] = new Object[arr.length - 1];
                for (int i = 0, j = 0; i < arr.length; i++)
                {
                    if (i != pos)
                    {
                        tmp[j++] = arr[i];
                    }
                }
                arr=tmp;
            }
        }
    }
}
